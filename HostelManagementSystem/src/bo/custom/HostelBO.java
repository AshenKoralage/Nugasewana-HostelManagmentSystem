/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import dto.HostelDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ashen Koralage
 */
public interface HostelBO extends SuperBO {

    public boolean addHostel(HostelDTO hotel) throws ClassNotFoundException, SQLException;

    public boolean deleteHostel(String ID) throws ClassNotFoundException, SQLException;

    public boolean updateHostel(HostelDTO hostel) throws ClassNotFoundException, SQLException;

    public HostelDTO searchHostel(String ID) throws ClassNotFoundException, SQLException;

    public ArrayList<HostelDTO> getAllHostels() throws ClassNotFoundException, SQLException;
    
    
}
