package cstjean.mobile.ecole;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

import cstjean.mobile.ecole.travail.CoursSession;
import cstjean.mobile.ecole.travail.SingletonEcole;

public class ListeCoursActivity extends AppCompatActivity {

    private static final String KEY_INDEXCOURANT = "indexcourant";
    private ImageButton btnSuivant;
    private ImageButton btnPrecedent;

    private TextView txtDepartement;

    private int indexCourant = 0;

    private ImageButton btnAjoutCoursSession;

    private ImageButton btnVoir;

    private final List<CoursSession> listeCoursSession = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if (savedInstanceState != null) {
            indexCourant = savedInstanceState.getInt(KEY_INDEXCOURANT, 0);
        }

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_liste_cours);

        listeCoursSession.add(new CoursSession("Philo", "101"));
        listeCoursSession.add(new CoursSession("Philo", "210"));
        listeCoursSession.add(new CoursSession("Français", "101"));
        listeCoursSession.add(new CoursSession("Math", "101"));


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.d("ProjetEcole", "onCreate");

        btnVoir = findViewById(R.id.btn_voir);
        btnPrecedent = findViewById(R.id.btn_precedent);
        btnSuivant = findViewById(R.id.btn_suivant);
        txtDepartement = findViewById(R.id.txt_departement);
        btnAjoutCoursSession = findViewById(R.id.btn_ajouterCoursSession);


        btnVoir.setOnClickListener(v -> {
            Intent intent = DetailsCoursActivity.newIntent(ListeCoursActivity.this, indexCourant);
            startActivity(intent);
        });

        btnPrecedent.setOnClickListener(view -> {
            indexCourant -= 1;
            updateDepartement();
        });

        btnSuivant.setOnClickListener(view -> {
            indexCourant += 1;
            updateDepartement();
        });
        btnAjoutCoursSession.setOnClickListener(view -> {
            Intent intent = AjoutCoursActivity.newIntent(ListeCoursActivity.this, indexCourant);
            startActivity(intent);
        });
        updateDepartement();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("ProjetEcole", "onSaveInstanceState");
        outState.putInt(KEY_INDEXCOURANT, indexCourant);
    }

    @Override
    protected void onResume() {
        super.onResume();
        updateDepartement();
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ProjetEcole", "onStart");
    }
    private void updateDepartement() {
        String departement = SingletonEcole.getInstance().getCoursSession(indexCourant).getDepartementNumero();
        txtDepartement.setText(departement);
        btnSuivant.setEnabled(indexCourant < (SingletonEcole.getInstance().getNbCoursSession() - 1));
        btnPrecedent.setEnabled(indexCourant > 0);
    }
}
