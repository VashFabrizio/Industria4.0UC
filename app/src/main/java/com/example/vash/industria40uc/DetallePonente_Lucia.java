package com.example.vash.industria40uc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetallePonente_Lucia extends AppCompatActivity {

    TextView mTextView, m2TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_ponente_lucia);

        mTextView = findViewById(R.id.tvBiografiaHenna);
        m2TextView=findViewById(R.id.tvNombreHenna);
        mTextView.setText("Ingeniera electrónica por la Universidad Nacional de Tucumán, Argentina. Es Project Coordinator de Sinergia S.A. y Energy Service Company en Argentina. Profesional referente en Young Women and Men in Science/Technology/Engineering.");
        m2TextView.setText("Lucía Pía Torres");
    }
}
