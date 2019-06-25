/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;

import bo.custom.TypeBO;
import static bo.custom.impl.HostelBOImpl.dao;
import dao.DAOFactory;
import dao.custom.FacilityTypeDAO;
import dao.custom.RoomDAO;
import dao.custom.TypeDAO;
import dao.custom.impl.FacilityTypeDAOImpl;
import db.DBConnection;
import dto.FacilityTypeDTO;
import dto.HostelDTO;
import dto.TypeDTO;
import entity.FacilityType;
import entity.Hostel;
import entity.Type;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ashen Koralage
 */
public class TypeBOImpl implements TypeBO {

    TypeDAO dao = (TypeDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.TYPE);
    FacilityTypeDAO ftdao = (FacilityTypeDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.FACILITYTYPE);

    @Override
    public boolean addType(TypeDTO type) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        connection.setAutoCommit(false);
        try {
            Type type1 = new Type(type.getTID(), type.getPrice(), type.getName(), type.getDescription());
            boolean isAdded = dao.add(type1);
            if (!isAdded) {
                return false;
            }
            for (FacilityTypeDTO a : type.getdTOs()) {
//                System.out.println(a.getFid());
                isAdded = ftdao.add(new FacilityType(a.getTid(), a.getFid()));
                if (!isAdded) {
                    connection.rollback();
                    return false;
                }
            }
            connection.commit();
            return true;

        } finally {
            connection.setAutoCommit(true);
        }

    }

    @Override
    public boolean deleteType(String ID) throws ClassNotFoundException, SQLException {
        return dao.delete(ID);
    }

    @Override
    public boolean updateType(TypeDTO type) throws ClassNotFoundException, SQLException {
        return dao.update(new Type(type.getTID(), type.getPrice(), type.getName(), type.getDescription()));
    }

    @Override
    public TypeDTO searchType(String ID) throws ClassNotFoundException, SQLException {
        Type serach = dao.search(ID);
        if(serach!=null){
            return new TypeDTO(serach.getTID(), serach.getPrice(), serach.getName(), serach.getDescription());
        }
        return null;
    }

    @Override
    public ArrayList<TypeDTO> getAllTypes() throws ClassNotFoundException, SQLException {
        ArrayList<Type> all = dao.getAll();
        ArrayList<TypeDTO> allTypes = new ArrayList<>();
        for (Type search : all) {
            allTypes.add(new TypeDTO(search.getTID(), search.getPrice(), search.getName(), search.getDescription()));
        }
        return allTypes;

    }

}
