package cstjean.mobile.ecole;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import cstjean.mobile.ecole.travail.SingletonEcole;

public class AjoutCoursActivity extends AppCompatActivity {

    private static final String EXTRA_INDEXCOURANT = "indexcourant";
    private TextView txtDepartement;
    private TextView txtNumero;
    private Button btnAjouter;

    private static Context listeActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ajout_cours);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtDepartement = findViewById(R.id.input_departement);
        txtNumero = findViewById(R.id.input_numero);
        btnAjouter = findViewById(R.id.btn_ajouter);

        btnAjouter.setOnClickListener(v -> {
            SingletonEcole.getInstance().addCoursSession(txtDepartement.getText().toString(), txtNumero.getText().toString());
            finish();
        });
    }

    public static Intent newIntent(Context packageContext, int indexCourant) {
        listeActivity = packageContext;
        Intent intent = new Intent(packageContext, AjoutCoursActivity.class);
        intent.putExtra(EXTRA_INDEXCOURANT, indexCourant);
        return intent;
    }
}