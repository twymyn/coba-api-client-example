package coba.api.example.client.oauth;

/**
 * POJO which represents the response from the OAuth login process.
 */
public class AuthorizationCode {
    private String code;
    private String sessionState;

    public AuthorizationCode(String code, String sessionState) {
        this.code = code;
        this.sessionState = sessionState;
    }

    public String getCode() {
        return code;
    }

    public String getSessionState() {
        return sessionState;
    }
}
