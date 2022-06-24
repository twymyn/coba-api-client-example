package coba.api.example.client.branchfinder;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * Model of the securities API.
 */
public class Branch {

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("importGroup")
    private String importGroup = null;

    @JsonProperty("nummer")
    private String nummer = null;

    @JsonProperty("orgNummer")
    private String orgNummer = null;

    @JsonProperty("orgTyp")
    private String orgTyp = null;

    @JsonProperty("orgTypName")
    private String orgTypName = null;

    @JsonProperty("orgSpec")
    private String orgSpec = null;

    @JsonProperty("orgSpecName")
    private String orgSpecName = null;

    @JsonProperty("land")
    private String land = null;

    @JsonProperty("bundesland")
    private String bundesland = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("anschriftPostleitzahl")
    private String anschriftPostleitzahl = null;

    @JsonProperty("anschriftOrt")
    private String anschriftOrt = null;

    @JsonProperty("anschriftOrtteil")
    private String anschriftOrtteil = null;

    @JsonProperty("anschriftLand")
    private String anschriftLand = null;

    @JsonProperty("anschriftStrasse")
    private String anschriftStrasse = null;

    @JsonProperty("SWIFT")
    private String SWIFT = null;

    @JsonProperty("postanschriftPostfach")
    private String postanschriftPostfach = null;

    @JsonProperty("postanschriftPostleitzahl")
    private String postanschriftPostleitzahl = null;

    @JsonProperty("postanschriftOrt")
    private String postanschriftOrt = null;

    @JsonProperty("postanschriftLand")
    private String postanschriftLand = null;

    @JsonProperty("postanschriftOrtteil")
    private String postanschriftOrtteil = null;

    @JsonProperty("telefon")
    private String telefon = null;

    @JsonProperty("telefax")
    private String telefax = null;

    @JsonProperty("attribute")
    private String attribute = null;

    @JsonProperty("bankleitzahl")
    private Integer bankleitzahl = null;

    @JsonProperty("kontoauszugsdrucker")
    private Boolean kontoauszugsdrucker = null;

    @JsonProperty("geldautomat")
    private Boolean geldautomat = null;

    @JsonProperty("einzahlautomat")
    private Boolean einzahlautomat = null;

    @JsonProperty("cashin")
    private Boolean cashin = null;

    @JsonProperty("sbTerminal")
    private Boolean sbTerminal = null;

    @JsonProperty("bezeichnung")
    private String bezeichnung = null;

    @JsonProperty("moMorgenVon")
    private String moMorgenVon = null;

    @JsonProperty("moMorgenBis")
    private String moMorgenBis = null;

    @JsonProperty("moNachmiVon")
    private String moNachmiVon = null;

    @JsonProperty("moNachmiBis")
    private String moNachmiBis = null;

    @JsonProperty("diMorgenVon")
    private String diMorgenVon = null;

    @JsonProperty("diMorgenBis")
    private String diMorgenBis = null;

    @JsonProperty("diNachmiVon")
    private String diNachmiVon = null;

    @JsonProperty("diNachmiBis")
    private String diNachmiBis = null;

    @JsonProperty("miMorgenVon")
    private String miMorgenVon = null;

    @JsonProperty("miMorgenBis")
    private String miMorgenBis = null;

    @JsonProperty("miNachmiVon")
    private String miNachmiVon = null;

    @JsonProperty("miNachmiBis")
    private String miNachmiBis = null;

    @JsonProperty("doMorgenVon")
    private String doMorgenVon = null;

    @JsonProperty("doMorgenBis")
    private String doMorgenBis = null;

    @JsonProperty("doNachmiVon")
    private String doNachmiVon = null;

    @JsonProperty("doNachmiBis")
    private String doNachmiBis = null;

    @JsonProperty("frMorgenVon")
    private String frMorgenVon = null;

    @JsonProperty("frMorgenBis")
    private String frMorgenBis = null;

    @JsonProperty("frNachmiVon")
    private String frNachmiVon = null;

    @JsonProperty("frNachmiBis")
    private String frNachmiBis = null;

    @JsonProperty("kasseMoMorgenVon")
    private String kasseMoMorgenVon = null;

    @JsonProperty("kasseMoMorgenBis")
    private String kasseMoMorgenBis = null;

    @JsonProperty("kasseMoNachmiVon")
    private String kasseMoNachmiVon = null;

    @JsonProperty("kasseMoNachmiBis")
    private String kasseMoNachmiBis = null;

    @JsonProperty("kasseDiMorgenVon")
    private String kasseDiMorgenVon = null;

    @JsonProperty("kasseDiMorgenBis")
    private String kasseDiMorgenBis = null;

    @JsonProperty("kasseDiNachmiVon")
    private String kasseDiNachmiVon = null;

    @JsonProperty("kasseDiNachmiBis")
    private String kasseDiNachmiBis = null;

    @JsonProperty("kasseMiMorgenVon")
    private String kasseMiMorgenVon = null;

    @JsonProperty("kasseMiMorgenBis")
    private String kasseMiMorgenBis = null;

    @JsonProperty("kasseMiNachmiVon")
    private String kasseMiNachmiVon = null;

    @JsonProperty("kasseMiNachmiBis")
    private String kasseMiNachmiBis = null;

    @JsonProperty("kasseDoMorgenVon")
    private String kasseDoMorgenVon = null;

    @JsonProperty("kasseDoMorgenBis")
    private String kasseDoMorgenBis = null;

    @JsonProperty("kasseDoNachmiVon")
    private String kasseDoNachmiVon = null;

    @JsonProperty("kasseDoNachmiBis")
    private String kasseDoNachmiBis = null;

    @JsonProperty("kasseFrMorgenVon")
    private String kasseFrMorgenVon = null;

    @JsonProperty("kasseFrMorgenBis")
    private String kasseFrMorgenBis = null;

    @JsonProperty("kasseFrNachmiVon")
    private String kasseFrNachmiVon = null;

    @JsonProperty("kasseFrNachmiBis")
    private String kasseFrNachmiBis = null;

    @JsonProperty("kasseSaMorgenVon")
    private String kasseSaMorgenVon = null;

    @JsonProperty("kasseSaMorgenBis")
    private String kasseSaMorgenBis = null;

    @JsonProperty("kasseSaNachmiVon")
    private String kasseSaNachmiVon = null;

    @JsonProperty("kasseSaNachmiBis")
    private String kasseSaNachmiBis = null;

    @JsonProperty("kasseSoMorgenVon")
    private String kasseSoMorgenVon = null;

    @JsonProperty("kasseSoMorgenBis")
    private String kasseSoMorgenBis = null;

    @JsonProperty("kasseSoNachmiVon")
    private String kasseSoNachmiVon = null;

    @JsonProperty("kasseSoNachmiBis")
    private String kasseSoNachmiBis = null;

    @JsonProperty("kasseFeierMorgenVon")
    private String kasseFeierMorgenVon = null;

    @JsonProperty("kasseFeierMorgenBis")
    private String kasseFeierMorgenBis = null;

    @JsonProperty("kasseFeierNachmiVon")
    private String kasseFeierNachmiVon = null;

    @JsonProperty("kasseFeierNachmiBis")
    private String kasseFeierNachmiBis = null;

    @JsonProperty("cashgroup")
    private Boolean cashgroup = null;

    @JsonProperty("vault")
    private Boolean vault = null;

    @JsonProperty("barriereTyp")
    private String barriereTyp = null;

    @JsonProperty("naechsteFilHB")
    private String naechsteFilHB = null;

    @JsonProperty("beratungsFilHB")
    private String beratungsFilHB = null;

    @JsonProperty("distanceKm")
    private BigDecimal distanceKm = null;

    @JsonProperty("position")
    private List<BigDecimal> position = null;

    @JsonProperty("kasse")
    private Boolean kasse = null;

    @JsonProperty("pkFilial")
    private OrganizationalFilial pkFilial = null;

    @JsonProperty("skbFilial")
    private OrganizationalFilial skbFilial = null;

    @JsonProperty("ukFilial")
    private OrganizationalFilial ukFilial = null;

    @JsonProperty("sukbFilial")
    private OrganizationalFilial sukbFilial = null;

    @JsonProperty("wmFilial")
    private OrganizationalFilial wmFilial = null;

    @JsonProperty("typAFilial")
    private OrganizationalFilial typAFilial = null;

    @JsonProperty("regionalFilial")
    private OrganizationalFilial regionalFilial = null;

    @JsonProperty("niederlassungFilial")
    private OrganizationalFilial niederlassungFilial = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImportGroup() {
        return importGroup;
    }

    public void setImportGroup(String importGroup) {
        this.importGroup = importGroup;
    }

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

    public String getOrgTyp() {
        return orgTyp;
    }

    public void setOrgTyp(String orgTyp) {
        this.orgTyp = orgTyp;
    }

    public String getOrgTypName() {
        return orgTypName;
    }

    public void setOrgTypName(String orgTypName) {
        this.orgTypName = orgTypName;
    }

    public String getOrgSpec() {
        return orgSpec;
    }

    public void setOrgSpec(String orgSpec) {
        this.orgSpec = orgSpec;
    }

    public String getOrgSpecName() {
        return orgSpecName;
    }

    public void setOrgSpecName(String orgSpecName) {
        this.orgSpecName = orgSpecName;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getBundesland() {
        return bundesland;
    }

    public void setBundesland(String bundesland) {
        this.bundesland = bundesland;
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

    public String getAnschriftOrtteil() {
        return anschriftOrtteil;
    }

    public void setAnschriftOrtteil(String anschriftOrtteil) {
        this.anschriftOrtteil = anschriftOrtteil;
    }

    public String getAnschriftLand() {
        return anschriftLand;
    }

    public void setAnschriftLand(String anschriftLand) {
        this.anschriftLand = anschriftLand;
    }

    public String getAnschriftStrasse() {
        return anschriftStrasse;
    }

    public void setAnschriftStrasse(String anschriftStrasse) {
        this.anschriftStrasse = anschriftStrasse;
    }

    public String getSWIFT() {
        return SWIFT;
    }

    public void setSWIFT(String SWIFT) {
        this.SWIFT = SWIFT;
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

    public String getPostanschriftLand() {
        return postanschriftLand;
    }

    public void setPostanschriftLand(String postanschriftLand) {
        this.postanschriftLand = postanschriftLand;
    }

    public String getPostanschriftOrtteil() {
        return postanschriftOrtteil;
    }

    public void setPostanschriftOrtteil(String postanschriftOrtteil) {
        this.postanschriftOrtteil = postanschriftOrtteil;
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

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Integer getBankleitzahl() {
        return bankleitzahl;
    }

    public void setBankleitzahl(Integer bankleitzahl) {
        this.bankleitzahl = bankleitzahl;
    }

    public Boolean getKontoauszugsdrucker() {
        return kontoauszugsdrucker;
    }

    public void setKontoauszugsdrucker(Boolean kontoauszugsdrucker) {
        this.kontoauszugsdrucker = kontoauszugsdrucker;
    }

    public Boolean getGeldautomat() {
        return geldautomat;
    }

    public void setGeldautomat(Boolean geldautomat) {
        this.geldautomat = geldautomat;
    }

    public Boolean getEinzahlautomat() {
        return einzahlautomat;
    }

    public void setEinzahlautomat(Boolean einzahlautomat) {
        this.einzahlautomat = einzahlautomat;
    }

    public Boolean getCashin() {
        return cashin;
    }

    public void setCashin(Boolean cashin) {
        this.cashin = cashin;
    }

    public Boolean getSbTerminal() {
        return sbTerminal;
    }

    public void setSbTerminal(Boolean sbTerminal) {
        this.sbTerminal = sbTerminal;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getMoMorgenVon() {
        return moMorgenVon;
    }

    public void setMoMorgenVon(String moMorgenVon) {
        this.moMorgenVon = moMorgenVon;
    }

    public String getMoMorgenBis() {
        return moMorgenBis;
    }

    public void setMoMorgenBis(String moMorgenBis) {
        this.moMorgenBis = moMorgenBis;
    }

    public String getMoNachmiVon() {
        return moNachmiVon;
    }

    public void setMoNachmiVon(String moNachmiVon) {
        this.moNachmiVon = moNachmiVon;
    }

    public String getMoNachmiBis() {
        return moNachmiBis;
    }

    public void setMoNachmiBis(String moNachmiBis) {
        this.moNachmiBis = moNachmiBis;
    }

    public String getDiMorgenVon() {
        return diMorgenVon;
    }

    public void setDiMorgenVon(String diMorgenVon) {
        this.diMorgenVon = diMorgenVon;
    }

    public String getDiMorgenBis() {
        return diMorgenBis;
    }

    public void setDiMorgenBis(String diMorgenBis) {
        this.diMorgenBis = diMorgenBis;
    }

    public String getDiNachmiVon() {
        return diNachmiVon;
    }

    public void setDiNachmiVon(String diNachmiVon) {
        this.diNachmiVon = diNachmiVon;
    }

    public String getDiNachmiBis() {
        return diNachmiBis;
    }

    public void setDiNachmiBis(String diNachmiBis) {
        this.diNachmiBis = diNachmiBis;
    }

    public String getMiMorgenVon() {
        return miMorgenVon;
    }

    public void setMiMorgenVon(String miMorgenVon) {
        this.miMorgenVon = miMorgenVon;
    }

    public String getMiMorgenBis() {
        return miMorgenBis;
    }

    public void setMiMorgenBis(String miMorgenBis) {
        this.miMorgenBis = miMorgenBis;
    }

    public String getMiNachmiVon() {
        return miNachmiVon;
    }

    public void setMiNachmiVon(String miNachmiVon) {
        this.miNachmiVon = miNachmiVon;
    }

    public String getMiNachmiBis() {
        return miNachmiBis;
    }

    public void setMiNachmiBis(String miNachmiBis) {
        this.miNachmiBis = miNachmiBis;
    }

    public String getDoMorgenVon() {
        return doMorgenVon;
    }

    public void setDoMorgenVon(String doMorgenVon) {
        this.doMorgenVon = doMorgenVon;
    }

    public String getDoMorgenBis() {
        return doMorgenBis;
    }

    public void setDoMorgenBis(String doMorgenBis) {
        this.doMorgenBis = doMorgenBis;
    }

    public String getDoNachmiVon() {
        return doNachmiVon;
    }

    public void setDoNachmiVon(String doNachmiVon) {
        this.doNachmiVon = doNachmiVon;
    }

    public String getDoNachmiBis() {
        return doNachmiBis;
    }

    public void setDoNachmiBis(String doNachmiBis) {
        this.doNachmiBis = doNachmiBis;
    }

    public String getFrMorgenVon() {
        return frMorgenVon;
    }

    public void setFrMorgenVon(String frMorgenVon) {
        this.frMorgenVon = frMorgenVon;
    }

    public String getFrMorgenBis() {
        return frMorgenBis;
    }

    public void setFrMorgenBis(String frMorgenBis) {
        this.frMorgenBis = frMorgenBis;
    }

    public String getFrNachmiVon() {
        return frNachmiVon;
    }

    public void setFrNachmiVon(String frNachmiVon) {
        this.frNachmiVon = frNachmiVon;
    }

    public String getFrNachmiBis() {
        return frNachmiBis;
    }

    public void setFrNachmiBis(String frNachmiBis) {
        this.frNachmiBis = frNachmiBis;
    }

    public String getKasseMoMorgenVon() {
        return kasseMoMorgenVon;
    }

    public void setKasseMoMorgenVon(String kasseMoMorgenVon) {
        this.kasseMoMorgenVon = kasseMoMorgenVon;
    }

    public String getKasseMoMorgenBis() {
        return kasseMoMorgenBis;
    }

    public void setKasseMoMorgenBis(String kasseMoMorgenBis) {
        this.kasseMoMorgenBis = kasseMoMorgenBis;
    }

    public String getKasseMoNachmiVon() {
        return kasseMoNachmiVon;
    }

    public void setKasseMoNachmiVon(String kasseMoNachmiVon) {
        this.kasseMoNachmiVon = kasseMoNachmiVon;
    }

    public String getKasseMoNachmiBis() {
        return kasseMoNachmiBis;
    }

    public void setKasseMoNachmiBis(String kasseMoNachmiBis) {
        this.kasseMoNachmiBis = kasseMoNachmiBis;
    }

    public String getKasseDiMorgenVon() {
        return kasseDiMorgenVon;
    }

    public void setKasseDiMorgenVon(String kasseDiMorgenVon) {
        this.kasseDiMorgenVon = kasseDiMorgenVon;
    }

    public String getKasseDiMorgenBis() {
        return kasseDiMorgenBis;
    }

    public void setKasseDiMorgenBis(String kasseDiMorgenBis) {
        this.kasseDiMorgenBis = kasseDiMorgenBis;
    }

    public String getKasseDiNachmiVon() {
        return kasseDiNachmiVon;
    }

    public void setKasseDiNachmiVon(String kasseDiNachmiVon) {
        this.kasseDiNachmiVon = kasseDiNachmiVon;
    }

    public String getKasseDiNachmiBis() {
        return kasseDiNachmiBis;
    }

    public void setKasseDiNachmiBis(String kasseDiNachmiBis) {
        this.kasseDiNachmiBis = kasseDiNachmiBis;
    }

    public String getKasseMiMorgenVon() {
        return kasseMiMorgenVon;
    }

    public void setKasseMiMorgenVon(String kasseMiMorgenVon) {
        this.kasseMiMorgenVon = kasseMiMorgenVon;
    }

    public String getKasseMiMorgenBis() {
        return kasseMiMorgenBis;
    }

    public void setKasseMiMorgenBis(String kasseMiMorgenBis) {
        this.kasseMiMorgenBis = kasseMiMorgenBis;
    }

    public String getKasseMiNachmiVon() {
        return kasseMiNachmiVon;
    }

    public void setKasseMiNachmiVon(String kasseMiNachmiVon) {
        this.kasseMiNachmiVon = kasseMiNachmiVon;
    }

    public String getKasseMiNachmiBis() {
        return kasseMiNachmiBis;
    }

    public void setKasseMiNachmiBis(String kasseMiNachmiBis) {
        this.kasseMiNachmiBis = kasseMiNachmiBis;
    }

    public String getKasseDoMorgenVon() {
        return kasseDoMorgenVon;
    }

    public void setKasseDoMorgenVon(String kasseDoMorgenVon) {
        this.kasseDoMorgenVon = kasseDoMorgenVon;
    }

    public String getKasseDoMorgenBis() {
        return kasseDoMorgenBis;
    }

    public void setKasseDoMorgenBis(String kasseDoMorgenBis) {
        this.kasseDoMorgenBis = kasseDoMorgenBis;
    }

    public String getKasseDoNachmiVon() {
        return kasseDoNachmiVon;
    }

    public void setKasseDoNachmiVon(String kasseDoNachmiVon) {
        this.kasseDoNachmiVon = kasseDoNachmiVon;
    }

    public String getKasseDoNachmiBis() {
        return kasseDoNachmiBis;
    }

    public void setKasseDoNachmiBis(String kasseDoNachmiBis) {
        this.kasseDoNachmiBis = kasseDoNachmiBis;
    }

    public String getKasseFrMorgenVon() {
        return kasseFrMorgenVon;
    }

    public void setKasseFrMorgenVon(String kasseFrMorgenVon) {
        this.kasseFrMorgenVon = kasseFrMorgenVon;
    }

    public String getKasseFrMorgenBis() {
        return kasseFrMorgenBis;
    }

    public void setKasseFrMorgenBis(String kasseFrMorgenBis) {
        this.kasseFrMorgenBis = kasseFrMorgenBis;
    }

    public String getKasseFrNachmiVon() {
        return kasseFrNachmiVon;
    }

    public void setKasseFrNachmiVon(String kasseFrNachmiVon) {
        this.kasseFrNachmiVon = kasseFrNachmiVon;
    }

    public String getKasseFrNachmiBis() {
        return kasseFrNachmiBis;
    }

    public void setKasseFrNachmiBis(String kasseFrNachmiBis) {
        this.kasseFrNachmiBis = kasseFrNachmiBis;
    }

    public String getKasseSaMorgenVon() {
        return kasseSaMorgenVon;
    }

    public void setKasseSaMorgenVon(String kasseSaMorgenVon) {
        this.kasseSaMorgenVon = kasseSaMorgenVon;
    }

    public String getKasseSaMorgenBis() {
        return kasseSaMorgenBis;
    }

    public void setKasseSaMorgenBis(String kasseSaMorgenBis) {
        this.kasseSaMorgenBis = kasseSaMorgenBis;
    }

    public String getKasseSaNachmiVon() {
        return kasseSaNachmiVon;
    }

    public void setKasseSaNachmiVon(String kasseSaNachmiVon) {
        this.kasseSaNachmiVon = kasseSaNachmiVon;
    }

    public String getKasseSaNachmiBis() {
        return kasseSaNachmiBis;
    }

    public void setKasseSaNachmiBis(String kasseSaNachmiBis) {
        this.kasseSaNachmiBis = kasseSaNachmiBis;
    }

    public String getKasseSoMorgenVon() {
        return kasseSoMorgenVon;
    }

    public void setKasseSoMorgenVon(String kasseSoMorgenVon) {
        this.kasseSoMorgenVon = kasseSoMorgenVon;
    }

    public String getKasseSoMorgenBis() {
        return kasseSoMorgenBis;
    }

    public void setKasseSoMorgenBis(String kasseSoMorgenBis) {
        this.kasseSoMorgenBis = kasseSoMorgenBis;
    }

    public String getKasseSoNachmiVon() {
        return kasseSoNachmiVon;
    }

    public void setKasseSoNachmiVon(String kasseSoNachmiVon) {
        this.kasseSoNachmiVon = kasseSoNachmiVon;
    }

    public String getKasseSoNachmiBis() {
        return kasseSoNachmiBis;
    }

    public void setKasseSoNachmiBis(String kasseSoNachmiBis) {
        this.kasseSoNachmiBis = kasseSoNachmiBis;
    }

    public String getKasseFeierMorgenVon() {
        return kasseFeierMorgenVon;
    }

    public void setKasseFeierMorgenVon(String kasseFeierMorgenVon) {
        this.kasseFeierMorgenVon = kasseFeierMorgenVon;
    }

    public String getKasseFeierMorgenBis() {
        return kasseFeierMorgenBis;
    }

    public void setKasseFeierMorgenBis(String kasseFeierMorgenBis) {
        this.kasseFeierMorgenBis = kasseFeierMorgenBis;
    }

    public String getKasseFeierNachmiVon() {
        return kasseFeierNachmiVon;
    }

    public void setKasseFeierNachmiVon(String kasseFeierNachmiVon) {
        this.kasseFeierNachmiVon = kasseFeierNachmiVon;
    }

    public String getKasseFeierNachmiBis() {
        return kasseFeierNachmiBis;
    }

    public void setKasseFeierNachmiBis(String kasseFeierNachmiBis) {
        this.kasseFeierNachmiBis = kasseFeierNachmiBis;
    }

    public Boolean getCashgroup() {
        return cashgroup;
    }

    public void setCashgroup(Boolean cashgroup) {
        this.cashgroup = cashgroup;
    }

    public Boolean getVault() {
        return vault;
    }

    public void setVault(Boolean vault) {
        this.vault = vault;
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

    public BigDecimal getDistanceKm() {
        return distanceKm;
    }

    public void setDistanceKm(BigDecimal distanceKm) {
        this.distanceKm = distanceKm;
    }

    public List<BigDecimal> getPosition() {
        return position;
    }

    public void setPosition(List<BigDecimal> position) {
        this.position = position;
    }

    public Boolean getKasse() {
        return kasse;
    }

    public void setKasse(Boolean kasse) {
        this.kasse = kasse;
    }

    public OrganizationalFilial getPkFilial() {
        return pkFilial;
    }

    public void setPkFilial(OrganizationalFilial pkFilial) {
        this.pkFilial = pkFilial;
    }

    public OrganizationalFilial getSkbFilial() {
        return skbFilial;
    }

    public void setSkbFilial(OrganizationalFilial skbFilial) {
        this.skbFilial = skbFilial;
    }

    public OrganizationalFilial getUkFilial() {
        return ukFilial;
    }

    public void setUkFilial(OrganizationalFilial ukFilial) {
        this.ukFilial = ukFilial;
    }

    public OrganizationalFilial getSukbFilial() {
        return sukbFilial;
    }

    public void setSukbFilial(OrganizationalFilial sukbFilial) {
        this.sukbFilial = sukbFilial;
    }

    public OrganizationalFilial getWmFilial() {
        return wmFilial;
    }

    public void setWmFilial(OrganizationalFilial wmFilial) {
        this.wmFilial = wmFilial;
    }

    public OrganizationalFilial getTypAFilial() {
        return typAFilial;
    }

    public void setTypAFilial(OrganizationalFilial typAFilial) {
        this.typAFilial = typAFilial;
    }

    public OrganizationalFilial getRegionalFilial() {
        return regionalFilial;
    }

    public void setRegionalFilial(OrganizationalFilial regionalFilial) {
        this.regionalFilial = regionalFilial;
    }

    public OrganizationalFilial getNiederlassungFilial() {
        return niederlassungFilial;
    }

    public void setNiederlassungFilial(OrganizationalFilial niederlassungFilial) {
        this.niederlassungFilial = niederlassungFilial;
    }
}
