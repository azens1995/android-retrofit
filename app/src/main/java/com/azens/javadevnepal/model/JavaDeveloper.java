package com.azens.javadevnepal.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Azens Eklak on 8/7/18.
 */
public class JavaDeveloper {

    @SerializedName("login")
    @Expose
    private String login;


    public JavaDeveloper(String login){
        this.login = login;

    }

    public String getLogin(){
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

}
