class Administrateur extends Moderateur {
    public Administrateur(String id, String username, String email) {
        super(id, username, email);
    }

    public void supprimerUtilisateur(Groupe groupe, Utilisateur utilisateur) {
        groupe.supprimerUtilisateur(utilisateur);
    }
}