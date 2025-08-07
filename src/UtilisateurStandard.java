class UtilisateurStandard extends Utilisateur {
    public UtilisateurStandard(String id, String username, String email) {
        super(id, username, email);
    }

    public Publication creerPublication(String contenu) {
        return new Publication(this, contenu);
    }

    public void commenter(Publication publication, String contenu) {
        publication.ajouterCommentaire(new Commentaire(this, contenu));
    }
}
