package cstjean.mobile.travail;

import java.util.Calendar;

public class TestTravailEquipe extends TestTravail {
    @Override
    protected Travail creerTravail(String nom, Calendar dateRemise) {
        return new TravailEquipe(nom, dateRemise);
    }
}
