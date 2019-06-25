/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl; 
import bo.custom.RoomBO;
import dao.DAOFactory;
import dao.custom.RoomDAO;
import dto.RoomDTO;
import entity.Hostel;
import entity.Room;
import java.sql.SQLException;
import java.util.ArrayList;

/**     
 *
 * @author Ashen Koralage
 */
public class RoomBOImpl implements RoomBO {

    static RoomDAO dao = (RoomDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ROOM);

    @Override
    public boolean addRoom(RoomDTO room) throws ClassNotFoundException, SQLException {
        return dao.add(new Room(room.getRoom_no(), room.getTID(), room.getHID(), room.getNo_of_beds(), room.getFloor_number(), room.getCurrent_Borders_count(), room.getWidth(), room.getLength()));

    }

    @Override
    public boolean updateRoom(RoomDTO roo) throws ClassNotFoundException, SQLException {
        return dao.update(new Room(roo.getRoom_no(), roo.getTID(), roo.getHID(), roo.getNo_of_beds(), roo.getFloor_number(), roo.getCurrent_Borders_count(), roo.getWidth(), roo.getLength()));
    }

    @Override
    public boolean deleteRoom(String ID) throws ClassNotFoundException, SQLException {
        return dao.delete(ID);
    }

    @Override
    public RoomDTO searchRoom(String ID) throws ClassNotFoundException, SQLException {
        Room search =dao.search(ID);
        if(search!=null){
            return new RoomDTO(search.getRoom_no(),search.getFloor_number(),search.getCurrent_Borders_count(),search.getHID(),search.getNo_of_beds(),search.getTID(),search.getLength(),search.getWidth());
        }
        return null;
        
    }

    @Override
    public ArrayList<RoomDTO> getAllRooms() throws ClassNotFoundException, SQLException {
        ArrayList<Room> all = dao.getAll();
        ArrayList<RoomDTO> allRoom = new ArrayList<>();
        for (Room search : all) {
            allRoom.add(new RoomDTO(search.getRoom_no(),search.getTID(),search.getHID(),search.getNo_of_beds(),search.getFloor_number(),search.getCurrent_Borders_count(),search.getWidth(),search.getLength()));
        }
        return allRoom;
    }

}
