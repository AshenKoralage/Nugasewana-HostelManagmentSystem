/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;

import dao.DAOFactory;
import dto.KeyMoneyDTO;
import entity.KeyMoney;
import java.sql.SQLException;
import dao.custom.KeyMoneyDAO;
import bo.custom.KeyMoneyBO;

/**
 *
 * @author Ashen Koralage
 */
public class KeyMoneyBOImpl implements KeyMoneyBO {

    static KeyMoneyDAO dao = (KeyMoneyDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENTS);

    @Override
    public boolean addPayment(KeyMoneyDTO pay) throws ClassNotFoundException, SQLException {
        return dao.add(new KeyMoney(pay.getkID(),pay.getGid(),pay.getPaidDate(),pay.getAmount(),pay.getPay_BackDate()));

    }

    @Override
    public KeyMoneyDTO searchKeyMoney(String gid) throws ClassNotFoundException, SQLException {
        KeyMoney search =dao.search(gid);
        if(search!=null){
            return new KeyMoneyDTO(search.getKID(),search.getGID(),search.getPaidDate(),search.getAmount(),search.getPay_BackDate());
        }
        return null;
    }

    @Override
    public boolean deleteKeyMoney(String gid) throws ClassNotFoundException, SQLException {
        return dao.delete(gid);
    }

}
