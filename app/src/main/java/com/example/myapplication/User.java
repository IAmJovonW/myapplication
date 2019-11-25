package com.example.myapplication;

import java.lang.reflect.Constructor;

public class User {

    private Long RattlerId;
    private String Name;
    private String Email;
    private String Phone;
    private String Password;
    private boolean Admin_status;
    private boolean Maint_status;


    public User() {
    }

    public User(Long RattlerId, String Name, String Email, String Phone, String Password, boolean Admin_status, boolean Maint_status){
        this.RattlerId = RattlerId;
        this.Name = Name;
        this.Email = Email;
        this.Phone = Phone;
        this.Password = Password;
        this.Admin_status = Admin_status;
        this.Maint_status = Maint_status;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public boolean isAdmin_status() {
        return Admin_status;
    }

    public boolean isMaint_status() {
        return Maint_status;
    }



    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public Long getRattlerId() {
        return RattlerId;
    }

    public void setRattlerId(Long rattlerId) {
        RattlerId = rattlerId;
    }

    public void setAdmin_status(boolean admin_status) {
        Admin_status = admin_status;
    }
    public void setMaint_status(boolean maint_status) {
        Maint_status = maint_status;
    }
}
