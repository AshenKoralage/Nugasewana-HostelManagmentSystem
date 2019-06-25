/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import dto.RoomDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ashen Koralage
 */
public interface RoomBO extends SuperBO {

    public boolean addRoom(RoomDTO room) throws ClassNotFoundException, SQLException;

    public boolean updateRoom(RoomDTO roo) throws ClassNotFoundException, SQLException;

    public boolean deleteRoom(String ID) throws ClassNotFoundException, SQLException;

    public RoomDTO searchRoom(String ID) throws ClassNotFoundException, SQLException;

    public ArrayList<RoomDTO> getAllRooms() throws ClassNotFoundException, SQLException;
}
