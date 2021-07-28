package com.example.ornek1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ReferenceActivity extends AppCompatActivity {

    ImageButton imgBttnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference);

        LoadComponents();

        imgBttnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();//butonun geri tuşu olarak çalışmasını sağlıyor
            }
        });

    }

    private void LoadComponents()
    {
        imgBttnBack = (ImageButton) findViewById(R.id.imgBttnBack);
    }
}