/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import entity.Login;
import java.sql.SQLException;

/**
 *
 * @author Ashen Koralage
 */
public interface LoginBo extends SuperBO{

    public String matchPassword(String userName)throws ClassNotFoundException,SQLException;
    
    Login systemUserLogin(String name,String password) throws Exception;
    

   
    
}
