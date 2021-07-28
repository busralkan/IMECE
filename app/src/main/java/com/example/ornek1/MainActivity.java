package com.example.ornek1;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    Button bttnReference;
    Button bttnLogIn;
    EditText etCustomerNo;
    EditText etPassword;
    CheckBox cbRememberMe;
    TextView tvForgetPassword;
    Context context = this;
    Context context1 = this;
    Context context2 = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoadComponents();

        tvForgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ForgetPasswordActivity.class);
                startActivity(intent);
            }
        });

        bttnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String customerNo = etCustomerNo.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                if (customerNo.isEmpty()) {
                    AlertDialog.Builder alertDialog1 = new AlertDialog.Builder(context1);
                    alertDialog1.setTitle("UYARI!")
                            .setMessage("Lütfen Müşteri No veya TCKN giriniz.")
                            .setCancelable(false) //buton dışında bir yere tıklandığında uyarı kapanmıyor true olursa kapanır.
                            .setIcon(R.drawable.warning)
                            .setNeutralButton("Tamam", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            }).show();
                    etCustomerNo.requestFocus();
                    return;

                }

                if (password.isEmpty()) {
                    AlertDialog.Builder alertDialog2 = new AlertDialog.Builder(context2);
                    alertDialog2.setTitle("UYARI!")
                            .setMessage("Lütfen şifrenizi giriniz.")
                            .setCancelable(false) //buton dışında bir yere tıklandığında uyarı kapanmıyor true olursa kapanır.
                            .setIcon(R.drawable.warning)
                            .setNeutralButton("Tamam", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            }).show();
                    etPassword.requestFocus();
                    return;

                }

            }
        });

        bttnReference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ReferenceActivity.class);
                startActivity(intent);
            }

        });
    }

    /*public void onBackPressed() {

        AlertDialog.Builder alertDialog3 = new AlertDialog.Builder(context);
        alertDialog3.setMessage("Çıkmak istediğinizden emin misiniz?")
                .setCancelable(false)
                .setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        finish();
                    }
                })
                .setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.cancel();
                    }
                }).create().show();
    }*/

    private void LoadComponents() {
        bttnReference = (Button) findViewById(R.id.bttnReference);
        bttnLogIn = (Button) findViewById(R.id.bttnLogIn);
        etCustomerNo = (EditText) findViewById(R.id.etCustomerNo);
        etPassword = (EditText) findViewById(R.id.etPassword);
        cbRememberMe = (CheckBox) findViewById(R.id.cbRememberMe);
        tvForgetPassword = (TextView) findViewById(R.id.tvForgetPassword);
    }

}