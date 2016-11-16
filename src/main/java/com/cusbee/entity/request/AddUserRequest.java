package com.cusbee.entity.request;

/**
 * Created by Endriu on 16.11.2016.
 */
public class AddUserRequest {

    private  String name;
    private  String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
