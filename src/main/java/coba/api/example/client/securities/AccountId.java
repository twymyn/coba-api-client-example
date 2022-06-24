package coba.api.example.client.securities;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model of the securities API.
 */
public class AccountId {

    @JsonProperty("securityAccountId")
    private String securityAccountId;

    @JsonProperty("pseudonymizedAccountId")
    private String pseudonymizedAccountId;

    public String getSecurityAccountId() {
        return securityAccountId;
    }

    public void setSecurityAccountId(String securityAccountId) {
        this.securityAccountId = securityAccountId;
    }

    public String getPseudonymizedAccountId() {
        return pseudonymizedAccountId;
    }

    public void setPseudonymizedAccountId(String pseudonymizedAccountId) {
        this.pseudonymizedAccountId = pseudonymizedAccountId;
    }
}
