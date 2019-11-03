package com.example.vash.industria40uc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetallePonente_Joseph extends AppCompatActivity {

    TextView mTextView, m2TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_ponente_joseph);

        mTextView = findViewById(R.id.tvBiografiaHenna);
        m2TextView=findViewById(R.id.tvNombreHenna);
        mTextView.setText("Arquitecto por la ETSAB y Magíster en Proyectos, Urbanismo e Historia en la Universitat Politécnica de Catalunya. Premio Jóvenes Arquitectos Catalunya 2000 y 2004 y Finalista Premios FAD 2005.");
        m2TextView.setText("Josep Cargol Noguer");
    }
}
