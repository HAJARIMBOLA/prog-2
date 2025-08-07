import java.util.*;

class Utilisateur {
    protected String id;
    protected String username;
    protected String email;
    protected Date dateCreation;

    public Utilisateur(String id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.dateCreation = new Date();
    }

    public boolean equals(Utilisateur other) {
        return this.id.equals(other.id) &&
                this.username.equals(other.username) &&
                this.email.equals(other.email);
    }
}
