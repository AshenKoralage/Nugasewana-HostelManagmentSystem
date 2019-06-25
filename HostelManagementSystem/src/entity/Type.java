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
public class Type {
    private String TID;
    private String Price;
    private String Name;
    private String Description;

    public Type() {
    }

    public Type(String TID, String Price, String Name, String Description) {
        this.TID = TID;
        this.Price = Price;
        this.Name = Name;
        this.Description = Description;
    }

    public String getTID() {
        return TID;
    }

    public void setTID(String TID) {
        this.TID = TID;
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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    
}
