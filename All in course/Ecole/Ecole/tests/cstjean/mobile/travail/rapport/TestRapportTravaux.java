package cstjean.mobile.travail.rapport;

import cstjean.mobile.travail.CoursSession;
import cstjean.mobile.travail.Travail;
import junit.framework.TestCase;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;

public class TestRapportTravaux extends TestCase {
    public void testRapportTravaux() {
        CoursSession coursSession = new CoursSession("Philo", "101");
        Calendar dateRemise = new GregorianCalendar(2026, Calendar.SEPTEMBER, 10);

        Travail travail1 = new Travail("TP1", dateRemise);
        Travail travail2 = new Travail("TP2", dateRemise);

        coursSession.ajouterTravail(travail1);
        coursSession.ajouterTravail(travail2);

        String rapportTravaux = RapportTravaux.getRapportTravaux(coursSession);

        assertEquals(RapportTravaux.ENTETE_RAPPORT_TRAVAUX +
                "TP1 - 2026-09-10" + RapportTravaux.SAUT_LIGNE +
                "TP2 - 2026-09-10" + RapportTravaux.SAUT_LIGNE +
                "Total : 2" +
                RapportTravaux.PIEDPAGE_RAPPORT_TRAVAUX, rapportTravaux);
    }
}
