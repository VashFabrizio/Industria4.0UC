package com.example.vash.industria40uc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetallePonente_Juan extends AppCompatActivity {

    TextView mTextView, m2TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_ponente_juan);

        mTextView = findViewById(R.id.tvBiografiaHenna);
        m2TextView=findViewById(R.id.tvNombreHenna);
        mTextView.setText("Arquitecto y magister en Gestión Urbana de la Universidad. Piloto de Colombia/ Eninco S.Ay Magister en Gestión Urbana. Vinculado al sector académico e investigativo con diferentes universidades como la Universidad Piloto de Colombia y la Universidad de los Andes – CIDER, entre otras.");
        m2TextView.setText("Juan Pablo Serna Cardona");
    }
}
