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
public class Hostel {

    private String HID;
    private String No_of_Rooms;
    private String Gender_of_residence;
    private String phone_Number;
    private String Address;

    public Hostel() {
    }

    public Hostel(String HID, String No_of_Rooms, String Gender_of_residence, String phone_Number, String Address) {
        this.HID = HID;
        this.No_of_Rooms = No_of_Rooms;
        this.Gender_of_residence = Gender_of_residence;
        this.phone_Number = phone_Number;
        this.Address = Address;
    }

    public String getHID() {
        return HID;
    }

    public void setHID(String HID) {
        this.HID = HID;
    }

    public String getNo_of_Rooms() {
        return No_of_Rooms;
    }

    public void setNo_of_Rooms(String No_of_Rooms) {
        this.No_of_Rooms = No_of_Rooms;
    }

    public String getGender_of_residence() {
        return Gender_of_residence;
    }

    public void setGender_of_residence(String Gender_of_residence) {
        this.Gender_of_residence = Gender_of_residence;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        this.phone_Number = phone_Number;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

   

    
}
