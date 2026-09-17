package cstjean.mobile.travail;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestTravailEquipe extends TestTravail {
    public void testAjoutCoequipiers() {
        TravailEquipe travailEquipe = (TravailEquipe) creerTravail("TP1",
                new GregorianCalendar(2026, Calendar.SEPTEMBER, 17));
        int da1 = 123456;
        String nomCoequipier1 = "Sébastien Huot";
        travailEquipe.ajouterCoequipier(da1, nomCoequipier1);
        assertEquals(nomCoequipier1, travailEquipe.getCoequipier(da1));

        int da2 = 223456;
        String nomCoequipier2 = "Samuel Henrichon";
        travailEquipe.ajouterCoequipier(da2, nomCoequipier2);
        assertEquals(nomCoequipier2, travailEquipe.getCoequipier(da2));
    }

    @Override
    protected Travail creerTravail(String nom, Calendar dateRemise) {
        return new TravailEquipe(nom, dateRemise);
    }
}
