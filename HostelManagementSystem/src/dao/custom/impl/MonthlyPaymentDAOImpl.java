/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import bo.custom.MonthlyPaymentBO;
import dao.CrudUtill;
import dao.custom.MonthlyPaymentDAO;
import entity.MonthlyPayment;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ashen Koralage
 */
public class MonthlyPaymentDAOImpl implements MonthlyPaymentDAO{

    @Override
    public boolean add(MonthlyPayment t) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("INSERT INTO monthly_Payment VALUES(?,?,?,?,?)", t.getMpid(),t.getGID(),t.getAmount(),t.getPayment_date(),t.getNextPaymentDate());
    }

    @Override
    public boolean update(MonthlyPayment t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MonthlyPayment search(String t) throws ClassNotFoundException, SQLException {
        ResultSet rst = CrudUtill.executeQuery("SELECT * FROM monthly_Payment WHERE GID=?", t);
        MonthlyPayment payment=null;
        if(rst.next()){
            payment=new MonthlyPayment(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5)); 
        }
        return payment;
    }

    @Override
    public ArrayList<MonthlyPayment> getAll() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<MonthlyPayment> getAllAvailableHostels() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
