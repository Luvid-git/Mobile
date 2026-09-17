package cstjean.mobile.dames;

import junit.framework.TestCase;

/**
 * Test pour la classe pion.
 */
public class TestPion extends TestCase {
    /**
     * Test la création de pion.
     */
    public void testCreer() {
        // Test avec paramètre.
        Pion pion1 = new Pion("blanc");
        Pion pion2 = new Pion("noir");
        assertEquals("blanc", pion1.getCouleur());
        assertEquals("noir", pion2.getCouleur());

        // Test sans paramètre.
        Pion pion3 = new Pion();
        assertEquals("blanc", pion3.getCouleur());
    }
}
