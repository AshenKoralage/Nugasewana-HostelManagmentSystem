/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import dto.TypeDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ashen Koralage
 */
public interface TypeBO extends SuperBO {

    public boolean addType(TypeDTO type) throws ClassNotFoundException, SQLException;

    public boolean deleteType(String ID) throws ClassNotFoundException, SQLException;

    public boolean updateType(TypeDTO type) throws ClassNotFoundException, SQLException;

    public TypeDTO searchType(String ID) throws ClassNotFoundException, SQLException;

    public ArrayList<TypeDTO> getAllTypes() throws ClassNotFoundException, SQLException;

}
