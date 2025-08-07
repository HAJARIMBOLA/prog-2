import java.util.ArrayList;
import java.util.List;

class Groupe {
    private List<Utilisateur> membres = new ArrayList<>();
    private List<Publication> publications = new ArrayList<>();
    private Administrateur administrateur;

    public Groupe(Administrateur administrateur) {
        this.administrateur = administrateur;
        ajouterUtilisateur(administrateur);
    }

    public void ajouterUtilisateur(Utilisateur utilisateur) {
        if (!contientUtilisateur(utilisateur)) {
            membres.add(utilisateur);
        }
    }

    public void supprimerUtilisateur(Utilisateur utilisateur) {
        membres.removeIf(m -> m.equals(utilisateur));
    }

    public void ajouterPublication(Publication publication) {
        publications.add(publication);
    }

    public void supprimerPublication(Publication publication) {
        publications.remove(publication);
    }

    public List<Publication> chercherPublications(String motCle) {
        List<Publication> resultats = new ArrayList<>();
        for (Publication pub : publications) {
            if (pub.getContenu().toLowerCase().contains(motCle.toLowerCase())) {
                resultats.add(pub);
            }
        }
        return resultats;
    }

    public boolean contientUtilisateur(Utilisateur utilisateur) {
        for (Utilisateur m : membres) {
            if (m.equals(utilisateur)) {
                return true;
            }
        }
        return false;
    }

    public int totalPublications() {
        return publications.size();
    }
}
