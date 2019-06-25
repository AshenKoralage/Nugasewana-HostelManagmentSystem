/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.BOFactory;
import bo.custom.TypeBO;
import dto.TypeDTO;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author Ashen Koralage
 */
public class TypeController {
    static TypeBO bo= (TypeBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.TYPE);
    
     public static boolean addType(TypeDTO type)throws ClassNotFoundException,SQLException{
         return bo.addType(type);
     }

    public static ArrayList<TypeDTO> getAllTypes() throws ClassNotFoundException, SQLException {
        return bo.getAllTypes();
    }

    public static boolean deleteType(String tid) throws ClassNotFoundException, SQLException {
        return bo.deleteType(tid);
    }

    public static boolean updateType(TypeDTO type) throws ClassNotFoundException, SQLException {
        return bo.updateType(type);
        
    }
    
    public static TypeDTO searchType(String Tid) throws ClassNotFoundException, SQLException {
        return bo.searchType(Tid);
        
    }
     
     
}
