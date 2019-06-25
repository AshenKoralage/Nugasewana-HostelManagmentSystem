/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import dto.ReservationDTO;
import entity.CustomEntity;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ashen Koralage
 */
public interface ReservationBO extends SuperBO {

    public ArrayList<ReservationDTO> getAllDetails(String Name, String Gender) throws ClassNotFoundException, SQLException;
}
