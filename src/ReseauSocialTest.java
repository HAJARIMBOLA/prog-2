import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class ReseauSocialTest {

    @Test
    public void testCreationPublication() {
        UtilisateurStandard user = new UtilisateurStandard("1", "user1", "u@mail.com");
        Publication pub = user.creerPublication("Bonjour tout le monde");
        assertEquals("Bonjour tout le monde", pub.getContenu());
    }

    @Test
    public void testAjoutCommentaire() {
        UtilisateurStandard user = new UtilisateurStandard("1", "user1", "u@mail.com");
        Publication pub = user.creerPublication("Salut");
        user.commenter(pub, "Cool!");
        assertEquals(1, pub.getCommentaires().size());
    }

    @Test
    public void testSuppressionPublication() {
        Administrateur admin = new Administrateur("0", "admin", "admin@mail.com");
        Groupe groupe = new Groupe(admin);
        Publication pub = admin.creerPublication("Post à supprimer");
        groupe.ajouterPublication(pub);
        admin.supprimerPublication(groupe, pub);
        assertEquals(0, groupe.totalPublications());
    }

    @Test
    public void testSuppressionUtilisateur() {
        Administrateur admin = new Administrateur("0", "admin", "admin@mail.com");
        Groupe groupe = new Groupe(admin);
        UtilisateurStandard user = new UtilisateurStandard("2", "user2", "user2@mail.com");
        groupe.ajouterUtilisateur(user);
        admin.supprimerUtilisateur(groupe, user);
        assertFalse(groupe.contientUtilisateur(user));
    }
}