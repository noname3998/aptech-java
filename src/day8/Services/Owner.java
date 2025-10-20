package day8.Services;

import java.util.ArrayList;

public class Owner {
    private String IdNumber;
    private String name;
    private String email;

    public Owner(String IdNumber, String name, String email) {
        this.IdNumber = IdNumber;
        this.name = name;
        this.email = email;
    }

    public Owner() {

    }

    public String getIdNumber() {
        return IdNumber;
    }

    public void setIdNumber(String idNumber) {
        IdNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
