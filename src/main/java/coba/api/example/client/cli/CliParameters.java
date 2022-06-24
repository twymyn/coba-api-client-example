package coba.api.example.client.cli;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Scanner;

/**
 * Initiate parameters with input from the command line.
 *
 * Parameters can be passed via arguments or by direct input in the console.
 */
@Component
public class CliParameters {

    @Value("${example.client-id:}")
    private String clientId = null;
    @Value("${example.secret:}")
    private String secret = null;
    @Value("${example.api-key:}")
    private String apiKey = null;
    @Value("${example.insecure:}")
    private boolean isInsecure = false;
    @Value("${example.type:#{null}}")
    private Example example = null;

    /**
     * Parse the arguments, which was passed to the application.
     *
     * @param args Arguments with which the application was started
     */
    public void init(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String parameterName = args[i];

            switch (parameterName) {
                case "--clientId":
                    i++;
                    clientId = args[i];
                    break;
                case "--secret":
                    i++;
                    secret = args[i];
                    break;
                case "--apiKey":
                    i++;
                    apiKey = args[i];
                    break;
                case "--example":
                    i++;
                    example = Example.getByCliName(args[i]);
                    break;
                case "--insecure":
                    isInsecure = true;
                    break;
                default:
                    System.out.println("Unknown parameter " + parameterName);
            }
        }
    }

    /**
     * Read missing parameters, which where missing from the application arguments.
     * The missing parameters depends on the example, which will be run.
     */
    public void readMissingParametersFromStdIn() {
        Scanner scanner = new Scanner(System.in);

        if (example == null) {
            System.out.print("Enter the example, which will be started (valid values are: " + Example.cliNamesToString() + "): ");
            example = Example.getByCliName(scanner.nextLine());

            if (example == null) {
                System.out.println("Invalid example value!");
                readMissingParametersFromStdIn();
            }
        }

        if (example == Example.BRANCH_FINDER) {
            if (StringUtils.isEmpty(apiKey)) {
                System.out.print("Enter your ApiKey: ");
                apiKey = scanner.nextLine();
            }
        }

        if (example == Example.SECURITIES || example == Example.TOKEN_REFRESH) {
            if (StringUtils.isEmpty(clientId)) {
                System.out.print("Enter your Client Id: ");
                clientId = scanner.nextLine();
            }

            if (StringUtils.isEmpty(secret)) {
                System.out.print("Enter your Secret: ");
                secret = scanner.nextLine();
            }
        }
    }

    public String getClientId() {
        return clientId;
    }

    public String getSecret() {
        return secret;
    }

    public String getApiKey() {
        return apiKey;
    }

    public Example getExample() {
        return example;
    }

    public boolean isInsecure() {
        return isInsecure;
    }
}
