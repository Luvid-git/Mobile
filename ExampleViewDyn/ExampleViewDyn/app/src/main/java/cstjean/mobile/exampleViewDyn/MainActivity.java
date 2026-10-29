package cstjean.mobile.exampleViewDyn;

import android.os.Bundle;
import android.widget.Button;
import android.widget.GridLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
        // Lien avec le layout
        GridLayout gridBoutons = findViewById(R.id.layout_gridBoutons);

        // Création du bouton standard
        Button bouton = new MonBouton(this);
        bouton.setText(R.string.btn_bouton);

        // LayoutParams pour le positionnement par rapport au layout
        GridLayout.LayoutParams params = new GridLayout.LayoutParams();
        params.height = GridLayout.LayoutParams.WRAP_CONTENT;
        params.width = GridLayout.LayoutParams.WRAP_CONTENT;
        params.columnSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f);
        bouton.setLayoutParams(params);

        // Ajout dans le layout
        gridBoutons.addView(bouton);
    }
}