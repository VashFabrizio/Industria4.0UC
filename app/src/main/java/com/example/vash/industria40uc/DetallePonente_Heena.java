package com.example.vash.industria40uc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetallePonente_Heena extends AppCompatActivity {

    TextView mTextView, m2TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_ponente_heena);

        mTextView = findViewById(R.id.tvBiografiaHenna);
        m2TextView=findViewById(R.id.tvNombreHenna);
        mTextView.setText("Ph.D. en Ciencias de la Computación. Científica investigadora y docente visitante en la Universidad de Texas A&M en Estado Unidos, Austin y SS College of Engineering en India. Expositora distinguida de Associtation for Computing Machinery (ACM).");
        m2TextView.setText("Heena Rathore");
    }
}
