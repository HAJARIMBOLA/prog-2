import java.util.ArrayList;
import java.util.List;

class Publication {
    private Utilisateur auteur;
    private String contenu;
    private List<Commentaire> commentaires = new ArrayList<>();

    public Publication(Utilisateur auteur, String contenu) {
        this.auteur = auteur;
        this.contenu = contenu;
    }

    public void ajouterCommentaire(Commentaire commentaire) {
        commentaires.add(commentaire);
    }

    public void supprimerCommentaire(Commentaire commentaire) {
        commentaires.remove(commentaire);
    }

    public String getContenu() {
        return contenu;
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }
}
