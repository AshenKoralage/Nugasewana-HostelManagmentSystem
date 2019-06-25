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
public class Room {

    private String Room_no;
    private String TID;
    private String HID;
    private String No_of_beds;
    private String Floor_number;
    private String Current_Borders_count;
    private String Width;
    private String Length;

    public Room() {
    }

    public Room(String Room_no, String TID, String HID, String No_of_beds, String Floor_number, String Current_Borders_count, String Width, String Length) {
        this.Room_no = Room_no;
        this.TID = TID;
        this.HID = HID;
        this.No_of_beds = No_of_beds;
        this.Floor_number = Floor_number;
        this.Current_Borders_count = Current_Borders_count;
        this.Width = Width;
        this.Length = Length;
    }

    public String getRoom_no() {
        return Room_no;
    }

    public void setRoom_no(String Room_no) {
        this.Room_no = Room_no;
    }

    public String getTID() {
        return TID;
    }

    public void setTID(String TID) {
        this.TID = TID;
    }

    public String getHID() {
        return HID;
    }

    public void setHID(String HID) {
        this.HID = HID;
    }

    public String getNo_of_beds() {
        return No_of_beds;
    }

    public void setNo_of_beds(String No_of_beds) {
        this.No_of_beds = No_of_beds;
    }

    public String getFloor_number() {
        return Floor_number;
    }

    public void setFloor_number(String Floor_number) {
        this.Floor_number = Floor_number;
    }

    public String getCurrent_Borders_count() {
        return Current_Borders_count;
    }

    public void setCurrent_Borders_count(String Current_Borders_count) {
        this.Current_Borders_count = Current_Borders_count;
    }

    public String getWidth() {
        return Width;
    }

    public void setWidth(String Width) {
        this.Width = Width;
    }

    public String getLength() {
        return Length;
    }

    public void setLength(String Length) {
        this.Length = Length;
    }
    
    

}
