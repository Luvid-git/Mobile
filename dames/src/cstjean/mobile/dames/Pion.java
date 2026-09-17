package cstjean.mobile.dames;

/**
 * Classe de pion.
 */
public class Pion {
    /**
     * Couleur du pion.
     */
    private final String couleur;

    /**
     * Constructeur sans param.
     */
    public Pion() {
        couleur = "blanc";
    }

    /**
     * Constructeur avec param.
     *
     * @param couleur Couleur "blanc" || "noir"
     */
    public Pion(String couleur) {
        this.couleur = couleur;
    }

    /**
     * Getter Couleur.
     *
     * @return Retourne la couleur.
     */
    public String getCouleur() {
        return couleur;
    }
}
