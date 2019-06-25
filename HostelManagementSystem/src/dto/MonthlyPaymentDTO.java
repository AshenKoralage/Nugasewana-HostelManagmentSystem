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
public class MonthlyPaymentDTO {
    private String mpid;
    private String gid;
    private String amount;
    private String paymentdate;
    private String nextPaymentDate;

    public MonthlyPaymentDTO() {
    }

    public MonthlyPaymentDTO(String mpid, String gid, String amount, String paymentdate, String nextPaymentDate) {
        this.mpid = mpid;
        this.gid = gid;
        this.amount = amount;
        this.paymentdate = paymentdate;
        this.nextPaymentDate = nextPaymentDate;
    }

    public String getMpid() {
        return mpid;
    }

    public void setMpid(String mpid) {
        this.mpid = mpid;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(String paymentdate) {
        this.paymentdate = paymentdate;
    }

    public String getNextPaymentDate() {
        return nextPaymentDate;
    }

    public void setNextPaymentDate(String nextPaymentDate) {
        this.nextPaymentDate = nextPaymentDate;
    }
    
    
}
