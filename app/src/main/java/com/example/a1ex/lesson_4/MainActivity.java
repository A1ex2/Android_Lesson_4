package com.example.a1ex.lesson_4;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.Gravity;
import android.widget.Button;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a1ex.objects.LoginInfo;

import java.util.DuplicateFormatFlagsException;
import java.util.Locale;

//public class MainActivity extends AppCompatActivity implements OnClickListener{
public class MainActivity extends AppCompatActivity{
    public static final String LOGIN_INFO = "com.example.a1ex.loginInfo";

    public TextView txtLogin;
    public TextView txtPassword;

    public Button btnLogin;
    public Button btnClear;

    private Spinner spinnerDevices;
    private AlertDialog.Builder dlgBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnClear = (Button) findViewById(R.id.btnClear);

        defineComponents();
        prepareDialogBuilder();
    }

//    private void showUserDialog(int messageId){
//        dlgBuilder.setMessage(messageId);
//        AlertDialog alertDialog = dlgBuilder.create();
//        alertDialog.show();
//
//    }

    private void defineComponents(){
        txtLogin = (TextView) findViewById(R.id.txtLogin);
        txtPassword = (TextView) findViewById(R.id.txtPassword);

        spinnerDevices = (Spinner) findViewById(R.id.spinnerDevices);

        txtLogin.requestFocus();
    }

    private void prepareDialogBuilder(){
        dlgBuilder = new AlertDialog.Builder(this);
        dlgBuilder.setTitle(R.string.error);
//        dlgBuilder.setNegativeButton("Cancel", (DialogInterface.OnClickListener) this);
        dlgBuilder.setPositiveButton("OK", (DialogInterface.OnClickListener) null);
    }

    public void buttonClick(View view){
        if (view.getId() == R.id.btnLogin){

            LoginInfo loginInfo = new LoginInfo();
            loginInfo.setLogin(txtLogin.getText().toString());
            loginInfo.setPassword(txtPassword.getText().toString());

            if (loginInfo.getLogin()== null
                    || loginInfo.getLogin().trim().equals("")){
//                showUserDialog(R.string.login_required);
                    showToastMessage(R.string.login_required);
                    txtLogin.requestFocus();
                    return;
            } else if (loginInfo.getPassword()== null
                    || loginInfo.getPassword().trim().equals("")){
//                showUserDialog(R.string.password_required);
                showToastMessage(R.string.password_required);
                txtLogin.requestFocus();
                txtPassword.requestFocus();
                return;
            }

            Intent resultIntent = new Intent(this, ActivityResult.class);
            resultIntent.putExtra(LOGIN_INFO, loginInfo);
            startActivity(resultIntent);

        }  else if (view.getId() == R.id.btnClear){
            txtLogin.setText("");
            txtPassword.setText("");
            txtLogin.requestFocus();
        }
    }

    private void showToastMessage(int messageId){
        Toast message = Toast.makeText(this, messageId, Toast.LENGTH_LONG);
        message.setGravity(Gravity.TOP, 0, 100);
        message.show();
    }

//    @Override
//    public void onClick(DialogInterface dialogInterface, int i) {
//        if (i == dialogInterface.BUTTON_POSITIVE){
//            System.out.println("OK");
//        }else if (i == dialogInterface.BUTTON_NEGATIVE){
//            System.out.println("Cancel");
//        }
//    }
}
