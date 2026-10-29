package cstjean.mobile.ecole.travail;

import java.util.ArrayList;
import java.util.List;

public class SingletonEcole {
    private static SingletonEcole instance = null;
    private final List<CoursSession> listeCoursSession = new ArrayList<>();
    private SingletonEcole() {
// Données de tests
        listeCoursSession.add(new CoursSession("Philo", "101"));
        listeCoursSession.add(new CoursSession("Philo", "210"));
        listeCoursSession.add(new CoursSession("Math", "101"));
        listeCoursSession.add(new CoursSession("Français", "101"));
    }
    public int getNbCoursSession() {
        return listeCoursSession.size();
    }

    public static SingletonEcole getInstance() {
        if (instance == null) {
            instance = new SingletonEcole();
        }
        return instance;
    }
    public CoursSession getCoursSession(int index) {
        return listeCoursSession.get(index);
    }
}

