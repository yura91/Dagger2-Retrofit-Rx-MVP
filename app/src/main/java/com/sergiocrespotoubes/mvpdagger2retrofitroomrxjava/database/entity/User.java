package com.sergiocrespotoubes.mvpdagger2retrofitroomrxjava.database.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;



@Entity
public class User {

    @PrimaryKey(autoGenerate = true)
    long id;

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}