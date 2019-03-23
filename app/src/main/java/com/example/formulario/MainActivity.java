package com.example.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mUsuario, mContra, mCorreo,mGenero;
    private Button BtnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsuario = findViewById(R.id.ET_usuario);
        mContra = findViewById(R.id.ET_contra);
        mCorreo = findViewById(R.id.ET_correo);
        mGenero = findViewById(R.id.ET_genero);
        BtnEnviar = findViewById(R.id.btn_enviar);

        BtnEnviar.setOnClickListener( v ->{
            Intent intent = new Intent(MainActivity.this, Compartir.class);
            intent.putExtra("Usuario", mUsuario.getText().toString());
            intent.putExtra("Contraseña", mContra.getText().toString());
            intent.putExtra("Correo", mCorreo.getText().toString());
            intent.putExtra("Genero", mGenero.getText().toString());
            startActivity(intent);
        });
    }
}
