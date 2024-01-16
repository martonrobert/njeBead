package hu.nje.njebead.models;

public class Player {

    private int id;
    private int klubid;
    private String csapatnev;
    private String vezeteknev;
    private String utonev;
    private String szulido;
    private int posztid;
    private String poszt_nev;
    private int mezszam;
    private int ertek;
    private boolean kulfoldi;
    private boolean magyar;

    public Player(int id, int klubid, String csapatnev, String vezeteknev, String utonev, String szulido, int posztid, String poszt_nev, int mezszam, int ertek, boolean kulfoldi, boolean magyar) {
        this.id = id;
        this.klubid = klubid;
        this.csapatnev = csapatnev;
        this.vezeteknev = vezeteknev;
        this.utonev = utonev;
        this.szulido = szulido;
        this.posztid = posztid;
        this.poszt_nev = poszt_nev;
        this.mezszam = mezszam;
        this.ertek = ertek;
        this.kulfoldi = kulfoldi;
        this.magyar = magyar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKlubid() {
        return klubid;
    }

    public void setKlubid(int klubid) {
        this.klubid = klubid;
    }

    public String getCsapatnev() {
        return csapatnev;
    }

    public void setCsapatnev(String csapatnev) {
        this.csapatnev = csapatnev;
    }

    public String getVezeteknev() {
        return vezeteknev;
    }

    public void setVezeteknev(String vezeteknev) {
        this.vezeteknev = vezeteknev;
    }

    public String getUtonev() {
        return utonev;
    }

    public void setUtonev(String utonev) {
        this.utonev = utonev;
    }

    public String getSzulido() {
        return szulido;
    }

    public void setSzulido(String szulido) {
        this.szulido = szulido;
    }

    public int getPosztid() {
        return posztid;
    }

    public void setPosztid(int posztid) {
        this.posztid = posztid;
    }

    public String getPoszt_nev() {
        return poszt_nev;
    }

    public void setPoszt_nev(String poszt_nev) {
        this.poszt_nev = poszt_nev;
    }

    public int getMezszam() {
        return mezszam;
    }

    public void setMezszam(int mezszam) {
        this.mezszam = mezszam;
    }

    public int getErtek() {
        return ertek;
    }

    public void setErtek(int ertek) {
        this.ertek = ertek;
    }

    public boolean isKulfoldi() {
        return kulfoldi;
    }

    public void setKulfoldi(boolean kulfoldi) {
        this.kulfoldi = kulfoldi;
    }

    public boolean isMagyar() {
        return magyar;
    }

    public void setMagyar(boolean magyar) {
        this.magyar = magyar;
    }
}
