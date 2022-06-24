package coba.api.example.client.branchfinder;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * Model of the securities API.
 */
public class OrganizationalFilial {
    @JsonProperty("nummer")
    private String nummer = null;

    @JsonProperty("orgNummer")
    private String orgNummer = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("anschriftPostleitzahl")
    private String anschriftPostleitzahl = null;

    @JsonProperty("anschriftOrt")
    private String anschriftOrt = null;

    @JsonProperty("anschriftStrasse")
    private String anschriftStrasse = null;

    @JsonProperty("postanschriftPostfach")
    private String postanschriftPostfach = null;

    @JsonProperty("postanschriftPostleitzahl")
    private String postanschriftPostleitzahl = null;

    @JsonProperty("postanschriftOrt")
    private String postanschriftOrt = null;

    @JsonProperty("telefon")
    private String telefon = null;

    @JsonProperty("telefax")
    private String telefax = null;

    @JsonProperty("barriereTyp")
    private String barriereTyp = null;

    @JsonProperty("naechsteFilHB")
    private String naechsteFilHB = null;

    @JsonProperty("beratungsFilHB")
    private String beratungsFilHB = null;

    @JsonProperty("position")
    private List<BigDecimal> position = null;

    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    public String getOrgNummer() {
        return orgNummer;
    }

    public void setOrgNummer(String orgNummer) {
        this.orgNummer = orgNummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnschriftPostleitzahl() {
        return anschriftPostleitzahl;
    }

    public void setAnschriftPostleitzahl(String anschriftPostleitzahl) {
        this.anschriftPostleitzahl = anschriftPostleitzahl;
    }

    public String getAnschriftOrt() {
        return anschriftOrt;
    }

    public void setAnschriftOrt(String anschriftOrt) {
        this.anschriftOrt = anschriftOrt;
    }

    public String getAnschriftStrasse() {
        return anschriftStrasse;
    }

    public void setAnschriftStrasse(String anschriftStrasse) {
        this.anschriftStrasse = anschriftStrasse;
    }

    public String getPostanschriftPostfach() {
        return postanschriftPostfach;
    }

    public void setPostanschriftPostfach(String postanschriftPostfach) {
        this.postanschriftPostfach = postanschriftPostfach;
    }

    public String getPostanschriftPostleitzahl() {
        return postanschriftPostleitzahl;
    }

    public void setPostanschriftPostleitzahl(String postanschriftPostleitzahl) {
        this.postanschriftPostleitzahl = postanschriftPostleitzahl;
    }

    public String getPostanschriftOrt() {
        return postanschriftOrt;
    }

    public void setPostanschriftOrt(String postanschriftOrt) {
        this.postanschriftOrt = postanschriftOrt;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getTelefax() {
        return telefax;
    }

    public void setTelefax(String telefax) {
        this.telefax = telefax;
    }

    public String getBarriereTyp() {
        return barriereTyp;
    }

    public void setBarriereTyp(String barriereTyp) {
        this.barriereTyp = barriereTyp;
    }

    public String getNaechsteFilHB() {
        return naechsteFilHB;
    }

    public void setNaechsteFilHB(String naechsteFilHB) {
        this.naechsteFilHB = naechsteFilHB;
    }

    public String getBeratungsFilHB() {
        return beratungsFilHB;
    }

    public void setBeratungsFilHB(String beratungsFilHB) {
        this.beratungsFilHB = beratungsFilHB;
    }

    public List<BigDecimal> getPosition() {
        return position;
    }

    public void setPosition(List<BigDecimal> position) {
        this.position = position;
    }
}
