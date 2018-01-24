package com.example.a1ex.lesson_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        Button btnReset = (Button) findViewById(R.id.btnReset);
        final TextView txtPassword = (TextView) findViewById(R.id.txtPassword);
        final TextView txtLogin = (TextView) findViewById(R.id.txtLogin);
        final TextView txtResult = (TextView) findViewById(R.id.txtResult);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText("Значение пароля: " + txtPassword.getText());
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtLogin.setText("");
                txtPassword.setText("");
                txtResult.setText("Значение пароля:");
            }
        });
    }
}
