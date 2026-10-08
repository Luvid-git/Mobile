package cstjean.mobile.ecole.travail;

import cstjean.mobile.ecole.travail.rapport.TestRapportCours;
import cstjean.mobile.ecole.travail.rapport.TestRapportTravaux;
import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestRapportCours.class,
        TestCoursSession.class,
        TestTravail.class,
        TestRapportTravaux.class,
        TestTravailEquipe.class
})
public class TestComplet {
}
