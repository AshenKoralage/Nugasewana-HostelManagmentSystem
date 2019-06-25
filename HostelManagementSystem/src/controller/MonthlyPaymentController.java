/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.BOFactory;
import bo.custom.MonthlyPaymentBO;

import dto.MonthlyPaymentDTO;
import java.sql.SQLException;

/**
 *
 * @author Ashen Koralage
 */
public class MonthlyPaymentController {

    static MonthlyPaymentBO bo = (MonthlyPaymentBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.MONTHLYPAYMENT);

    public static boolean addpayment(MonthlyPaymentDTO pay) throws ClassNotFoundException, SQLException {
        return bo.addPayment(pay);

    }

    public static MonthlyPaymentDTO searchPayment(String gid) throws ClassNotFoundException, SQLException {
        return bo.searchPayment(gid);
    }

}
