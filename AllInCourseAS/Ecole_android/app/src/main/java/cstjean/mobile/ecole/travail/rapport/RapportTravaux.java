package cstjean.mobile.ecole.travail.rapport;

import android.annotation.SuppressLint;

import cstjean.mobile.ecole.travail.CoursSession;
import cstjean.mobile.ecole.travail.Travail;

import java.text.SimpleDateFormat;

public class RapportTravaux extends Rapport {
    static final String ENTETE_RAPPORT_TRAVAUX = "---------- TRAVAUX ----------" + SAUT_LIGNE;
    static final String PIEDPAGE_RAPPORT_TRAVAUX = "--------------------";

    static String getRapportTravaux(CoursSession coursSession) {
        @SuppressLint("SimpleDateFormat") SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(ENTETE_RAPPORT_TRAVAUX);
        for (int i = 0; i < coursSession.getNombreTravaux(); i++) {
            Travail travail = coursSession.getTravail(i);
            stringBuilder.append(travail.getNom())
                    .append(" - ")
                    .append(formatDate.format(travail.getDateRemise().getTime()))
                    .append(SAUT_LIGNE);
        }

        stringBuilder.append("Total : ")
                .append(coursSession.getNombreTravaux())
                .append(PIEDPAGE_RAPPORT_TRAVAUX);

        return stringBuilder.toString();
    }
}
