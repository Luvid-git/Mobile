package cstjean.mobile.ecole;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import cstjean.mobile.ecole.travail.CoursSession;
import cstjean.mobile.ecole.travail.SingletonEcole;
import cstjean.mobile.ecole.travail.rapport.RapportTravaux;

public class DetailsCoursActivity extends AppCompatActivity {

    private static final String EXTRA_INDEXCOURANT = "indexcourant";
    private TextView txtDepartement;
    private TextView txtNumero;
    private TextView txtTravaux;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_details_cours);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txtDepartement = findViewById(R.id.txt_departement);
        txtNumero = findViewById(R.id.txt_numero);
        txtTravaux = findViewById(R.id.txt_travaux);

        int indexCourant = getIntent().getIntExtra(EXTRA_INDEXCOURANT, 0);
        CoursSession coursSession = SingletonEcole.getInstance().getCoursSession(indexCourant);
        txtDepartement.setText(coursSession.getDepartement());
        txtNumero.setText(coursSession.getNumero());
        txtTravaux.setText(RapportTravaux.getRapportTravaux(coursSession));
    }

    public static Intent newIntent(Context packageContext, int indexCourant) {
        Intent intent = new Intent(packageContext, DetailsCoursActivity.class);
        intent.putExtra(EXTRA_INDEXCOURANT, indexCourant);
        return intent;
    }
}