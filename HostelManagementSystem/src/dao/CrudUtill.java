/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ashen Koralage
 */
public class CrudUtill {

    private static java.sql.PreparedStatement getPreaparedStatement(String sql, Object... data) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        for (int i = 0; i < data.length; i++) {
            pstm.setObject(i + 1, data[i]);
        }
        return pstm;
    }

    public static boolean executeUpdate(String sql, Object... data) throws ClassNotFoundException, SQLException {
        return getPreaparedStatement(sql, data).executeUpdate() > 0;
    }

    public static ResultSet executeQuery(String sql, Object... data) throws ClassNotFoundException, SQLException {
        return getPreaparedStatement(sql, data).executeQuery();
    }

}
