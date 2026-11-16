package cstjean.mobile.ecole.travail;

import androidx.annotation.NonNull;

import java.util.Calendar;
import java.util.Objects;

/**
 * Classe travail.
 *
 * @author Kevin Pariseau
 */
public class Travail implements Cloneable {
    /**
     * Le nom du travail.
     */
    private String nom;

    /**
     * Date de remise du travail.
     */
    private Calendar dateRemise;

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

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Travail clone = (Travail) super.clone();
        clone.dateRemise = (Calendar) dateRemise.clone();
        return clone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Travail travail = (Travail) o;
        return Objects.equals(nom, travail.nom) && Objects.equals(dateRemise, travail.dateRemise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, dateRemise);
    }
}

