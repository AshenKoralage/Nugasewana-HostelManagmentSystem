/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.FacilityController;
import dto.FacilityDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.IdGenerator;

/**
 *
 * @author Ashen Koralage
 */
public class FacilityForm extends javax.swing.JFrame {

    private DefaultTableModel dtm;

    /**
     * Creates new form FacilityForm
     */
    public FacilityForm() {
        initComponents();
        dtm = (DefaultTableModel) tblFacility.getModel();
        getAllFacility();
        setIDAuto();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFacilityName = new javax.swing.JTextField();
        txtFaciID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFacility = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Trajan Pro", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 153, 0));
        jLabel12.setText("Nugasewana");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Facility Details");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 120, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home_1.png"))); // NOI18N
        jLabel5.setText("Home");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 110, 40));

        txtFacilityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacilityNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtFacilityName, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 340, 30));

        txtFaciID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaciIDActionPerformed(evt);
            }
        });
        jPanel2.add(txtFaciID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 340, 30));

        tblFacility.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Facility ID", "Facility Name"
            }
        ));
        tblFacility.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFacilityMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFacility);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 1000, 350));

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/accept.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.setContentAreaFilled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 470, 110, 40));

        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/page_edit.png"))); // NOI18N
        btnupdate.setText("Update");
        btnupdate.setContentAreaFilled(false);
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 590, -1, -1));

        btnRemove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.setContentAreaFilled(false);
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel2.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 530, -1, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Facilities");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 260, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Facility ID");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 80, -1));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 760));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gray background.jpg"))); // NOI18N
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

    private void txtFacilityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacilityNameActionPerformed
        btnSave.requestFocus();
        btnSave.doClick();
        txtFaciID.requestFocus();
    }//GEN-LAST:event_txtFacilityNameActionPerformed

    private void txtFaciIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaciIDActionPerformed
        try {
            String id = txtFaciID.getText();
            FacilityDTO facilitySearch = FacilityController.searchFacility(id);
            if (facilitySearch != null) {
                txtFaciID.setText(facilitySearch.getFID());
                txtFacilityName.setText(facilitySearch.getName());
            } else {
                clearAll();
                JOptionPane.showMessageDialog(this, "No Such Facilities For ID" + id);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacilityForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FacilityForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtFacilityName.requestFocus();

    }//GEN-LAST:event_txtFaciIDActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            String FID = txtFaciID.getText();
            String FName = txtFacilityName.getText();
            FacilityDTO faciModel = new FacilityDTO(FID, FName);
            boolean addFacility = FacilityController.addFacility(faciModel);
            if (addFacility) {
                JOptionPane.showMessageDialog(this, "Facility Save Successfully");
                getAllFacility();
                clearAll();
            } else {
                JOptionPane.showMessageDialog(this, "Facility Save Failed");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacilityForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FacilityForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        try {
            String FacID = txtFaciID.getText();
            boolean deletefacility = deleteFacility(FacID);
            if (deletefacility) {
                JOptionPane.showMessageDialog(this, "Facility Delete Successfully");
                getAllFacility();
                clearAll();
            } else {
                JOptionPane.showMessageDialog(this, "Facility Delete Failed");
                clearAll();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacilityForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FacilityForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try {
            String FID = txtFaciID.getText();
            String FName = txtFacilityName.getText();
            FacilityDTO faciModel = new FacilityDTO(FID, FName);
            boolean updateFacility = FacilityController.updateFacility(faciModel);
            if (updateFacility) {
                JOptionPane.showMessageDialog(this, "Facility Update Successfully");
                getAllFacility();
                clearAll();
            } else {
                JOptionPane.showMessageDialog(this, "Facility Update Failed");
                clearAll();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacilityForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FacilityForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnupdateActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new DashBoard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void tblFacilityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFacilityMouseClicked
        int selectedRow = tblFacility.getSelectedRow();
        String id = dtm.getValueAt(selectedRow, 0).toString();
        String facility = dtm.getValueAt(selectedRow, 1).toString();
        txtFaciID.setText(id);
        txtFacilityName.setText(facility);
    }//GEN-LAST:event_tblFacilityMouseClicked

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
//            java.util.logging.Logger.getLogger(FacilityForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FacilityForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FacilityForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FacilityForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FacilityForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFacility;
    private javax.swing.JTextField txtFaciID;
    private javax.swing.JTextField txtFacilityName;
    // End of variables declaration//GEN-END:variables

    private void getAllFacility() {
        try {
            dtm.setRowCount(0);
            ArrayList<FacilityDTO> allFacility = FacilityController.getAllFacility();
            for (FacilityDTO allFaci : allFacility) {
                Object[] rowdata = {allFaci.getFID(), allFaci.getName()};
                dtm.addRow(rowdata);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacilityForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FacilityForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clearAll() {
        txtFaciID.setText("");
        txtFacilityName.setText("");
    }

    private boolean deleteFacility(String faciID) throws ClassNotFoundException, SQLException {
        return FacilityController.deleteFacility(faciID);
    }
     private void setIDAuto() {
        try {
            String newId = IdGenerator.getNewId("Facility", "FID", "F");
            txtFaciID.setText(newId);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GuestRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GuestRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}