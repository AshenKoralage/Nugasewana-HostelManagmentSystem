/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.BOFactory;
import bo.custom.Reservation2BO;
import dto.Reservation2DTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ashen Koralage
 */
public class Reservation2Controller {

    static Reservation2BO bo = (Reservation2BO) BOFactory.getInstance().getBO(BOFactory.BOTypes.RESERVATION2);

    public static boolean reserveRoom(Reservation2DTO reservationModel) throws ClassNotFoundException, SQLException {
        return bo.add(reservationModel);
    }

    public static ArrayList<Reservation2DTO> getAll() throws ClassNotFoundException, SQLException {
        return bo.getAllReservations();
    }

    public static boolean deleteRes(String reId) throws ClassNotFoundException, SQLException {
        return bo.deleteReservation(reId);
    }

    public static boolean updateReservation(Reservation2DTO resDto) throws ClassNotFoundException, SQLException {
        return bo.updateReservation(resDto);
    }

}
