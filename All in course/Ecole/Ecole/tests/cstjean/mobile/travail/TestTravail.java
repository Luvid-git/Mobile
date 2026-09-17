package cstjean.mobile.travail;

import junit.framework.TestCase;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Tests pour la classe travail.
 *
 * @see Travail
 *
 * @author Kevin Pariseau
 */
public class TestTravail extends TestCase {

    /**
     * Teste la creation de l'objet travail.
     */
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

    protected Travail creerTravail(String nom, Calendar dateRemise) {
        return new Travail(nom, dateRemise);
    }
}
