package cstjean.mobile.ecole;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btnSuivant;
    private Button btnPrecedent;

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

        btnPrecedent = findViewById(R.id.btn_precedent);
        btnSuivant = findViewById(R.id.btn_suivant);

        btnPrecedent.setOnClickListener(view -> Toast.makeText(MainActivity.this, R.string.btn_precedent, Toast.LENGTH_SHORT).show());

        btnSuivant.setOnClickListener(view -> Toast.makeText(MainActivity.this, R.string.btn_suivant, Toast.LENGTH_SHORT).show());
    }
}