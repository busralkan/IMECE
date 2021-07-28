package com.example.ornek1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ForgetPasswordActivity extends AppCompatActivity {

    ImageButton imgBttnBackFP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        imgBttnBackFP = (ImageButton) findViewById(R.id.imgBttnBackFP);

        //butonu geri tuşuna çevirmek için
        imgBttnBackFP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}