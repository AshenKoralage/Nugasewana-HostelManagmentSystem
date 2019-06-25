/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;

import bo.custom.RegistrationBO;
import static bo.custom.impl.HostelBOImpl.dao;
import dao.DAOFactory;
import dao.custom.RegistrationDAO;
import dto.HostelDTO;
import dto.RegistrationDTO;
import entity.Hostel;
import entity.Registration;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ashen Koralage
 */
public class RegistrationBOImpl implements RegistrationBO {

    static RegistrationDAO dao = (RegistrationDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.REGISTRATION);

    @Override
    public boolean addGuest(RegistrationDTO reg) throws ClassNotFoundException, SQLException {
        return dao.add(new Registration(reg.getGID(), reg.getFull_name(), reg.getNIC(), reg.getAddress(), reg.getWork_place(), reg.getPhone_NO(), reg.getE_mail(), reg.getProfession(), reg.getGender()));
    }

    @Override
    public ArrayList<RegistrationDTO> getAllGuests() throws ClassNotFoundException, SQLException {
        ArrayList<Registration> all = dao.getAll();
        ArrayList<RegistrationDTO> allGuests = new ArrayList<>();
        for (Registration search : all) {
            allGuests.add(new RegistrationDTO(search.getGID(), search.getFull_name(), search.getNIC(), search.getAddress(), search.getWork_place(), search.getPhone_NO(), search.getE_mail(), search.getProfession(), search.getGender()));
        }
        return allGuests;
    }

    @Override
    public boolean deleteGuest(String ID) throws ClassNotFoundException, SQLException {
        return dao.delete(ID);
    }

    @Override
    public RegistrationDTO searchRoom(String ID) throws ClassNotFoundException, SQLException {
        Registration search = dao.search(ID);
        if(search != null){
            return new RegistrationDTO(search.getGID(),search.getFull_name(),search.getNIC(),search.getAddress(),search.getWork_place(),search.getPhone_NO(),search.getE_mail(),search.getProfession(),search.getGender());
        }
        return null;
    }

    @Override
    public boolean updateGuest(RegistrationDTO ref) throws ClassNotFoundException, SQLException {
        return dao.update(new Registration(ref.getGID(),ref.getFull_name(),ref.getNIC(),ref.getAddress(),ref.getWork_place(),ref.getPhone_NO(),ref.getE_mail(),ref.getProfession(),ref.getGender()));
    }

}
