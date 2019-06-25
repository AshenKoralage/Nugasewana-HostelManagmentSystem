/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.BOFactory;
import bo.custom.HostelBO;
import dto.HostelDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ashen Koralage
 */
public class HostelController {

    static HostelBO bo = (HostelBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.HOSTEL);

    public static boolean addHostel(HostelDTO ref) throws ClassNotFoundException, SQLException {
        return bo.addHostel(ref);
    }

    public static boolean updateHostel(HostelDTO ref) throws SQLException, ClassNotFoundException {
        return bo.updateHostel(ref);
    }

    public static boolean deleteHostel(String id) throws SQLException, ClassNotFoundException {
        return bo.deleteHostel(id);
    }

    public static HostelDTO searchHostel(String id) throws SQLException, ClassNotFoundException {
        return bo.searchHostel(id);
    }

    public static ArrayList<HostelDTO> getAllHostels() throws ClassNotFoundException, SQLException {
        return bo.getAllHostels();
    }

}
