/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;

import bo.custom.HostelBO;
import dao.DAOFactory;
import dao.custom.HostelDAO;
import dto.HostelDTO;
import entity.Hostel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ashen Koralage
 */
public class HostelBOImpl implements HostelBO {

    static HostelDAO dao = (HostelDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.HOSTEL);

    @Override
    public boolean addHostel(HostelDTO hostel) throws ClassNotFoundException, SQLException {
        return dao.add(new Hostel(hostel.getHID(), hostel.getNo_of_Rooms(), hostel.getGender_of_residence(), hostel.getPhone_Number(),hostel.getAddress()));
    }

    @Override
    public boolean deleteHostel(String ID) throws ClassNotFoundException, SQLException {
        return dao.delete(ID);
    }

    @Override
    public boolean updateHostel(HostelDTO hostel) throws ClassNotFoundException, SQLException {
        return dao.update(new Hostel(hostel.getHID(), hostel.getNo_of_Rooms(), hostel.getGender_of_residence(), hostel.getAddress(),hostel.getPhone_Number()));
    }

    @Override
    public HostelDTO searchHostel(String ID) throws ClassNotFoundException, SQLException {
        Hostel search = dao.search(ID);
        if(search != null){
            return new HostelDTO(search.getHID(),search.getNo_of_Rooms(),search.getGender_of_residence(),search.getPhone_Number(),search.getAddress());
        }
        return null;
    }

    @Override
    public ArrayList<HostelDTO> getAllHostels() throws ClassNotFoundException, SQLException {
        ArrayList<Hostel>all =dao.getAll();
        ArrayList<HostelDTO>allHostels =new ArrayList<>();
        for (Hostel search : all) {
            allHostels.add(new HostelDTO(search.getHID(),search.getNo_of_Rooms(),search.getGender_of_residence(),search.getPhone_Number(),search.getAddress()));
        }
        return allHostels;
    }

  }
