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
public class MonthlyPayment {

    private String mpid;
    private String GID;
    private String Amount;
    private String payment_date;
    private String nextPaymentDate;

    public MonthlyPayment() {
    }

    public MonthlyPayment(String mpid, String GID, String Amount, String payment_date, String nextPaymentDate) {
        this.mpid = mpid;
        this.GID = GID;
        this.Amount = Amount;
        this.payment_date = payment_date;
        this.nextPaymentDate = nextPaymentDate;
    }

    public String getMpid() {
        return mpid;
    }

    public void setMpid(String mpid) {
        this.mpid = mpid;
    }

    public String getGID() {
        return GID;
    }

    public void setGID(String GID) {
        this.GID = GID;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    public String getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(String payment_date) {
        this.payment_date = payment_date;
    }

    public String getNextPaymentDate() {
        return nextPaymentDate;
    }

    public void setNextPaymentDate(String nextPaymentDate) {
        this.nextPaymentDate = nextPaymentDate;
    }
    
    
}
