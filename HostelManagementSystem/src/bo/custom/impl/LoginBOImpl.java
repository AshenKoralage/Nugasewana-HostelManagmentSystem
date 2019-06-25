/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;

import bo.custom.LoginBo;
import dao.DAOFactory;
import dao.custom.LoginDAO;
import entity.Login;
import java.sql.SQLException;

/**
 *
 * @author Ashen Koralage
 */
public class LoginBOImpl implements LoginBo{
    static LoginDAO dao =(LoginDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.LOGIN);

    @Override
    public String matchPassword(String userName) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Login systemUserLogin(String name, String password) throws Exception {
        return dao.systemUserLogin(name, password);
    }
    
    
}
