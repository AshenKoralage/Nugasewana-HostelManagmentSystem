/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import dao.CrudUtill;
import dao.custom.FacilityDAO;
import entity.Facility;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ashen Koralage
 */
public class FacilityDAOImpl implements FacilityDAO{
                     
    @Override
    public boolean add(Facility t) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("insert into Facility values(?,?)", t.getFID(),t.getName());
    }

    @Override
    public boolean update(Facility t) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("update facility set Name=? where FID=?", t.getName(),t.getFID());
    }

    @Override
    public boolean delete(String t) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("delete from facility where FID=?", t);
    }

    @Override
    public Facility search(String t) throws ClassNotFoundException, SQLException {
        ResultSet rst = CrudUtill.executeQuery("select * from facility where FID=?", t);
        Facility facility=null;
        while(rst.next()){
            facility = new Facility(rst.getString(1),rst.getString(2));
        }
        return facility;
    }

    @Override
    public ArrayList<Facility> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rst = CrudUtill.executeQuery("select * from facility");
        ArrayList<Facility> allFacility =new ArrayList<>();
        while(rst.next()){
            allFacility.add(new Facility(rst.getString(1),rst.getString(2)));
        }
        return allFacility;
    }

    @Override
    public ArrayList<Facility> getAllAvailableHostels() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
