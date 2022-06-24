package coba.api.example.client.branchfinder;

import coba.api.example.client.cli.CliParameters;
import coba.api.example.client.util.WebClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Client to speak with the branch finder API.
 *
 * This example uses the {@link WebClient}.
 * The call can also be made with any other HTTP client.
 */
@Component
public class BranchFinderWebClient {

    @Autowired
    private CliParameters cliParameters;

    public List<Branch> searchByCityStreet(String city, String street) {
        WebClient client = WebClientUtil.builder(cliParameters)
                .baseUrl("https://api-sandbox.commerzbank.com/branches-api/1/v1-s")         // Set base url
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)  // Set default content type to JSON
                .build();

        return client.get()                                                             // Use HTTP verb GET
                .uri(uriBuilder -> uriBuilder
                        .path("/branches/geo-search/city_street")                       // Use endpoint to find branches
                        .queryParam("city", city)                                       // Set URL query parameter city
                        .queryParam("street", street)                                   // Set URL query parameter street
                        .queryParam("type", "P")                                        // Set URL query parameter type
                        .build())
                .headers(headers -> headers.set("KeyId", cliParameters.getApiKey()))    // Set HTTP header KeyId: <key>
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Branch>>() {})          // Map JSON response to a Java object
                .block();
    }
}
