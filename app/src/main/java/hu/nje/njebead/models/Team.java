package hu.nje.njebead.models;

public class Team {

    private int id;
    private String csapatnev;

    public Team(int id, String csapatnev) {
        this.id = id;
        this.csapatnev = csapatnev;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCsapatnev() {
        return csapatnev;
    }

    public void setCsapatnev(String csapatnev) {
        this.csapatnev = csapatnev;
    }

    public String toString() {
        return this.csapatnev;
    }

}
