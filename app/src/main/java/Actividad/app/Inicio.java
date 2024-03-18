package Actividad.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_inicio);
    }

    public void lyt_registro(View vista){
        Intent registro = new Intent(this, Principal.class);
        startActivity(registro);
    }
}