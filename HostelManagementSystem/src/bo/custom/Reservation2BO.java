/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import dto.Reservation2DTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ashen Koralage
 */
public interface Reservation2BO extends SuperBO{
    public boolean add(Reservation2DTO res) throws ClassNotFoundException, SQLException;

    public boolean updateReservation(Reservation2DTO res) throws ClassNotFoundException, SQLException;

    public boolean deleteReservation(String ID) throws ClassNotFoundException, SQLException;

    public Reservation2DTO searchReservation(String ID) throws ClassNotFoundException, SQLException;

    public ArrayList<Reservation2DTO> getAllReservations() throws ClassNotFoundException, SQLException;
}
