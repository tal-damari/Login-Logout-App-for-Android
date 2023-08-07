package com.example.letskickit;

public class Users {
    public String firstName;
    public String lastName;
    public String phone;
    public String email;
    public String id;
    public String password;


    public Users(String firstName, String lastName, String phone, String email, String id, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.id = id;
    }

    public Users() {
    }

}
