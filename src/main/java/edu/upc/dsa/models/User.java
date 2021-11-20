package edu.upc.dsa.models;

public class User {

    private String name;
    private String password;
    private String mail;
    private Boolean active;

    public User(){}

    public User(String name, String password, String mail, Boolean active) {
        this.name = name;
        this.password = password;
        this.mail = mail;
        this.active = false;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public String getMail() {return mail;}

    public void setMail(String mail) {this.mail = mail;}

    public Boolean getActive() {return active;}

    public void setActive(Boolean active) {this.active = active;}
}
