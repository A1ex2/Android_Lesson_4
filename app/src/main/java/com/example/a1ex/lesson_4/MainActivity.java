package com.example.a1ex.lesson_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.a1ex.objects.LoginInfo;

import java.util.DuplicateFormatFlagsException;

public class MainActivity extends AppCompatActivity {
    public static final String LOGIN_INFO = "com.example.a1ex.loginInfo";

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

            LoginInfo loginInfo = new LoginInfo();
            loginInfo.setLogin(txtLogin.getText().toString());
            loginInfo.setPassword(txtPassword.getText().toString());

            Intent resultIntent = new Intent(this, ActivityResult.class);
            resultIntent.putExtra(LOGIN_INFO, loginInfo);
            startActivity(resultIntent);

        }  else if (view == btnClear){
            txtLogin.setText("");
            txtPassword.setText("");
            txtLogin.requestFocus();
        }
    }
}
