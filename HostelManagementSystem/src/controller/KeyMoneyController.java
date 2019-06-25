/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.BOFactory;
import dto.KeyMoneyDTO;
import java.sql.SQLException;
import bo.custom.KeyMoneyBO;

/**
 *
 * @author Ashen Koralage
 */
public class KeyMoneyController {

    static KeyMoneyBO bo = (KeyMoneyBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.PAYMENTS);

    public static boolean addPayment(KeyMoneyDTO Pay) throws ClassNotFoundException, SQLException {
        return bo.addPayment(Pay);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static KeyMoneyDTO searchPayment(String gid) throws ClassNotFoundException, SQLException {
        return bo.searchKeyMoney(gid);

    }

    public static boolean deleteKeyMoney(String gid) throws ClassNotFoundException, SQLException {
        return bo.deleteKeyMoney(gid);
    }

}
