package com.example.vash.industria40uc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetallePonente_Jorge extends AppCompatActivity {

    TextView mTextView, m2TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_ponente_jorge);

        mTextView = findViewById(R.id.tvBiografiaHenna);
        m2TextView=findViewById(R.id.tvNombreHenna);
        mTextView.setText("Ingeniero de Medio Ambiente y Energía de la Universidad de Tohoku, Japón; con especialización en tratamiento de aguas y recuperación de energía. Pasante de visitas técnicas en múltiples plantas de tratamiento de agua y de residuos sólidos en Japón.");
        m2TextView.setText("Jorge Ascencio Damián");
    }
}
