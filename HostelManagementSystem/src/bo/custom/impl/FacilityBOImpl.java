/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;

import bo.custom.FacilityBO;
import dao.DAOFactory;
import dao.custom.FacilityDAO;
import dto.FacilityDTO;
import dto.HostelDTO;
import entity.Facility;
import entity.Hostel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ashen Koralage
 */
public class FacilityBOImpl implements FacilityBO {

    static FacilityDAO dao = (FacilityDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.FACILITY);

    @Override
    public boolean addFacility(FacilityDTO faci) throws ClassNotFoundException, SQLException {
        return dao.add(new Facility(faci.getFID(), faci.getName()));
    }

    @Override
    public boolean deleteFacility(String ID) throws ClassNotFoundException, SQLException {
        return dao.delete(ID);
    }

    @Override
    public boolean updateFacility(FacilityDTO faci) throws ClassNotFoundException, SQLException {
        return dao.update(new Facility(faci.getFID(), faci.getName()));
    }

    @Override
    public FacilityDTO searchFacility(String ID) throws ClassNotFoundException, SQLException {
        Facility search = dao.search(ID);
        if (search != null) {
            return new FacilityDTO(search.getFID(), search.getName());
        }
        return null;

    }

    @Override
    public ArrayList<FacilityDTO> getAllFacilities() throws ClassNotFoundException, SQLException {
        ArrayList<Facility> all = dao.getAll();
        ArrayList<FacilityDTO> allFacility = new ArrayList<>();
        for (Facility search : all) {
            allFacility.add(new FacilityDTO(search.getFID(), search.getName()));
        }
        return allFacility;
    }
}
