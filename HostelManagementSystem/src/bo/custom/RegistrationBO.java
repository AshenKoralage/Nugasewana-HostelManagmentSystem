/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import dto.HostelDTO;
import dto.RegistrationDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ashen Koralage
 */
public interface RegistrationBO extends SuperBO {

    public boolean addGuest(RegistrationDTO registration) throws ClassNotFoundException, SQLException;

    public ArrayList<RegistrationDTO> getAllGuests() throws ClassNotFoundException, SQLException;

    public boolean deleteGuest(String ID) throws ClassNotFoundException, SQLException;

    public RegistrationDTO searchRoom(String ID) throws ClassNotFoundException, SQLException;

    public boolean updateGuest(RegistrationDTO ref) throws ClassNotFoundException, SQLException;

}
