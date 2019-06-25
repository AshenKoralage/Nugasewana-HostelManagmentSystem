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
public class Reservation2 {

    private String REID;
    private String Room_no;
    private String GID;
    private String Payment_date;
    private String Checking_date;
    private String Checking_out;
    private String Booking_date;
    private String Key_money_amount;

    public Reservation2(String REID, String Room_no, String GID, String Payment_date, String Checking_date, String Checking_out, String Booking_date, String Key_money_amount) {
        this.REID = REID;
        this.Room_no = Room_no;
        this.GID = GID;
        this.Payment_date = Payment_date;
        this.Checking_date = Checking_date;
        this.Checking_out = Checking_out;
        this.Booking_date = Booking_date;
        this.Key_money_amount = Key_money_amount;
    }

    public String getREID() {
        return REID;
    }

    public void setREID(String REID) {
        this.REID = REID;
    }

    public String getRoom_no() {
        return Room_no;
    }

    public void setRoom_no(String Room_no) {
        this.Room_no = Room_no;
    }

    public String getGID() {
        return GID;
    }

    public void setGID(String GID) {
        this.GID = GID;
    }

    public String getPayment_date() {
        return Payment_date;
    }

    public void setPayment_date(String Payment_date) {
        this.Payment_date = Payment_date;
    }

    public String getChecking_date() {
        return Checking_date;
    }

    public void setChecking_date(String Checking_date) {
        this.Checking_date = Checking_date;
    }

    public String getChecking_out() {
        return Checking_out;
    }

    public void setChecking_out(String Checking_out) {
        this.Checking_out = Checking_out;
    }

    public String getBooking_date() {
        return Booking_date;
    }

    public void setBooking_date(String Booking_date) {
        this.Booking_date = Booking_date;
    }

    public String getKey_money_amount() {
        return Key_money_amount;
    }

    public void setKey_money_amount(String Key_money_amount) {
        this.Key_money_amount = Key_money_amount;
    }
    
     
}
