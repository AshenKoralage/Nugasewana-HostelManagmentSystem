/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import dao.CrudUtill;
import dao.custom.TypeDAO;
import entity.Type;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ashen Koralage
 */
public class TypeDAOImpl implements TypeDAO {

    @Override
    public boolean add(Type t) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("insert into Type values(?,?,?,?)", t.getTID(), t.getPrice(), t.getName(), t.getDescription());
    }

    @Override
    public boolean update(Type t) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("update Type set price=?,Name=?,Description=? where TID=?", t.getPrice(), t.getName(), t.getDescription(), t.getTID());
    }

    @Override
    public boolean delete(String t) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("delete from Type where TID=?", t);
    }

    @Override
    public Type search(String t) throws ClassNotFoundException, SQLException {
        ResultSet rst = CrudUtill.executeQuery("select * from Type where TID=?", t);
        Type type = null;
        if(rst.next()) {
            type = new Type(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4));

        }
        return type;
    }

    @Override
    public ArrayList<Type> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rst = CrudUtill.executeQuery("select * from Type");
        ArrayList<Type> allTypes = new ArrayList<>();
        while (rst.next()) {
            allTypes.add(new Type(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4)));
        }
        return allTypes;
    }

    @Override
    public ArrayList<Type> getAllAvailableHostels() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
