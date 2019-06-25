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
public class KeyMoneyDTO {
    private String kID;
    private String gid;
    private String paidDate;
    private String amount;
    private String pay_BackDate;
    
    
    
     

    public KeyMoneyDTO() {
    }

    public KeyMoneyDTO(String kID, String gid, String paidDate, String amount, String pay_BackDate) {
        this.kID = kID;
        this.gid = gid;
        this.paidDate = paidDate;
        this.amount = amount;
        this.pay_BackDate = pay_BackDate;
    }

    public String getkID() {
        return kID;
    }

    public void setkID(String kID) {
        this.kID = kID;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
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

    public String getKID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     
}
