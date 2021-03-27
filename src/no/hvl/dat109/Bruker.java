package no.hvl.dat109;

public class Bruker {

    private String brukernavn;
    private String navn;
    private String email;
    private String passord;

    public Bruker(String brukernavn, String navn, String email, String passord) {
        this.brukernavn = brukernavn;
        this.navn = navn;
        this.email = email;
        this.passord = passord;

    }

    public String getBrukernavn() {
        return brukernavn;
    }

    public void setBrukernavn(String brukernavn) {
        this.brukernavn = brukernavn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassord() {
        return passord;
    }

    public void setPassord(String passord) {
        this.passord = passord;
    }

    public void loggInn() {

    }

}
