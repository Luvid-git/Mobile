package cstjean.mobile.ecole.travail;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;

import android.view.animation.ScaleAnimation;

import junit.framework.TestCase;

import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

import cstjean.mobile.ecole.travail.Travail;

/**
 * Tests pour la classe travail.
 *
 * @see Travail
 *
 * @author Kevin Pariseau
 */
public class TestTravail {

    @Test
    public void testClone() throws CloneNotSupportedException {
        Calendar dateRemise = new GregorianCalendar(2025, Calendar.SEPTEMBER, 10);
        Travail travail = creerTravail("TP1", dateRemise);
        Travail clone = (Travail) travail.clone();
        assertNotSame(travail, clone);
        assertEquals(travail.getClass(), clone.getClass());
        assertEquals(travail, clone);
    }

    /**
     * Teste la creation de l'objet travail.
     */
    @Test
    public void testCreer() {
        Calendar dateRemise = new GregorianCalendar(2026, Calendar.SEPTEMBER, 10);

        String nomTravail1 = "TP1";
        Travail travail1 = creerTravail(nomTravail1, dateRemise);
        assertEquals(nomTravail1, travail1.getNom());
        assertEquals(dateRemise, travail1.getDateRemise());

        String nomTravail2 = "TP1";
        Travail travail2 = creerTravail(nomTravail2, dateRemise);
        assertEquals(nomTravail2, travail2.getNom());
        assertEquals(dateRemise, travail2.getDateRemise());
    }


    @Test
    public void testEgalite() {
        Calendar dateRemise = new GregorianCalendar(2025, Calendar.SEPTEMBER, 10);
        Travail travailA = creerTravail("TP1", dateRemise);
        Travail travailB = creerTravail("TP1", dateRemise);
        assertEquals(travailA, travailB);
        Travail travailC = creerTravail("TP2", dateRemise);
        assertNotEquals(travailA, travailC);
        // Réflexivité
        assertEquals(travailA, travailA);

        assertEquals(travailB, travailA);
        // Transitivité
        Travail travailD = creerTravail("TP1", dateRemise);
        assertEquals(travailB, travailD);
        assertEquals(travailA, travailD);
        // Constance
        assertEquals(travailA, travailB);
        // Comparaison à null
        // LINT : jUnit n'appelle pas le equal si on envoit null donc on veut comparer directement
        // On veut vraiment tester le null ici...
        assertFalse(travailA.equals(null));
        // Validation
        assertNotEquals("BLABLABLA", travailA);
    }
    @Test
    public void testHashcode() {
        Calendar dateRemise = new GregorianCalendar(2025, Calendar.SEPTEMBER, 10);
        Travail travailA = creerTravail("TP1", dateRemise);
        Travail travailB = creerTravail("TP1", dateRemise);

        assertEquals(travailA.hashCode(), travailB.hashCode());
        assertEquals(travailA.hashCode(), travailB.hashCode());
    }

    protected Travail creerTravail(String nom, Calendar dateRemise) {
        return new Travail(nom, dateRemise);
    }
}
