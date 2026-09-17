package cstjean.mobile.travail.rapport;

import cstjean.mobile.travail.CoursSession;
import junit.framework.TestCase;

public class TestRapportCours extends TestCase {
    public void testRapport() {
        RapportCours rapportCours = new RapportCours();
        rapportCours.ajouter(new CoursSession("Francais", "101"));
        rapportCours.ajouter(new CoursSession("Math", "301"));
        rapportCours.ajouter(new CoursSession("Philo", "301"));
        rapportCours.ajouter(new CoursSession("Math", "201"));
        rapportCours.ajouter(new CoursSession("Philo", "201"));

        assertEquals("Francais 101" + RapportCours.SAUT_LIGNE +
                "Math 201" + RapportCours.SAUT_LIGNE +
                "Math 301" + RapportCours.SAUT_LIGNE +
                "Philo 201" + RapportCours.SAUT_LIGNE +
                "Philo 301" + RapportCours.SAUT_LIGNE, rapportCours.getRapportCours());
    }
}
