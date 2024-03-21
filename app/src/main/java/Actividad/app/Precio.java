package Actividad.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Precio extends AppCompatActivity implements View.OnClickListener {

    private Button button_menu;
    private Button button_pagar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_precio);

        button_menu = findViewById(R.id.button_menu);
        button_menu.setOnClickListener(this);

        button_pagar = findViewById(R.id.button_pagar);
        button_pagar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button_menu){
            Intent login_btn = new Intent (getApplicationContext(), Principal.class);
            startActivity(login_btn);

        } else if (view.getId() == R.id.button_pagar){
            Intent sing_btn = new Intent (getApplicationContext(), Principal.class);
            startActivity(sing_btn);
        }
    }
}