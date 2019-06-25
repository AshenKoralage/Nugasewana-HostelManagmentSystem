/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import dto.MonthlyPaymentDTO;
import java.sql.SQLException;

/**
 *
 * @author Ashen Koralage
 */
public interface MonthlyPaymentBO extends SuperBO {

    public boolean addPayment(MonthlyPaymentDTO pay) throws ClassNotFoundException, SQLException;

    public MonthlyPaymentDTO searchPayment(String gid) throws ClassNotFoundException, SQLException;
;

}
