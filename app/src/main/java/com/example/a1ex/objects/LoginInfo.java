package com.example.a1ex.objects;

import java.io.Serializable;

/**
 * Created by A1ex on 25.01.2018.
 */

public class LoginInfo implements Serializable{

    private String login;
    private String password;

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {

        return login;
    }

    public String getPassword() {
        return password;
    }
}
