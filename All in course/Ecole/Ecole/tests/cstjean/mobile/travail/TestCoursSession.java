package cstjean.mobile.travail;

import junit.framework.TestCase;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCoursSession extends TestCase {

    private CoursSession coursSession;
    private Calendar dateRemise;

    public void setUp() {
        coursSession = new CoursSession("Philo", "101");
        dateRemise = new GregorianCalendar(2026, Calendar.SEPTEMBER, 10);
    }

    public void testCreer() {
        CoursSession coursSession = new CoursSession("Philo", "101");
        assertEquals("Philo", coursSession.getDepartement());
        assertEquals("101", coursSession.getNumero());
        assertEquals(0, coursSession.getNombreTravaux());
    }

    public void testAjoutTravail() {
        CoursSession coursSession = new CoursSession("Philo", "101");
        Travail travail1 = new Travail("TP1", dateRemise);
        coursSession.ajouterTravail(travail1);
        assertEquals(1, coursSession.getNombreTravaux());
        assertEquals(travail1, coursSession.getTravail(0));

        Travail travail2 = new Travail("TP2", dateRemise);
        coursSession.ajouterTravail(travail2);
        assertEquals(2, coursSession.getNombreTravaux());
        assertEquals(travail1, coursSession.getTravail(0));
        assertEquals(travail2, coursSession.getTravail(1));
    }

    public void testCompteur() {
        CoursSession.resetCompteur();
        assertEquals(0, CoursSession.getCompteur());

        new CoursSession("Philo", "101");
        assertEquals(1, CoursSession.getCompteur());

        new CoursSession("Philo", "101");
        assertEquals(2, CoursSession.getCompteur());

        new CoursSession("Philo", "101");
        assertEquals(3, CoursSession.getCompteur());

        new CoursSession("Philo", "101");
        assertEquals(4, CoursSession.getCompteur());
    }

    public void testCompare() {
        assertEquals(0, coursSession.compareTo(new CoursSession("Philo", "101")));
        assertTrue(coursSession.compareTo(new CoursSession("Philo", "201")) < 0);
        assertTrue(coursSession.compareTo(new CoursSession("Math", "101")) > 0);
    }
}
