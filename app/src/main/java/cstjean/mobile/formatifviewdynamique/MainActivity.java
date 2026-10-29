package cstjean.mobile.formatifviewdynamique;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText nombreBoutonAjouter;
    private Button boutonAjouter;
    private GridLayout gridBoutons;

    private int compteurAjout = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nombreBoutonAjouter = findViewById(R.id.txt_nombreBoutonsAAjouter);
        boutonAjouter = findViewById(R.id.btn_ajouter);
        gridBoutons = findViewById(R.id.layout_gridBoutons);

        boutonAjouter.setOnClickListener(v -> {
            gridBoutons.removeAllViews();
            String stringNbBoutonsAjouter = nombreBoutonAjouter.getText().toString();
            if(!stringNbBoutonsAjouter.isEmpty()) {
                int nbBoutonsAjouter = Integer.parseInt(stringNbBoutonsAjouter);
                for (int i = 1; i <= nbBoutonsAjouter; i++) {
                    Button bouton = new MonBouton(v.getContext());
                    bouton.setText(getString(R.string.btn, compteurAjout, i));

                    GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                    params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
                    params.width = ViewGroup.LayoutParams.WRAP_CONTENT;
                    bouton.setLayoutParams(params);

                    gridBoutons.addView(bouton);
                }
            }
            compteurAjout++;
        });
    }
}