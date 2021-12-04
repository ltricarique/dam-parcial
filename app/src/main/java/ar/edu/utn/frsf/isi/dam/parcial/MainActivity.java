package ar.edu.utn.frsf.isi.dam.parcial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private ToggleButton toggleButton;
    private Button buttonGuardar;
    private Button buttonRecuperar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextId);
        toggleButton = findViewById(R.id.toggleButtonId);
        buttonGuardar = findViewById(R.id.buttonGuardarId);
        buttonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guardarDatos();
            }
        });
        buttonRecuperar = findViewById(R.id.buttonRecuperarId);
        buttonRecuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recuperarDatos();
            }
        });
    }

    private void guardarDatos() {
        Toast.makeText(this, "Datos guardados",
                Toast.LENGTH_SHORT).show();
    }

    private void recuperarDatos() {

    }
}