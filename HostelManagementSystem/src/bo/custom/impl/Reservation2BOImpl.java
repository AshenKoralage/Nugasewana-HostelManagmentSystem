/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;

import bo.custom.Reservation2BO;
import dao.DAOFactory;
import dao.custom.ReservationDAO;
import dto.Reservation2DTO;
import entity.Reservation2;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ashen Koralage
 */
public class Reservation2BOImpl implements Reservation2BO{
    static ReservationDAO dao = (ReservationDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.RESERVATION2);

    @Override
    public boolean add(Reservation2DTO res) throws ClassNotFoundException, SQLException {
        return dao.add(new Reservation2(res.getREID(),res.getRoom_no(),res.getGID(),res.getPayment_date(),res.getChecking_date(),res.getChecking_out(),res.getBooking_date(),res.getKey_money_amount()));
    }

    @Override
    public boolean updateReservation(Reservation2DTO res) throws ClassNotFoundException, SQLException {
        return dao.update(new Reservation2(res.getREID(),res.getRoom_no(),res.getGID(),res.getPayment_date(),res.getChecking_date(),res.getChecking_out(),res.getBooking_date(),res.getKey_money_amount()));
    }

    @Override
    public boolean deleteReservation(String ID) throws ClassNotFoundException, SQLException {
        return dao.delete(ID);
    }

    @Override
    public Reservation2DTO searchReservation(String ID) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Reservation2DTO> getAllReservations() throws ClassNotFoundException, SQLException {
        ArrayList<Reservation2> allres= dao.getAll();
        ArrayList<Reservation2DTO> all=new ArrayList<>();
        for (Reservation2 search : allres) {
            all.add(new Reservation2DTO(search.getREID(), search.getRoom_no(), search.getGID(), search.getPayment_date(), search.getChecking_date(), search.getChecking_out(), search.getBooking_date(), search.getKey_money_amount()));
        }
        return all;
    }
    
    
}
