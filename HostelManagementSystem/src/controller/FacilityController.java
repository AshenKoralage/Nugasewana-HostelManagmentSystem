/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.BOFactory;
import bo.custom.FacilityBO;
import dto.FacilityDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ashen Koralage
 */
public class FacilityController {

    static FacilityBO bo = (FacilityBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.FACILITY);

    public static boolean addFacility(FacilityDTO faci) throws ClassNotFoundException, SQLException {
        return bo.addFacility(faci);
    }

    public static ArrayList<FacilityDTO> getAllFacility() throws ClassNotFoundException, SQLException {
        return bo.getAllFacilities();
    }

    public static boolean deleteFacility(String faciID) throws ClassNotFoundException, SQLException {
        return bo.deleteFacility(faciID);
    }

    public static boolean updateFacility(FacilityDTO faci) throws ClassNotFoundException, SQLException {
        return bo.updateFacility(faci);
    }

    public static FacilityDTO searchFacility(String id) throws ClassNotFoundException, SQLException {
        return bo.searchFacility(id);
    }

}
