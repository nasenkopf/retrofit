package liese.jrg.gitorg;

/**
 * Created by john_smith on 19.06.17.
 */

 //Login ist der Name der Organisation und description Bezeichnung der Organisation
 //Nur die beiden lassen wir uns anzeigen
 //Objekt orientierte Progammierung
 
public class Organization {

    private String login;
    private String description;

    public String getDescription() {
        return description;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
