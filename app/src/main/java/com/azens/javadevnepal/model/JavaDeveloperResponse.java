package com.azens.javadevnepal.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Azens Eklak on 8/7/18.
 */
public class JavaDeveloperResponse {

    @SerializedName("items")
    @Expose
    private List<JavaDeveloper> javaDevelopers;

    public List<JavaDeveloper> getJavaDevelopers() {
        return javaDevelopers;
    }

    public void setJavaDevelopers(List<JavaDeveloper> javaDevelopers) {
        this.javaDevelopers = javaDevelopers;
    }
}
