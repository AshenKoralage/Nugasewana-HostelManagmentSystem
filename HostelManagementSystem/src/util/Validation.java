/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Ashen Koralage
 */
import java.awt.event.KeyEvent;
import javax.swing.*;

public class Validation {

    /**
     * Validate text to accept a mobile number
     *
     * @param textField
     * @param evt
     */
    public static void phoneNumber(JTextField textField, KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
        }
        String txt = textField.getText();
        int caretPosition = textField.getCaretPosition();
        if (!txt.matches("^[0-9]{0,10}$")) {
            txt = txt.substring(0, caretPosition - 1) + txt.substring(caretPosition);
            textField.setText(txt);
            textField.setCaretPosition(caretPosition - 1);
        }

    }

    /**
     * Validate text to accept a price
     */
    public static void priceText(JTextField textField) {
        String text = textField.getText();
        if (!text.isEmpty()) {
            boolean res = text.matches("[0-9]+[.]?[0-9]{0,2}");
            if (!res) {
                textField.setText(text.substring(0, text.length() - 1));
            }
        }
    }

    /**
     * Validate text to accept a limited number of integers
     */
    public static void limitesIntegers(JTextField textField, int value) {
        String txt = textField.getText();
        int caretPosition = textField.getCaretPosition();
        if (!txt.matches("^[0-9]{0," + value + "}$")) {
            txt = txt.substring(0, caretPosition - 1) + txt.substring(caretPosition);
            textField.setText(txt);
            textField.setCaretPosition(caretPosition - 1);
        }
    }

    /**
     * Validate text to accept a NIC
     */
    public static void textNIC(JTextField textField) {
        String text = textField.getText();
        if (!text.isEmpty()) {
            boolean res = text.matches("[0-9]{0,9}[v]{0,1}");
            if (!res) {
                textField.setText(text.substring(0, text.length() - 1));
            }
        }
    }

    /**
     * Validate text to accept a new NIC
     */
    public static void textNewNIC(JTextField textField) {
        String text = textField.getText();
        if (!text.isEmpty()) {
            boolean res = text.matches("[0-9]{0,12}");
            if (!res) {
                textField.setText(text.substring(0, text.length() - 1));
            }
        }
    }

    /**
     * Validate text to accept engine capacity
     */
    public static void engineCapacity(JTextField textField) {
        String text = textField.getText();
        if (!text.isEmpty()) {
            boolean res = text.matches("[0-9]{0,4}");//[c]{0,2} if "CC" is needed
            if (!res) {
                textField.setText(text.substring(0, text.length() - 1));
            }
        }
    }

    /**
     * Validate text to accept a year
     */
    public static void textYear(JTextField textField) {
        String text = textField.getText();
        if (!text.isEmpty()) {
            boolean res = text.matches("[0-9]{0,4}");
            if (!res) {
                textField.setText(text.substring(0, text.length() - 1));
            }
        }
    }

    /**
     * Validate text to accept letters only
     */
    public static void name(JTextField textField) {
        String txt = textField.getText();
        int caretPosition = textField.getCaretPosition();
        if (!txt.matches("^[A-Za-z// ]*$")) {
            textField.setText(txt.substring(0, caretPosition - 1) + txt.substring(caretPosition));
            textField.setCaretPosition(caretPosition - 1);
        }
    }

    /**
     * Validate text to accept numbers only
     */
    public static void numberOnly(JTextField textField) {
        String txt = textField.getText();
        int caretPosition = textField.getCaretPosition();
        if (!txt.matches("^[\\d]*")) {
            textField.setText(txt.substring(0, caretPosition - 1) + txt.substring(caretPosition));
            textField.setCaretPosition(caretPosition - 1);
        }
    }

    public static void validateNIC(JTextField nicText) {
        String text = nicText.getText();
        boolean matches = text.matches("[\\d]{0,9}");
        if (!matches) {
            nicText.setText(text.substring(0, text.length() - 1));
        }
        boolean matches1 = text.matches("[\\d]{9}");
        if (matches1) {
            nicText.setText(nicText.getText() + "V");
        }
    }

//public static void validateID(JTextField IDText){
//     String txt = textField.getText();
//}
//    public static void validationEmail(JTextField textField) {
//        String text = textField.getText();
//        if (!text.isEmpty()) {
//            boolean res = text.matches("^[(a-zA-Z-0-9-\\\\_\\\\+\\\\.)]+@[(a-z-A-z)]+\\\\.[(a-zA-z)]{2,3}$");
//            if (!res) {
//                textField.setText(text.substring(0, text.length() - 1));
//            }
//        }
//    }
}
