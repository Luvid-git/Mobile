package cstjean.mobile.travail;

import java.util.Calendar;

/**
 * Classe travail.
 *
 * @author Kevin Pariseau
 */
public class Travail {
    /**
     * Le nom du travail.
     */
    private String nom;

    /**
     * Date de remise du travail.
     */
    private final Calendar dateRemise;

    /**
     * Le constructeur de la classe travail.
     *
     * @param nom Nom du travail
     */
    public Travail(String nom, Calendar dateRemise) {
        this.nom = nom;
        this.dateRemise = dateRemise;
    }

    public String getNom() {
        return nom;
    }
    public Calendar getDateRemise() {
        return dateRemise;
    }
}

