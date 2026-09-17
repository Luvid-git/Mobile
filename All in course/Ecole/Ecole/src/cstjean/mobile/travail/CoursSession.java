package cstjean.mobile.travail;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe pour les cours de la session.
 */
public class CoursSession implements Comparable<CoursSession> {
    /**
     * Nom du département.
     */
    private final String departement;

    /**
     * Numéro du département.
     */
    private final String numero;

    /**
     * Liste des travaux de la session.
     */
    private List<Travail> travaux = new ArrayList<Travail>();

    /**
     * Constructeur pour la classe des cours de la session.
     *
     * @param departement Departement
     * @param numero Numéro
     */

    private static int compteur = 0;

    public CoursSession(String departement, String numero) {
        this.departement = departement;
        this.numero = numero;
        inscrementerCompteur();
    }

    public String getDepartement() {
        return departement;
    }

    public String getNumero() {
        return numero;
    }

    public int getNombreTravaux() {
        return travaux.size();
    }

    /**
     * Permet d'ajouter un travail à la liste des travaux.
     *
     * @param travail Travail
     */
    public void ajouterTravail(Travail travail) {
        travaux.add(travail);
    }

    /**
     * Permet d'accéder au travail avec l'index.
     *
     * @param index Index
     *
     * @return Retourne le travail.
     */
    public Travail getTravail(int index) {
        return travaux.get(index);
    }

    private static void inscrementerCompteur() {
        compteur++;
    }

    public static int getCompteur() {
        return compteur;
    }

    public static void resetCompteur() {
        compteur = 0;
    }

    @Override
    public int compareTo(CoursSession o) {
        int compareDepartement = getDepartement().compareTo(o.getDepartement());

        if (compareDepartement != 0) {
            return compareDepartement;
        }

        return getNumero().compareTo(o.getNumero());
    }
}
