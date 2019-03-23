package com.example.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.time.temporal.Temporal;

public class Compartir extends AppCompatActivity {
    private TextView m1Usuario, m1Contra, m1Correo,m1Genero;
    private Button BtnCompartir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compartir);
        m1Usuario = findViewById(R.id.tv_usuario);
        m1Contra = findViewById(R.id.tv_contra);
        m1Correo = findViewById(R.id.tv_Correo);
        m1Genero = findViewById(R.id.tv_genero);
        BtnCompartir = findViewById(R.id.btn_compartir);


        Intent intent = getIntent();
        String usuario = intent.getStringExtra("Usuario");
        String contra = intent.getStringExtra("Contraseña");
        String correo = intent.getStringExtra("Correo");
        String Genero = intent.getStringExtra("Genero");

        m1Usuario.setText(usuario);
        m1Contra.setText(contra);
        m1Correo.setText(correo);
        m1Genero.setText(Genero);

        BtnCompartir.setOnClickListener(v ->{
            String text = "{ Usuario: "+m1Usuario.getText().toString()+", Contraseña: "+m1Contra.getText().toString()+", Correo: "+m1Correo.getText().toString()+", Genero: "+ m1Genero.getText().toString()+" }";
            Intent mIntent = new Intent();
            mIntent.setType("text/plain");
            mIntent.setAction(Intent.ACTION_SEND);
            mIntent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(mIntent);
        });
    }
}
