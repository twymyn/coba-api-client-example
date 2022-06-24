# Example Client for the CoBa API

## Requirements
* JDK 8 or newer
* Maven

## Build

You can build the client via maven:
```
mvn clean package
```

## Usage

### From command line
Just start the Jar file from the command line:
```
java -jar target/client.jar 
```

You also can use parameters to preconfigure or override configurations:
```
java -jar target/client.jar --clientId <your-client-id> --secret <your-secret>
```

### From IDE
Use the `coba.api.example.client.ClientApplication` to run the main method.

### Example Branch Finder
The following example does a call against the barnch finder API:
```
java -jar target/client.jar --example branch-finder --apiKey <your-api-key>
```

### Example Securities
The following example does a call against the securities API:
```
java -jar target/client.jar --example securities --clientId <your-client-id> --secret <your-secret>
```

### Example Token Refresh
The following example does a refresh of an access token:
```
java -jar target/client.jar --example token-refresh --clientId <your-client-id> --secret <your-secret>
```

### Preconfigure parameters
Optional it is possible to set the parameters in the `src/main/resources/application.properties` file.
Program arguments will overwrite these parameters from the `application.properties`.


### Available parameters:
| Parameter | Description | Example |
| -------- | -------- | -------- |
| example.clientId   | The client id from the OAuth credentials   |  a1a1a1a-b2b2-c3c3-d4d4-e5e5e5e5e5e5  |
| example.secret   | The secret from the OAuth credentials   |  f6f6f6f6-g7g7g-h8h8-i9i9i9i9i9i9  |
| example.apiKey   | The API key from the API Keys section  |  a1a1a1a1-b2b2-c3c3-d4d4-e5e5e5e5e5e5   |
| example.type   | Define which example API will be used. Valid values are: branch-finder, securities, token-refresh   |  branch-finder   |
| example.insecure   | If insecure is set, the validation of the server certificate from the HTTPS connection will be skipped   |  true   |


## Points of interest

### Request access token
The class `coba.api.example.client.oauth.OAuthWebClient` contains the logic to get an access token.
Important for the calls against the endpoint authorization server is that they are sent as `application/x-www-form-urlencoded`.
The query parameters `code` and `refresh_token` are optional and are only needed for certain requests.
The query parameters `grant_type`, `client_id` and `client_secret` are mandatory for every request.

### Receive authorization code (Authorization Method: oauth-authorizationcode)
The class `coba.api.example.client.oauth.OAuthResponseController` contains the logic to receive the authorization code.
It contains a controller endpoint `/callback`. Since the server is started locally on port 8080, 
the endpoint `http://localhost:8080/callback` can be called locally.
After a user has successfully logged in, he will be redirected to `http://localhost:8080/callback?code=<code>&session_state=<session>`. 
The controller then reads the `code` and the `session_state` parameter.
It is important that the redirect URL in OAuth credentials is `http://localhost:8080/callback`.

### Call the API (example branch finder API)
The example branch Finder is an example of how to make a call against the API.
The class that makes the call is `coba.api.example.client.branchfinder.BranchFinderWebClient`.
The implementation uses the WebClient, but any other HTTP client can also be used.
For the mapping from JSON to Java classes Jackson is used.

### Request sequences
The sequences of the individual examples can be found in these classes:
* `coba.api.example.client.examples.BranchFinderExample`
* `coba.api.example.client.examples.OAuthTokenRefreshExample`
* `coba.api.example.client.examples.SecuritiesExample`

These contain the individual steps for successfully calling the API.

## Troubleshooting

### Enable logging
If the example does not start, activate more logging. In the `application.properties`, you can simply change the line `logging.level.root=warn`.

### General SSLEngine problem: unable to find valid certification path to requested target
This can happened, if your java client do not trust the server certificate. A possible solution is to add the CA certificate of the server certificate into your own Java truststore.
An easy and fast solution is to use the parameter `--insecure`. This will disable the certificate validation.
**Disabling the certificate validation should never be done in a production environment!**