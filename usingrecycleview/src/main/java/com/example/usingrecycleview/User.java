package com.example.usingrecycleview;

import android.widget.TextView;

/**
 * Created by zhaoqiang on 2017/5/23.
 */

public class User {
    private String name,gender;
    private int age;

    public User(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
