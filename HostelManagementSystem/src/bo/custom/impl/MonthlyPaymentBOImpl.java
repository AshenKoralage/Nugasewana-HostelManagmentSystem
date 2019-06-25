/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;

import bo.custom.MonthlyPaymentBO;
import dao.DAOFactory;
import dao.custom.MonthlyPaymentDAO;
import dto.MonthlyPaymentDTO;
import entity.MonthlyPayment;
import java.sql.SQLException;

/**
 *
 * @author Ashen Koralage
 */
public class MonthlyPaymentBOImpl implements MonthlyPaymentBO {

    static MonthlyPaymentDAO dao = (MonthlyPaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.MONTHLYPAYMENT);

    @Override
    public boolean addPayment(MonthlyPaymentDTO pay) throws ClassNotFoundException, SQLException {
        return dao.add(new MonthlyPayment(pay.getMpid(),pay.getGid(),pay.getAmount(),pay.getPaymentdate(),pay.getNextPaymentDate()));

    }

    @Override
    public MonthlyPaymentDTO searchPayment(String gid) throws ClassNotFoundException, SQLException {
       MonthlyPayment search =dao.search(gid);
       if(search!=null){
           return new MonthlyPaymentDTO(search.getMpid(),search.getGID(),search.getAmount(),search.getPayment_date(),search.getNextPaymentDate());
       }
       return null;
    }

}
