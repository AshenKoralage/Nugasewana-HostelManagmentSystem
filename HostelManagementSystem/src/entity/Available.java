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
public class Available {
    private String HID;
    private String Gender_of_residence;
    private String Address;
    private String Room_no;
    private String No_of_beds;
    private String Current_Borders_count;
    private String Price;
    private String Name;

    public Available() {
    }

    public Available(String HID, String Gender_of_residence, String Address, String Room_no, String No_of_beds, String Current_Borders_count, String Price, String Name) {
        this.HID = HID;
        this.Gender_of_residence = Gender_of_residence;
        this.Address = Address;
        this.Room_no = Room_no;
        this.No_of_beds = No_of_beds;
        this.Current_Borders_count = Current_Borders_count;
        this.Price = Price;
        this.Name = Name;
    }

    public String getHID() {
        return HID;
    }

    public void setHID(String HID) {
        this.HID = HID;
    }

    public String getGender_of_residence() {
        return Gender_of_residence;
    }

    public void setGender_of_residence(String Gender_of_residence) {
        this.Gender_of_residence = Gender_of_residence;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getRoom_no() {
        return Room_no;
    }

    public void setRoom_no(String Room_no) {
        this.Room_no = Room_no;
    }

    public String getNo_of_beds() {
        return No_of_beds;
    }

    public void setNo_of_beds(String No_of_beds) {
        this.No_of_beds = No_of_beds;
    }

    public String getCurrent_Borders_count() {
        return Current_Borders_count;
    }

    public void setCurrent_Borders_count(String Current_Borders_count) {
        this.Current_Borders_count = Current_Borders_count;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    
}
