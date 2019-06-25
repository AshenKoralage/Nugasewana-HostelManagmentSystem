/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom;

import dao.CrudDAO;
import entity.Login;

/**
 *
 * @author Ashen Koralage
 */
public interface LoginDAO extends CrudDAO<Login, String>{
    
   Login systemUserLogin(String name,String password) throws Exception;
    
}
