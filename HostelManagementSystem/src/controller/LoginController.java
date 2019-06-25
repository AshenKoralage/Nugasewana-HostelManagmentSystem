/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.BOFactory;
import bo.custom.LoginBo;
import entity.Login;
import java.sql.SQLException;

/**
 *
 * @author Ashen Koralage
 */
public class LoginController {
    static LoginBo bo= (LoginBo) BOFactory.getInstance().getBO(BOFactory.BOTypes.LOGIN);

    
    public static Login systemUserLogin(String name,String password) throws Exception{
        return bo.systemUserLogin(name, password);
    }
    
    
}
