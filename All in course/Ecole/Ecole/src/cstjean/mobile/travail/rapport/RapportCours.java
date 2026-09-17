package cstjean.mobile.travail.rapport;

import cstjean.mobile.travail.CoursSession;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RapportCours extends Rapport {


    private final List<CoursSession> listeCoursSession = new ArrayList<>();

    void ajouter(CoursSession coursSession) {
        this.listeCoursSession.add(coursSession);
    }

    String getRapportCours() {
        StringBuilder stringBuilder = new StringBuilder();

        Collections.sort(listeCoursSession);

        for (CoursSession cours : listeCoursSession) {
            stringBuilder.append(cours.getDepartement())
                    .append(" ")
                    .append(cours.getNumero())
                    .append(SAUT_LIGNE);
        }

        return stringBuilder.toString();
    }
}
