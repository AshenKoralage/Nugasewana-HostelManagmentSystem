/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import dao.CrudUtill;
import dao.custom.RoomDAO;
import entity.Room;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



/**
 *
 * @author Ashen Koralage
 */
public class RoomDAOImpl implements RoomDAO{

    @Override
    public boolean add(Room t) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("insert into Room values(?,?,?,?,?,?,?,?)", t.getRoom_no(),t.getTID(),t.getHID(),t.getNo_of_beds(),t.getFloor_number(),t.getCurrent_Borders_count(),t.getWidth(),t.getLength());
        
    }

    @Override
    public boolean update(Room t) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("update Room set TID=?,HID=?, No_of_beds=?,Floor_number=?,Current_Borders_count=?, Width=?,Length=? where Room_no=?", t.getTID(),t.getHID(),t.getNo_of_beds(),t.getFloor_number(),t.getCurrent_Borders_count(),t.getWidth(),t.getLength(),t.getRoom_no());
    }

    @Override
    public boolean delete(String t) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("delete from Room where Room_no=?",t);
    }

    @Override
    public Room search(String t) throws ClassNotFoundException, SQLException {
        ResultSet rst = CrudUtill.executeQuery("select * from Room where Room_no=?",t);
        Room room=null;
        if(rst.next()){
            room =new Room(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7),rst.getString(8));
        }
        return room;
    }

    @Override
    public ArrayList<Room> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rst = CrudUtill.executeQuery("select * from Room");
        ArrayList<Room> allRooms =new ArrayList<>();
        while(rst.next()){
            allRooms.add(new Room(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7),rst.getString(8)));
        }
        return allRooms;
    }

//    @Override
//    public boolean login(String t) throws ClassNotFoundException, SQLException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public ArrayList<Room> getAllAvailableHostels() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}
