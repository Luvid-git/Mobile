package cstjean.mobile.travail;

import cstjean.mobile.travail.rapport.TestRapportCours;
import cstjean.mobile.travail.rapport.TestRapportTravaux;
import junit.framework.TestSuite;

public class TestComplet {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(TestTravail.class);
        suite.addTestSuite(TestCoursSession.class);
        suite.addTestSuite(TestRapportCours.class);
        suite.addTestSuite(TestRapportTravaux.class);
        return suite;
    }
}
