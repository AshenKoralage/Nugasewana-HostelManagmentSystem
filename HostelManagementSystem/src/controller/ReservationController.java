/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.BOFactory;
import bo.custom.ReservationBO;
import dto.Reservation2DTO;
import dto.ReservationDTO;
import entity.CustomEntity;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ashen Koralage
 */
public class ReservationController {

    static ReservationBO bo = (ReservationBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.RESERVATION);

    public static ArrayList<ReservationDTO> getAllDetails(String typename, String gender) throws ClassNotFoundException, SQLException {

        return bo.getAllDetails(typename, gender);
    }

}
