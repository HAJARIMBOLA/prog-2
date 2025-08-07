class Moderateur extends UtilisateurStandard {
    public Moderateur(String id, String username, String email) {
        super(id, username, email);
    }

    public void supprimerPublication(Groupe groupe, Publication publication) {
        groupe.supprimerPublication(publication);
    }

    public void supprimerCommentaire(Publication publication, Commentaire commentaire) {
        publication.supprimerCommentaire(commentaire);
    }
}