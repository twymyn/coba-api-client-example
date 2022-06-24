package coba.api.example.client.oauth;

import coba.api.example.client.cli.CliParameters;
import coba.api.example.client.util.WebClientUtil;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;


/**
 * Handle requests against the authorization endpoint.
 * Main task is to get an access token.
 */
public class OAuthWebClient {

    private CliParameters cliParameters;
    private String baseUrl;
    private String uri;

    public OAuthWebClient(CliParameters cliParameters, String baseUrl, String uri) {
        this.cliParameters = cliParameters;
        this.baseUrl = baseUrl;
        this.uri = uri;
    }

    /**
     * Request a new access token based on the refresh token.
     *
     * @param refreshToken Valid refresh token.
     * @return OAuth response with a refreshed access token.
     */
    public OAuthResponse refreshAccessToken(String refreshToken) {
        return requestAccessToken(null, refreshToken, GrantType.REFRESH_TOKEN, null);
    }

    /**
     * Request a access token with a code, which was return form a oauth client login.
     *
     * @param code Valid code return from an oauth login.
     * @param code Valid redirectUri used by your oauth credentials.
     * @return OAuth response with a access token.
     */
    public OAuthResponse requestAccessTokenWithAuthCode(String code, String redirectUri) {
        return requestAccessToken(code, null, GrantType.AUTHORIZATION_CODE, redirectUri);
    }


    /**
     * Request a access token only based on the client id and secret.
     *
     * @return OAuth response with a access token.
     */
    public OAuthResponse requestAccessTokenWithClientCredentials() {
        return requestAccessToken(null, null, GrantType.CLIENT_CREDENTIALS, null);
    }

    private OAuthResponse requestAccessToken(String code, String refreshToken, GrantType grantType, String redirectUri) {
        WebClient client = WebClientUtil.builder(cliParameters)
                .baseUrl(baseUrl)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_FORM_URLENCODED_VALUE)
                .build();

        return client.post()                                                        // Use HTTP verb POST
                .uri(uri)                                                           // Use endpoint Authorization server
                .body(createBody(code, refreshToken, grantType, redirectUri))
                .retrieve()
                .bodyToMono(OAuthResponse.class)                                    // Map JSON response to a Java object
                .onErrorMap(e -> new RuntimeException("Error requesting access token.", e))
                .block();
    }

    private BodyInserters.FormInserter<String> createBody(
            String code, String refreshToken, GrantType grantType, String redirectUri) {

        BodyInserters.FormInserter<String> body = BodyInserters
                .fromFormData("grant_type", grantType.getParameterValue())  // Set form data grant_type
                .with("client_id", cliParameters.getClientId())             // Set form data client_id
                .with("client_secret", cliParameters.getSecret());          // Set form data client_secret

        if (!StringUtils.isEmpty(code)) {                                   // Set optional form data code
            body = body.with("code", code);
        }

        if (!StringUtils.isEmpty(refreshToken)) {                           // Set optional form data refresh_token
            body = body.with("refresh_token", refreshToken);
        }

        if (!StringUtils.isEmpty(redirectUri)) {                               // Set optional form data redirectUri
            body = body.with("redirect_uri", redirectUri);
        }

        return body;
    }
}
