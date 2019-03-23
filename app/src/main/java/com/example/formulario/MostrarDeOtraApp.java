package com.example.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MostrarDeOtraApp extends AppCompatActivity {
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_de_otra_app);

        Intent mIntent = getIntent();
        mTextView = findViewById(R.id.tv_Mostrar);

        if (mIntent != null) {
            mTextView.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}
