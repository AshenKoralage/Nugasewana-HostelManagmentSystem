/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Ashen Koralage
 */
public class ReservationDTO {
    private String Name;
    private String HID;
    private String Room_no;
    private String Floor_number;
    private String No_of_beds;
    private String Current_Borders_count;
    private String Width;
    private String Length;
    private String Gender;

    public ReservationDTO(String Name, String Gender) {
        this.Name = Name;
        this.Gender = Gender;
    }

    public ReservationDTO(String HID, String Room_no, String Floor_number, String No_of_beds, String Current_Borders_count, String Width, String Length) {
        this.HID = HID;
        this.Room_no = Room_no;
        this.Floor_number = Floor_number;
        this.No_of_beds = No_of_beds;
        this.Current_Borders_count = Current_Borders_count;
        this.Width = Width;
        this.Length = Length;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getHID() {
        return HID;
    }

    public void setHID(String HID) {
        this.HID = HID;
    }

    public String getRoom_no() {
        return Room_no;
    }

    public void setRoom_no(String Room_no) {
        this.Room_no = Room_no;
    }

    public String getFloor_number() {
        return Floor_number;
    }

    public void setFloor_number(String Floor_number) {
        this.Floor_number = Floor_number;
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

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    
}
