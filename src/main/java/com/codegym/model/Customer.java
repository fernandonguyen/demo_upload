package com.codegym.model;

import java.io.Serializable;

public class Customer implements Serializable {
    private int id;
    private String user_name;
    private String pass_word;
    private String address;


    public Customer() {
    }

    public Customer(int id, String user_name, String pass_word, String address) {
        this.id = id;
        this.user_name = user_name;
        this.pass_word = pass_word;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPass_word() {
        return pass_word;
    }

    public void setPass_word(String pass_word) {
        this.pass_word = pass_word;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
