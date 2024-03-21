package Actividad.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class Reserva extends AppCompatActivity {

    private Button btnreserva;
    private Button botonSeleccionarFecha;
    private TextView textViewFechaSeleccionada;
    private Calendar calendar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_reserva);

        btnreserva = findViewById(R.id.btnreservacion);
        botonSeleccionarFecha = findViewById(R.id.botonSeleccionarFecha);
        textViewFechaSeleccionada = findViewById(R.id.textViewFechaSeleccionada);
        calendar = Calendar.getInstance();

        btnreserva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Reserva.this, Precio.class);
                startActivity(intent);
            }
        });

        botonSeleccionarFecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        Reserva.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                                month++; // Month starts from 0
                                String fechaSeleccionada = dayOfMonth + "/" + month + "/" + year;
                                textViewFechaSeleccionada.setText("Fecha seleccionada: " + fechaSeleccionada);
                            }
                        },
                        year, month, dayOfMonth);

                datePickerDialog.show();
            }
        });
    }
}