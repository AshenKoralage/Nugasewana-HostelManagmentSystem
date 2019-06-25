/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Reservation2Controller;
import controller.ReservationController;
import dto.Reservation2DTO;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.DateChooser;
import util.IdGenerator;
import util.Validation;

/**
 *
 * @author Ashen Koralage
 */
public class ReservationForm2 extends javax.swing.JFrame {

    private DefaultTableModel dtm;

    /**
     * Creates new form ReservationForm2
     */
    public ReservationForm2() {
        initComponents();
        dtm = (DefaultTableModel) tblres.getModel();
        getAllReservations();
        setIDAuto();
        setReservationDate();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtkeyMoney = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtREID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtgId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnreserve = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblres = new javax.swing.JTable();
        btndeleteRoom = new javax.swing.JButton();
        btnupdateRoom = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtpaymentDate = new com.toedter.calendar.JDateChooser();
        txtcheckOut = new com.toedter.calendar.JDateChooser();
        txtbookingDate = new com.toedter.calendar.JDateChooser();
        txtcheckin = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 153, 0));
        jLabel12.setText("Nugasewana");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 200, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Reservation");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 160, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Guest ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 130, 30));

        txtkeyMoney.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtkeyMoneyKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtkeyMoneyKeyReleased(evt);
            }
        });
        jPanel2.add(txtkeyMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 330, 380, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText(" Check Out Date");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 140, 30));

        txtREID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtREIDActionPerformed(evt);
            }
        });
        jPanel2.add(txtREID, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 400, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Reservation ID");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 130, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Key Money Amount");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, 140, 30));
        jPanel2.add(txtgId, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 150, 380, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Room no");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 140, 30));
        jPanel2.add(txtRno, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 400, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Booking Date");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 140, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Check in Date");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 140, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Payment Date");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 140, 30));

        btnreserve.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnreserve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/accept.png"))); // NOI18N
        btnreserve.setText("Reserve Room");
        btnreserve.setContentAreaFilled(false);
        btnreserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreserveActionPerformed(evt);
            }
        });
        jPanel2.add(btnreserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 550, 160, 30));

        tblres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reservation ID", "Room no", "Check in", "Check out", "payment date", "Guest ID", "Booking Date", "Key money"
            }
        ));
        tblres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblres);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 900, 290));

        btndeleteRoom.setBackground(new java.awt.Color(255, 255, 255));
        btndeleteRoom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndeleteRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        btndeleteRoom.setText("Remove ");
        btndeleteRoom.setContentAreaFilled(false);
        btndeleteRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteRoomActionPerformed(evt);
            }
        });
        jPanel2.add(btndeleteRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 590, 140, 40));

        btnupdateRoom.setBackground(new java.awt.Color(255, 255, 255));
        btnupdateRoom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnupdateRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/page_edit.png"))); // NOI18N
        btnupdateRoom.setText("Update");
        btnupdateRoom.setContentAreaFilled(false);
        btnupdateRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateRoomActionPerformed(evt);
            }
        });
        jPanel2.add(btnupdateRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 630, 120, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home_1.png"))); // NOI18N
        jLabel11.setText("Home");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 10, 80, 40));

        jLabel14.setBackground(new java.awt.Color(102, 102, 102));
        jLabel14.setOpaque(true);
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 60));
        jPanel2.add(txtpaymentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 400, 30));
        jPanel2.add(txtcheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 270, 380, 30));
        jPanel2.add(txtbookingDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 210, 380, 30));
        jPanel2.add(txtcheckin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 400, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 760));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gray background.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new DashBoard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void btnupdateRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateRoomActionPerformed

        try {
            String resID = txtREID.getText();
            String roomNo = txtRno.getText();
            String guestId = txtgId.getText();
            String payment = DateChooser.getDate(txtpaymentDate);
            String checkIn = DateChooser.getDate(txtcheckin);
            String checkOut = DateChooser.getDate(txtcheckOut);
            String booking = DateChooser.getDate(txtbookingDate);
            String keyMoney = txtkeyMoney.getText();

            Reservation2DTO resDto = new Reservation2DTO(resID, roomNo, guestId, payment, checkIn, checkOut, booking, keyMoney);
            boolean updateRoom = Reservation2Controller.updateReservation(resDto);
            if (updateRoom) {
                JOptionPane.showMessageDialog(this, "Room Update Successfully");
                getAllReservations();
                clearAll();
            } else {
                JOptionPane.showMessageDialog(this, "Room Update Failed");
                clearAll();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReservationForm2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReservationForm2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnupdateRoomActionPerformed

    private void btndeleteRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteRoomActionPerformed

       
    }//GEN-LAST:event_btndeleteRoomActionPerformed

    private void tblresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblresMouseClicked
        int selectedRow = tblres.getSelectedRow();
        String reid = dtm.getValueAt(selectedRow, 0).toString();
        String rNo = dtm.getValueAt(selectedRow, 1).toString();
        String checkIn = dtm.getValueAt(selectedRow, 2).toString();
        String checkOut = dtm.getValueAt(selectedRow, 3).toString();
        String payment = dtm.getValueAt(selectedRow, 4).toString();
        String guestId = dtm.getValueAt(selectedRow, 5).toString();
        String bookingDate = dtm.getValueAt(selectedRow, 6).toString();
        String keyMoney = dtm.getValueAt(selectedRow, 7).toString();
        
        
        JFrame frame = new JFrame();
        String[] options = new String[2];
        options[0] = new String("Edit");
        options[1] = new String("Remove");
        int showOptionDialog = JOptionPane.showOptionDialog(frame.getContentPane(),"Do you want to edit or delete?","Attention!", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
    		
    	if (showOptionDialog == JOptionPane.YES_OPTION){
            setDetailToTextFeild(reid, rNo, checkIn, checkOut, payment, guestId, bookingDate, keyMoney);
        }else if (showOptionDialog == JOptionPane.NO_OPTION){
            deleteReservation(reid);
        }
    	

    }//GEN-LAST:event_tblresMouseClicked

    private void btnreserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreserveActionPerformed
        try {
            String resID = txtREID.getText();
            String roomNo = txtRno.getText();
            String guestId = txtgId.getText();
            String payment = DateChooser.getDate(txtpaymentDate);
            String checkIn = DateChooser.getDate(txtcheckin);
            String checkOut = DateChooser.getDate(txtcheckOut);
            String booking = DateChooser.getDate(txtbookingDate);
            String keyMoney = txtkeyMoney.getText();

            Reservation2DTO reservationModel = new Reservation2DTO(resID, roomNo, guestId, payment, checkIn, checkOut, booking, keyMoney);
            boolean reserveRoom = Reservation2Controller.reserveRoom(reservationModel);
            PaymentForm paymentsForm =  new PaymentForm(guestId, booking, keyMoney);
            paymentsForm.setVisible(true);
            this.dispose();
            if (reserveRoom) {
                JOptionPane.showMessageDialog(this, "Successfully Reserved a Room");
                getAllReservations();
                clearAll();
            }else{
                JOptionPane.showMessageDialog(this, "Failed to Reserved a Room");
                clearAll();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReservationForm2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReservationForm2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnreserveActionPerformed

    private void txtREIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtREIDActionPerformed
        txtRno.requestFocus();
    }//GEN-LAST:event_txtREIDActionPerformed

    private void txtkeyMoneyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkeyMoneyKeyPressed
        
    }//GEN-LAST:event_txtkeyMoneyKeyPressed

    private void txtkeyMoneyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkeyMoneyKeyReleased
        Validation.numberOnly(txtkeyMoney);
    }//GEN-LAST:event_txtkeyMoneyKeyReleased

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ReservationForm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ReservationForm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ReservationForm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ReservationForm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ReservationForm2().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndeleteRoom;
    private javax.swing.JButton btnreserve;
    private javax.swing.JButton btnupdateRoom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblres;
    private javax.swing.JTextField txtREID;
    private javax.swing.JTextField txtRno;
    private com.toedter.calendar.JDateChooser txtbookingDate;
    private com.toedter.calendar.JDateChooser txtcheckOut;
    private com.toedter.calendar.JDateChooser txtcheckin;
    private javax.swing.JTextField txtgId;
    private javax.swing.JTextField txtkeyMoney;
    private com.toedter.calendar.JDateChooser txtpaymentDate;
    // End of variables declaration//GEN-END:variables

    private void getAllReservations() {
        try {
            dtm.setRowCount(0);
            ArrayList<Reservation2DTO> getall =Reservation2Controller.getAll();
            for (Reservation2DTO all : getall) {
                Object rowData[]={all.getREID(),all.getRoom_no(),all.getBooking_date(),all.getChecking_out(),all.getPayment_date(),all.getGID(),all.getBooking_date(),all.getKey_money_amount()};
                dtm.addRow(rowData);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReservationForm2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReservationForm2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /*
    try {
            dtm.setRowCount(0);
            ArrayList<Reservation2DTO> getAll = Reservation2Controller.getAll();
            for (Reservation2DTO all : getAll) {
                Object rowData[] = {all.getREID(), all.getRoom_no(), all.getChecking_date(), all.getChecking_out(), all.getPayment_date(), all.getGID(), all.getBooking_date(), all.getKey_money_amount()};
                dtm.addRow(rowData);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReservationForm2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReservationForm2.class.getName()).log(Level.SEVERE, null, ex);
        }
    */

    private void setIDAuto() {
        try {
            String newId = IdGenerator.getNewId("reservation", "REID", "RES");
            txtREID.setText(newId);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReservationForm2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReservationForm2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clearAll() {
        txtREID.setText("");
        txtRno.setText("");
//        txtbookingDate.setText("");
        DateChooser.setDefaultDate(txtpaymentDate);
//        txtcheckin.setText("");
        txtgId.setText("");
        txtkeyMoney.setText("");
//        txtpaymentDate.setText("");
    }

    private void setReservationDate() {
        DateChooser.setDefaultDate(txtbookingDate);
        DateChooser.setDefaultDate(txtcheckin);
        DateChooser.setDefaultDate(txtcheckOut);
        DateChooser.setDefaultDate(txtpaymentDate);
    }

    private boolean deleteRes(String reId) throws ClassNotFoundException, SQLException {
        return Reservation2Controller.deleteRes(reId);
    }

    private void setDetailToTextFeild(String reid, String rNo, String checkIn, String checOut, String payment, String guestId, String bookingDate, String keyMoney){
       
        try {
            txtREID.setText(reid);
            txtRno.setText(rNo);
            DateChooser.setDate(txtpaymentDate, payment);
            DateChooser.setDate(txtcheckin, checkIn);
            DateChooser.setDate(txtcheckOut, checOut);
            txtpaymentDate.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(checOut));
            txtgId.setText(guestId);
            txtkeyMoney.setText(keyMoney);
            DateChooser.setDate(txtbookingDate, bookingDate);
        } catch (Exception ex) {
            Logger.getLogger(ReservationForm2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void deleteReservation(String reid) {
        try {
            boolean deleteRes = deleteRes(reid);
            if (deleteRes) {
                JOptionPane.showMessageDialog(this, " Successfully Removed");
                getAllReservations();
                clearAll();
            } else {
                JOptionPane.showMessageDialog(this, " Failed to Remove");
                clearAll();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReservationForm2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReservationForm2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}