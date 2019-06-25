/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import dao.CrudUtill;
import dao.custom.RegistrationDAO;
import entity.Hostel;
import entity.Registration;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ashen Koralage
 */
public class RegistrationDAOImpl implements RegistrationDAO {

    @Override
    public boolean add(Registration t) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("insert into guest values(?,?,?,?,?,?,?,?,?)", t.getGID(), t.getFull_name(), t.getNIC(), t.getAddress(), t.getWork_place(), t.getPhone_NO(), t.getE_mail(), t.getProfession(), t.getGender());
    }

    @Override
    public boolean update(Registration t) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("update guest set Full_name=?,NIC=?,Address=?,Work_place=?,Phone_No=?,E_mail=?,profession=?,gender=? where GID=?", t.getFull_name(), t.getNIC(), t.getAddress(), t.getWork_place(), t.getPhone_NO(), t.getE_mail(), t.getProfession(), t.getGender(), t.getGID());
    }

    @Override
    public boolean delete(String t) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("delete from guest where GID=?", t);
    }

    @Override
    public Registration search(String t) throws ClassNotFoundException, SQLException {
        ResultSet rst = CrudUtill.executeQuery("select * from guest where GID=?", t);
        Registration registration = null;
        if (rst.next()) {

            registration = new Registration(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9));
        }
        return registration;
    }

    @Override
    public ArrayList<Registration> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rst = CrudUtill.executeQuery("select * from guest");
        ArrayList<Registration> allGuests = new ArrayList<>();
        while (rst.next()) {
            allGuests.add(new Registration(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9)));
        }
        return allGuests;
        
    }

    @Override
    public ArrayList<Registration> getAllAvailableHostels() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
