package ar.edu.utn.frsf.isi.dam.parcial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.List;

import ar.edu.utn.frsf.isi.dam.parcial.model.Usuario;
import ar.edu.utn.frsf.isi.dam.parcial.repository.DamParcialRepository;

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

    /**
     * ACLARACION IMPORTANTE: EL ACCESO AL REPOSITORIO DEBERIA HACERSE EN UN HILO SECUNDARIO Y NO EN EL HILO PRINCIPAL
     */
    private void guardarDatos() {
        try {
            Usuario usuario = new Usuario(editText.getText().toString());
            DamParcialRepository.getInstance(this).guardarUsuario(usuario);
            Toast.makeText(this, "Datos guardados",
                    Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Toast.makeText(this, "Error al guardar datos",
                    Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * ACLARACION IMPORTANTE: EL ACCESO AL REPOSITORIO DEBERIA HACERSE EN UN HILO SECUNDARIO Y NO EN EL HILO PRINCIPAL
     */
    private void recuperarDatos() {
        try {
            List<Usuario> usuarios = DamParcialRepository.getInstance(this).obtenerUsuarios();
            Toast.makeText(this, usuarios.toString(),
                    Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Toast.makeText(this, "Error al obtener datos",
                    Toast.LENGTH_SHORT).show();
        }
    }
}