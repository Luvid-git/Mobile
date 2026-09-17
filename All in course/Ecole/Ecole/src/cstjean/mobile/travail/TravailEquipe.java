package cstjean.mobile.travail;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class TravailEquipe extends Travail {
    private final Map<Integer, String> coequipiers = new HashMap<Integer, String>();

    public TravailEquipe(String nom, Calendar dateRemise) {
        super(nom, dateRemise);
    }

    void ajouterCoequipier(int da, String nomCoequipier) {
        coequipiers.put(da, nomCoequipier);
    }

    String getCoequipier(int da) {
        return coequipiers.get(da);
    }

}
