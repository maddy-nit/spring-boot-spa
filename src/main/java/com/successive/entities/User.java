package com.successive.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotBlank(message = "First Name is mandatory")
    private String fname;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User(@NotBlank(message = "First Name is mandatory") String fname, @NotBlank(message = "Last Name is mandatory") String lname, @NotBlank(message = "Phone Number is mandatory") String phone) {
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
    }

    @NotBlank(message = "Last Name is mandatory")
    private String lname;

    @NotBlank(message = "Phone Number is mandatory")
    private String phone;

    public User() {}



    @Override
    public String toString() {
        return "User{" + "id=" + id + ", fname=" + fname + ", lname=" + lname + ", phone=" + phone + '}';
    }
}
