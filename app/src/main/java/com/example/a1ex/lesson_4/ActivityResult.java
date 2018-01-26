package com.example.a1ex.lesson_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.a1ex.objects.LoginInfo;

public class ActivityResult extends AppCompatActivity {
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        LoginInfo loginInfo = (LoginInfo)intent.getSerializableExtra(MainActivity.LOGIN_INFO);

        txtResult = (TextView) findViewById(R.id.txtResult);
        txtResult.setText(String.format(txtResult.getText().toString(), loginInfo.getLogin()));
    }
}
