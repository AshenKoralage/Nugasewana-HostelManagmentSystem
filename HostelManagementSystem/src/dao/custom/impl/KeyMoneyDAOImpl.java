/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import dao.CrudDAO;
import dao.CrudUtill;
import entity.KeyMoney;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import dao.custom.KeyMoneyDAO;

/**
 *
 * @author Ashen Koralage
 */
public class KeyMoneyDAOImpl implements KeyMoneyDAO{

    @Override
    public boolean add(KeyMoney t) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("INSERT INTO key_Money VALUES(?,?,?,?,?)", t.getKID(),t.getGID(),t.getPaidDate(),t.getAmount(),t.getPay_BackDate());
    }

    @Override
    public boolean update(KeyMoney t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String t) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("delete from Key_Money where GID=?", t);
    }

    @Override
    public KeyMoney search(String t) throws ClassNotFoundException, SQLException {
        ResultSet rst = CrudUtill.executeQuery("SELECT * FROM key_Money WHERE GID =?",t);
        KeyMoney payments =null;
        if(rst.next()){
            payments =new KeyMoney(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5));
        }
        return payments;
    }

    @Override
    public ArrayList<KeyMoney> getAll() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<KeyMoney> getAllAvailableHostels() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
