package coba.api.example.client.securities;

import coba.api.example.client.cli.CliParameters;
import coba.api.example.client.util.WebClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import javax.annotation.PostConstruct;

/**
 * Client to speak with the securities API.
 *
 * This example uses the {@link WebClient}.
 * The call can also be made with any other HTTP client.
 */
@Component
public class SecuritiesWebClient {

    @Autowired
    private CliParameters cliParameters;

    public SecurityAccountsResponse getAllAccounts(String accessToken) {
        WebClient client = WebClientUtil.builder(cliParameters)
                .baseUrl("https://api-sandbox.commerzbank.com/securities-api/v3")         // Set base url
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)  // Set default content type to JSON
                .build();

        return client.get()                                                 // Use HTTP verb GET
                .uri("/security-accounts")                                  // Use endpoint to request all security accounts
                .headers(headers -> headers.setBearerAuth(accessToken))     // Sets the HTTP header Authorization: Bearer <token>
                .retrieve()
                .bodyToMono(SecurityAccountsResponse.class)                 // Map JSON response to a Java object
                .block();
    }


    public String getAssets(String accessToken) {
        WebClient client = WebClientUtil.builder(cliParameters)
                .baseUrl("https://api-sandbox.commerzbank.com/securities-api/v3")         // Set base url
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)  // Set default content type to JSON
                .build();

        return client.get()                                                 // Use HTTP verb GET
                .uri("/security-accounts/100123456711/assets")                                  // Use endpoint to request all security accounts
                .headers(headers -> headers.setBearerAuth(accessToken))     // Sets the HTTP header Authorization: Bearer <token>
                .retrieve()
                .bodyToMono(String.class) // Map JSON response to a Java object
                .block();
    }

}
