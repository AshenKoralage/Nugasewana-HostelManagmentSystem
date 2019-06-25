/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import dao.CrudUtill;
import dao.custom.ReservationDAO;
import entity.Reservation2;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ashen Koralage
 */
public class Reservation2DAOImpl implements ReservationDAO{

    @Override
    public boolean add(Reservation2 t) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("INSERT INTO reservation VALUES(?,?,?,?,?,?,?,?)", t.getREID(),t.getRoom_no(),t.getGID(),t.getPayment_date(),t.getChecking_date(),t.getChecking_out(),t.getBooking_date(),t.getKey_money_amount());
    }

    @Override
    public boolean update(Reservation2 t) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("UPDATE reservation SET Room_no=?,GID=?,Payment_date=?,Checking_date=?,Checking_out=?,Booking_date=?,Key_money_amount=? WHERE REID=?", t.getRoom_no(),t.getGID(),t.getPayment_date(),t.getChecking_date(),t.getChecking_out(),t.getBooking_date(),t.getKey_money_amount(),t.getREID());
    }

    @Override
    public boolean delete(String t) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("DELETE FROM reservation WHERE REID=?", t);
    }

    @Override
    public Reservation2 search(String t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Reservation2> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rst = CrudUtill.executeQuery("SELECT * FROM reservation");
        ArrayList<Reservation2> allRes =new ArrayList<>();
        while(rst.next()){
            allRes.add(new Reservation2(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7),rst.getString(8)));
        }
        return allRes;
    }

    @Override
    public ArrayList<Reservation2> getAllAvailableHostels() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
