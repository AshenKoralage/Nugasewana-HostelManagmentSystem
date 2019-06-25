/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;


import controller.IdController;
import java.sql.SQLException;
import java.text.NumberFormat;

/**
 *
 * @author Ashen Koralage
 */
public class IdGenerator {

        public static String getNewId(String tableName, String colomnName, String prefix) throws ClassNotFoundException, SQLException{
        String lastId = IdController.getLastId(tableName, colomnName);
        if (lastId != null) {
            int id = Integer.parseInt(lastId.split(prefix)[1]);
            id++;
            NumberFormat numberFormat = NumberFormat.getIntegerInstance();
            numberFormat.setMaximumIntegerDigits(3);
            numberFormat.setMinimumIntegerDigits(3);
            numberFormat.setGroupingUsed(false);
            String newId = numberFormat.format(id);
            return prefix + newId;
        } else {
            return prefix + "001";
        }
    }
}
