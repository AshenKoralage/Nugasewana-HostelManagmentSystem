/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Ashen Koralage
 */
public class DateChooser {
    
    public static String getDate(JDateChooser dateChooser) {
        return new SimpleDateFormat("yyyy-MM-dd").format(dateChooser.getDate());
    }
    
    public static void setDefaultDate(JDateChooser dateChooser) {
        dateChooser.setDate(new Date());
    }

    public static void setDate(JDateChooser dateChooser, String checkIn) throws ParseException {
        dateChooser.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(checkIn));
    }
    
}
