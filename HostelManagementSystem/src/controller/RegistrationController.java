/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.BOFactory;
import bo.custom.RegistrationBO;
import dto.RegistrationDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ashen Koralage
 */
public class RegistrationController {

    static RegistrationBO bo = (RegistrationBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.REGISTRATION);

    public static boolean addGuest(RegistrationDTO reg) throws ClassNotFoundException, SQLException {
        return bo.addGuest(reg);

    }

    public static ArrayList<RegistrationDTO> getAllGuests() throws ClassNotFoundException, SQLException {
        return bo.getAllGuests();

    }

    public static boolean deleteGuest(String guestID) throws ClassNotFoundException, SQLException {
        return bo.deleteGuest(guestID);
    }

    public static boolean updateGuest(RegistrationDTO ref) throws SQLException, ClassNotFoundException {
        return bo.updateGuest(ref);
    }

    public static RegistrationDTO searchGuest(String ID)throws SQLException, ClassNotFoundException  {
        return bo.searchRoom(ID);
    }

}
