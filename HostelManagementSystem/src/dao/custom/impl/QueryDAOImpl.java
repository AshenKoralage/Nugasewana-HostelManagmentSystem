/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import dao.CrudUtill;
import dao.custom.QueryDAO;
import entity.CustomEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ashen Koralage
 */
public class QueryDAOImpl implements QueryDAO {

    @Override
    public boolean add(CustomEntity t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(CustomEntity t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomEntity search(String t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CustomEntity> getAll() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CustomEntity> getAllAvailableHostels() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CustomEntity> getAllDetails(String Name, String Gender) throws ClassNotFoundException, SQLException {
         ResultSet rst = CrudUtill.executeQuery("select  hostel.HID,room.Room_no,room.Current_Borders_count,"
                + "room.No_of_beds,room.Floor_number,room.Width,"
                + "room.Length "
                + "from hostel hostel,Room Room,Type Type "
                + "where hostel.HID = room.HID AND room.TID = type.TID AND type.Name = ?"
                + "AND hostel.Gender_of_residence=? AND room.Current_Borders_count < room.No_of_beds", Name, Gender);
        ArrayList<CustomEntity> allDetails =new  ArrayList<>();
        while(rst.next()){
            allDetails.add(new CustomEntity(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7)));
        }
        return allDetails;
    }

}
