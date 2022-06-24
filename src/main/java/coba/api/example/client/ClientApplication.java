package coba.api.example.client;

import coba.api.example.client.cli.CliParameters;
import coba.api.example.client.examples.BranchFinderExample;
import coba.api.example.client.examples.OAuthTokenRefreshExample;
import coba.api.example.client.examples.SecuritiesExample;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class to start the examples.
 * Only one example can be executed at a time.
 */
@SpringBootApplication
public class ClientApplication implements CommandLineRunner	 {

	@Autowired
	private CliParameters cliParameters;

	@Autowired
	private SecuritiesExample securitiesExample;

	@Autowired
	private BranchFinderExample branchFinderExample;

	@Autowired
	private OAuthTokenRefreshExample oAuthTokenRefreshExample;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ClientApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args).close();
	}

	@Override
	public void run(String... args) throws JsonProcessingException {
		cliParameters.init(args);
		cliParameters.readMissingParametersFromStdIn();

		switch (cliParameters.getExample()) {
			case SECURITIES:
				securitiesExample.start();
				break;
			case BRANCH_FINDER:
				branchFinderExample.start();
				break;
			case TOKEN_REFRESH:
				oAuthTokenRefreshExample.start();
				break;
			default:
				System.out.println("Unknown example");
		}
	}
}
