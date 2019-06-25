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
public class FacilityTypeDTO {
    private String tid;
    private String fid;
    private String facilityName;

    public FacilityTypeDTO() {
    }

    public FacilityTypeDTO(String tid, String fid) {
        this.tid = tid;
        this.fid = fid;
    }

    /**
     * @return the tid
     */
    public String getTid() {
        return tid;
    }

    /**
     * @param tid the tid to set
     */
    public void setTid(String tid) {
        this.tid = tid;
    }

    /**
     * @return the fid
     */
    public String getFid() {
        return fid;
    }

    /**
     * @param fid the fid to set
     */
    public void setFid(String fid) {
        this.fid = fid;
    }
    
    
    
}
