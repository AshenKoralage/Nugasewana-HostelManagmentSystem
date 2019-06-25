/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import dto.FacilityDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ashen Koralage
 */
public interface FacilityBO extends SuperBO {

    public boolean addFacility(FacilityDTO faci) throws ClassNotFoundException, SQLException;

    public boolean deleteFacility(String ID) throws ClassNotFoundException, SQLException;

    public boolean updateFacility(FacilityDTO faci) throws ClassNotFoundException, SQLException;

    public FacilityDTO searchFacility(String ID) throws ClassNotFoundException, SQLException;

    public ArrayList<FacilityDTO> getAllFacilities() throws ClassNotFoundException, SQLException;
}
