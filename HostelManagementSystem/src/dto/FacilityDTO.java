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
public class FacilityDTO {
    private String FID;
    private String Name;

    public FacilityDTO() {
    }

    public FacilityDTO(String FID, String Name) {
        this.FID = FID;
        this.Name = Name;
    }

    public String getFID() {
        return FID;
    }

    public void setFID(String FID) {
        this.FID = FID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
}
