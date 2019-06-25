/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;

import bo.custom.ReservationBO;
import dao.DAOFactory;
import dao.custom.QueryDAO;
import dto.ReservationDTO;
import entity.CustomEntity;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ashen Koralage
 */
public class ReservationBOImpl implements ReservationBO {

    static QueryDAO dao = (QueryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.QUERYDAO);

    @Override
    public ArrayList<ReservationDTO> getAllDetails(String Name, String Gender) throws ClassNotFoundException, SQLException {
        ArrayList<CustomEntity> all = dao.getAllDetails(Name, Gender);
        ArrayList<ReservationDTO> allDetails = new ArrayList<>();
        for (CustomEntity details : all) {
           
            allDetails.add(new ReservationDTO(details.getHID(), details.getRoom_no(), details.getCurrent_Borders_count(), details.getNo_of_beds(), details.getFloor_number(), details.getWidth(), details.getLength()));
        }
        return allDetails;
    }

}
