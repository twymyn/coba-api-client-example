package coba.api.example.client.oauth;

import coba.api.example.client.cli.CliParameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OAuthWebClientConfiguration {

    /**
     * Creates a bean to request access token from the sandbox environment.
     */
    @Bean
    public OAuthWebClient oAuthWebClientExternalSandbox(@Autowired CliParameters cliParameters) {
        return new OAuthWebClient(
                cliParameters,
                "https://api-sandbox.commerzbank.com",
                "/auth/realms/sandbox/protocol/openid-connect/token");
    }
}
