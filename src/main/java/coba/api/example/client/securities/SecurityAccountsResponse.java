package coba.api.example.client.securities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Model of the securities API.
 */
public class SecurityAccountsResponse {

    @JsonProperty("securityAccountIDs")
    private List<AccountId> securityAccountIDs;

    public List<AccountId> getSecurityAccountIDs() {
        return securityAccountIDs;
    }

    public void setSecurityAccountIDs(List<AccountId> securityAccountIDs) {
        this.securityAccountIDs = securityAccountIDs;
    }
}
