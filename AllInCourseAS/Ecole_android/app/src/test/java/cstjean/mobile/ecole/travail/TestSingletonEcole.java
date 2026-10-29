
package cstjean.mobile.ecole.travail;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import junit.framework.TestCase;

import org.junit.Test;

public class TestSingletonEcole {
    @Test
    public void testInstance() {
        SingletonEcole singleton1 = SingletonEcole.getInstance();
        SingletonEcole singleton2 = SingletonEcole.getInstance();
        assertSame(singleton1, singleton2);
        assertEquals(4, singleton1.getNbCoursSession());
    }
}

