package Actividad.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity implements View.OnClickListener{

    Button btnLogin;

    Button btnSing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_principal);

        btnLogin = findViewById(R.id.Login_btn);
        btnLogin.setOnClickListener(this);

        btnSing = findViewById(R.id.Sing_btn);
        btnSing.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.Login_btn){
            Intent login_btn = new Intent (getApplicationContext(), Reserva.class);
            startActivity(login_btn);
        } else if (view.getId() == R.id.Sing_btn){
            Intent sing_btn = new Intent (getApplicationContext(), Registro.class);
            startActivity(sing_btn);
        }
    }
}