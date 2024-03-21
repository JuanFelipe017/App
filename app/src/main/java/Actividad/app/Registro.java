package Actividad.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class Registro extends AppCompatActivity {
    private Button btnVolver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_registro);

        btnVolver = findViewById(R.id.Confirmacion_btn);
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId() == R.id.Confirmacion_btn){
                    Intent login_btn = new Intent(getApplicationContext(), Principal.class);
                    startActivity(login_btn);
                }
            }
        });
    }
}


