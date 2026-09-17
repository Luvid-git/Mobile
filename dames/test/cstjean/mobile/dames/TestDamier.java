package cstjean.mobile.dames;

import junit.framework.TestCase;

import java.util.LinkedList;

/**
 * Test de la classe du damier.
 */
public class TestDamier extends TestCase {
    /**
     * Damier test.
     */
    private Damier damier;

    /**
     * Initialize les valeurs répété.
     */
    public void setUp() {
        damier = new Damier();
    }

    /**
     * Création d'un damier.
     */
    public void testCreer() {
        assertEquals(damier);
    }
}
