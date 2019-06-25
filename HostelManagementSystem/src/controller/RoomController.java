package controller;

import bo.BOFactory;
import bo.custom.RoomBO;
import dto.RoomDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ashen Koralage
 */
public class RoomController {

    static RoomBO bo = (RoomBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.ROOM);

    public static boolean addRoom(RoomDTO roomModel) throws ClassNotFoundException, SQLException {
        return bo.addRoom(roomModel);

    }

    public static ArrayList<RoomDTO> getAllRooms() throws ClassNotFoundException, SQLException {
        return bo.getAllRooms();
    }

    public static boolean deleteRoom(String Rid) throws ClassNotFoundException, SQLException {
        return bo.deleteRoom(Rid);
    }

    public static boolean updateRoom(RoomDTO room) throws ClassNotFoundException, SQLException {
        return bo.updateRoom(room);
    }

    public static RoomDTO searchRoom(String search) throws ClassNotFoundException, SQLException {
        return bo.searchRoom(search);
    }

}
