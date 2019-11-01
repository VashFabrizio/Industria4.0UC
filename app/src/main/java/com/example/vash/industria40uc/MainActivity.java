package com.example.vash.industria40uc;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    GridLayout mGridLayout;
    CardView ponenteCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGridLayout = findViewById(R.id.mainGrid);
        ponenteCardView = findViewById(R.id.speakers);

        ponenteCardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.speakers:
                Intent i=new Intent(this, Ponentes.class);
                startActivity(i);
                break;
        }
    }
}
