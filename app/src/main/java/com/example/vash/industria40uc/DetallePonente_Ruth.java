package com.example.vash.industria40uc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetallePonente_Ruth extends AppCompatActivity {

    TextView mTextView, m2TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_ponente_ruth);

        mTextView = findViewById(R.id.tvBiografiaHenna);
        m2TextView=findViewById(R.id.tvNombreHenna);
        mTextView.setText("Magíster en Ingeniería Automotriz del Tecnológico de Monterrey, México. Ingeniera Mecánica con diplomado en Seguridad Basado en el Comportamiento en Minería de la PUCP. Jefa y fundadora del Equipo DEIMOS Perú con participaciones en NASA Human Exploration Rover Challenge.");
        m2TextView.setText("Ruth Manzanares Grados");
    }
}
