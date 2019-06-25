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
public class KeyMoney {
    private String KID;
    private String GID;
    private String paidDate;
    private String amount;
    private String pay_BackDate;

    public KeyMoney() {
    }

    public KeyMoney(String KID, String GID, String paidDate, String amount, String pay_BackDate) {
        this.KID = KID;
        this.GID = GID;
        this.paidDate = paidDate;
        this.amount = amount;
        this.pay_BackDate = pay_BackDate;
    }

    public String getKID() {
        return KID;
    }

    public void setKID(String KID) {
        this.KID = KID;
    }

    public String getGID() {
        return GID;
    }

    public void setGID(String GID) {
        this.GID = GID;
    }

    public String getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(String paidDate) {
        this.paidDate = paidDate;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPay_BackDate() {
        return pay_BackDate;
    }

    public void setPay_BackDate(String pay_BackDate) {
        this.pay_BackDate = pay_BackDate;
    }
    
}
