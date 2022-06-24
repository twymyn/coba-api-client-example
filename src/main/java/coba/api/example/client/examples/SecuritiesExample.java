package coba.api.example.client.examples;

import coba.api.example.client.cli.CliParameters;
import coba.api.example.client.oauth.AuthorizationCode;
import coba.api.example.client.oauth.OAuthResponse;
import coba.api.example.client.oauth.OAuthResponseController;
import coba.api.example.client.oauth.OAuthWebClient;
import coba.api.example.client.securities.SecuritiesWebClient;
import coba.api.example.client.securities.SecurityAccountsResponse;
import coba.api.example.client.util.JsonUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Example call against the securities API.
 *
 * This example illustrates the complex case where client OAuth authentication is required.
 *
 * The following steps are included here:
 * Step 1: Open the login page in a browser
 * Step 2: Receive the authorization code via the redirect
 * Step 3: Get the access token with the authorization code
 * Step 4: Use the access token to call the API
 */
@Component
public class SecuritiesExample {
    private static final String SANDBOX_AUTH_URL = "https://api-sandbox.commerzbank.com/auth/realms/sandbox/protocol/openid-connect/auth";

    @Autowired
    private CliParameters cliParameters;

    @Autowired
    private OAuthResponseController responseController;

    @Autowired
    private SecuritiesWebClient securitiesWebClient;

    @Autowired
    @Qualifier("oAuthWebClientExternalSandbox")
    private OAuthWebClient oAuthWebClient;

    public void start() throws JsonProcessingException {
        System.out.println("Starting example calling securities API.");
        System.out.println("Make sure to create an OAuth credentials with a redirect URL 'http://localhost:5000/login/oauth2/code/commerz'");

        // Step 1: Open the browser
        System.out.println("Visit the login page and use username:'1234567890' and password:'12345'");
        System.out.println(SANDBOX_AUTH_URL + "?response_type=code&client_id=" + cliParameters.getClientId() + "&redirect_uri=http://localhost:5000/login/oauth2/code/commerz");


        // Step 2: Receive the authorization code
        AuthorizationCode authorizationCode = responseController.getResponse(5, TimeUnit.MINUTES);

        // Step 3: Request the access token
        OAuthResponse oAuthResponse = oAuthWebClient.requestAccessTokenWithAuthCode(authorizationCode.getCode(), "http://localhost:5000/login/oauth2/code/commerz");
        System.out.println("Receive access token:\n" + JsonUtil.toPrettyJson(oAuthResponse));

        // Step 4: Calling the API
        System.out.println("Now calling securities API. GET /security-accounts");
        SecurityAccountsResponse allAccounts = securitiesWebClient.getAllAccounts(oAuthResponse.getAccessToken());
        System.out.println("Receive response:\n" + JsonUtil.toPrettyJson(allAccounts));

        System.out.println("Now calling assets API. GET /security-accounts/blabla/assets");
        String assets = securitiesWebClient.getAssets(oAuthResponse.getAccessToken());
        System.out.println("Receive response:\n" + assets);
    }

}
