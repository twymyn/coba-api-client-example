package coba.api.example.client.examples;

import coba.api.example.client.branchfinder.Branch;
import coba.api.example.client.branchfinder.BranchFinderWebClient;
import coba.api.example.client.cli.CliParameters;
import coba.api.example.client.util.JsonUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Example call against the branch finder API.
 *
 * For API with only a API key or API key + secret is required,
 * it is enough to provide the credentials as HTTP header.
 *
 * The following steps are included here:
 * Step 1: Use the api key to call the branch finder API
 */
@Component
public class BranchFinderExample {

    @Autowired
    private CliParameters cliParameters;

    @Autowired
    private BranchFinderWebClient branchFinderWebClient;

    public void start() throws JsonProcessingException {
        System.out.println("Request Branch Finder API");

        // Step 1: Use the api key to call the branch finder API
        List<Branch> response = branchFinderWebClient.searchByCityStreet("Aachen", "Breslauer Strasse 35");

        System.out.println("Receive response:\n" + JsonUtil.toPrettyJson(response));
    }
}
