package com.example.a1ex.lesson_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.DuplicateFormatFlagsException;

public class MainActivity extends AppCompatActivity {
    public TextView txtLogin;
    public TextView txtPassword;

    public Button btnLogin;
    public Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnClear = (Button) findViewById(R.id.btnClear);
        txtPassword = (TextView) findViewById(R.id.txtPassword);
        txtLogin = (TextView) findViewById(R.id.txtLogin);
    }
    public void buttonClick(View view){
        if (view == btnLogin){

        }  else if (view == btnClear){
            txtLogin.setText("");
            txtPassword.setText("");
            txtLogin.requestFocus();
        }
    }
}
