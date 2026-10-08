package cstjean.mobile.ecole;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

import cstjean.mobile.ecole.travail.CoursSession;

public class MainActivity extends AppCompatActivity {
    private ImageButton btnSuivant;
    private ImageButton btnPrecedent;

    private TextView txtDepartement;

    private int indexCourant = 0;

    private final List<CoursSession> listeCoursSession = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listeCoursSession.add(new CoursSession("Philo", "101"));
        listeCoursSession.add(new CoursSession("Philo", "210"));
        listeCoursSession.add(new CoursSession("Français", "101"));
        listeCoursSession.add(new CoursSession("Math", "101"));


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnPrecedent = findViewById(R.id.btn_precedent);
        btnSuivant = findViewById(R.id.btn_suivant);
        txtDepartement = findViewById(R.id.txt_departement);

        btnPrecedent.setOnClickListener(view -> {
            indexCourant -= 1;
            updateDepartement();
        });

        btnSuivant.setOnClickListener(view -> {
            indexCourant += 1;
            updateDepartement();
        });
        updateDepartement();
    }
    private void updateDepartement() {
        String departement = listeCoursSession.get(indexCourant).getDepartementNumero();
        txtDepartement.setText(departement);
        btnSuivant.setEnabled(indexCourant < (listeCoursSession.size() - 1));
        btnPrecedent.setEnabled(indexCourant > 0);
    }
}
