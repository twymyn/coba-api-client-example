package coba.api.example.client.examples;

import coba.api.example.client.oauth.OAuthResponse;
import coba.api.example.client.oauth.OAuthWebClient;
import coba.api.example.client.util.JsonUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Example to refresh an access token..
 *
 * This example illustrates how to refresh an access token via the refresh token.
 * This can be useful if you need to authenticate via client OAuth authentication.
 *
 *
 * The following steps are included here:
 * Step 1: Get first access token
 * Step 2: Refresh the access token with the refresh token
 */
@Component
public class OAuthTokenRefreshExample {

    @Autowired
    @Qualifier("oAuthWebClientExternalSandbox")
    private OAuthWebClient oAuthWebClient;

    public void start() throws JsonProcessingException {

        // Step 1: Request the access token
        OAuthResponse oAuthResponse = oAuthWebClient.requestAccessTokenWithClientCredentials();
        System.out.println("Receive access token:\n" + JsonUtil.toPrettyJson(oAuthResponse));

        System.out.println("Your access token expires in " + oAuthResponse.getExpiresIn() + " seconds.");
        System.out.println("Your refresh token expires in " + oAuthResponse.getRefreshExpiresIn() + " seconds.");

        // Step 2: Request a new access token with the refresh token
        // Normally you only need this, if your access token is expired and your refresh token is still valid
        // If need, the token can be renewed continuously (e.g. every 1700 seconds, if the token is 1800 seconds valid)
        OAuthResponse oAuthRefreshResponse = oAuthWebClient.refreshAccessToken(oAuthResponse.getRefreshToken());
        System.out.println("Receive refreshed access token:\n" + JsonUtil.toPrettyJson(oAuthRefreshResponse));
    }
}
