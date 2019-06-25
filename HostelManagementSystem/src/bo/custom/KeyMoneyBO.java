/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import dto.KeyMoneyDTO;
import java.sql.SQLException;

/**
 *
 * @author Ashen Koralage
 */
public interface KeyMoneyBO extends SuperBO{

    public boolean addPayment(KeyMoneyDTO PayModel)throws ClassNotFoundException,SQLException;

    public KeyMoneyDTO searchKeyMoney(String gid)throws ClassNotFoundException,SQLException;

    public boolean deleteKeyMoney(String gid)throws ClassNotFoundException,SQLException;
    
}
