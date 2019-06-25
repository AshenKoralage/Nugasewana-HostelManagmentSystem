/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Ashen Koralage
 */
public class Registration {

    private String GID;
    private String Full_name;
    private String NIC;
    private String Address;
    private String Work_place;
    private String Phone_NO;
    private String E_mail;
    private String profession;
    private String gender;

    public Registration() {
    }

    public Registration(String GID, String Full_name, String NIC, String Address, String Work_place, String Phone_NO, String E_mail, String profession, String gender) {
        this.GID = GID;
        this.Full_name = Full_name;
        this.NIC = NIC;
        this.Address = Address;
        this.Work_place = Work_place;
        this.Phone_NO = Phone_NO;
        this.E_mail = E_mail;
        this.profession = profession;
        this.gender = gender;
    }

    public String getGID() {
        return GID;
    }

    public void setGID(String GID) {
        this.GID = GID;
    }

    public String getFull_name() {
        return Full_name;
    }

    public void setFull_name(String Full_name) {
        this.Full_name = Full_name;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getWork_place() {
        return Work_place;
    }

    public void setWork_place(String Work_place) {
        this.Work_place = Work_place;
    }

    public String getPhone_NO() {
        return Phone_NO;
    }

    public void setPhone_NO(String Phone_NO) {
        this.Phone_NO = Phone_NO;
    }

    public String getE_mail() {
        return E_mail;
    }

    public void setE_mail(String E_mail) {
        this.E_mail = E_mail;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
 

}
