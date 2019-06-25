/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.RegistrationController;
import static controller.RegistrationController.deleteGuest;
import dto.RegistrationDTO;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;
import util.IdGenerator;
import util.Validation;

/**
 *
 * @author Ashen Koralage
 */
public class GuestRegistrationForm extends javax.swing.JFrame {

    private DefaultTableModel dtm;

    /**
     * Creates new form GuestRegistrationForm
     */
    public GuestRegistrationForm() {
        initComponents();
        dtm = (DefaultTableModel) tblGuest.getModel();
        getAllGuests();
        setIdAuto();
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
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtprofession = new javax.swing.JTextField();
        txtgid = new javax.swing.JTextField();
        txtworkplace = new javax.swing.JTextField();
        txtGName = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();
        txtNic = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtgender = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGuest = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        txtTp = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Trajan Pro", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 153, 0));
        jLabel12.setText("Nugasewana");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Registration Form");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 240, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Full Name Of Guest");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 140, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("NIC No");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 130, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Address");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 130, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Profession");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, 140, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Work Place");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 110, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("E-mail");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, 100, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Gender");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 120, -1));

        txtprofession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprofessionActionPerformed(evt);
            }
        });
        txtprofession.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprofessionKeyReleased(evt);
            }
        });
        jPanel2.add(txtprofession, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 320, 410, 30));

        txtgid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgidActionPerformed(evt);
            }
        });
        txtgid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtgidKeyReleased(evt);
            }
        });
        jPanel2.add(txtgid, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 390, 30));

        txtworkplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtworkplaceActionPerformed(evt);
            }
        });
        txtworkplace.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtworkplaceKeyReleased(evt);
            }
        });
        jPanel2.add(txtworkplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, 410, 30));

        txtGName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGNameActionPerformed(evt);
            }
        });
        txtGName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGNameKeyReleased(evt);
            }
        });
        jPanel2.add(txtGName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 390, 30));

        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });
        txtaddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtaddressKeyReleased(evt);
            }
        });
        jPanel2.add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 220, 410, 30));

        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        btnback.setText("Back To Reservation");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel2.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtNic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNicActionPerformed(evt);
            }
        });
        txtNic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNicKeyReleased(evt);
            }
        });
        jPanel2.add(txtNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 390, 30));

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel2.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 270, 410, 30));

        txtgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgenderActionPerformed(evt);
            }
        });
        jPanel2.add(txtgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 390, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Guest ID");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 120, -1));

        tblGuest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Guest ID", "Full Name", "Work Place", "T.p", "Gender", "NIC", "Address", "E-mail", "Profession"
            }
        ));
        tblGuest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGuestMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGuest);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 990, 240));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Telephone No");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 120, -1));

        txtTp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTpActionPerformed(evt);
            }
        });
        txtTp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTpKeyReleased(evt);
            }
        });
        jPanel2.add(txtTp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 390, 30));

        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/page_edit.png"))); // NOI18N
        btnupdate.setText("Update");
        btnupdate.setContentAreaFilled(false);
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 560, 110, 30));

        btnsave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/accept.png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.setContentAreaFilled(false);
        btnsave.setDoubleBuffered(true);
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 440, 110, 30));

        btnremove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnremove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        btnremove.setText("Remove");
        btnremove.setContentAreaFilled(false);
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        jPanel2.add(btnremove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 500, 110, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home_1.png"))); // NOI18N
        jLabel20.setText("Home");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 10, 80, 40));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 60));

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 600, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 770));

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

    private void txtprofessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprofessionActionPerformed
        btnsave.requestFocus();
        btnsave.doClick();
    }//GEN-LAST:event_txtprofessionActionPerformed

    private void txtgidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgidActionPerformed
        try {
            txtGName.requestFocus();
            String searchID = txtgid.getText();
            RegistrationDTO searchGuest = RegistrationController.searchGuest(searchID);
            if (searchGuest != null) {
                txtgid.setText(searchGuest.getGID());
                txtGName.setText(searchGuest.getFull_name());
                txtNic.setText(searchGuest.getNIC());
                txtaddress.setText(searchGuest.getAddress());
                txtworkplace.setText(searchGuest.getWork_place());
                txtTp.setText(searchGuest.getPhone_NO());
                txtemail.setText(searchGuest.getE_mail());
                txtprofession.setText(searchGuest.getProfession());
                txtgender.setText(searchGuest.getGender());
            } else {
                clearAll();
                JOptionPane.showMessageDialog(this, "No Such Guests For ID :" + searchID);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GuestRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GuestRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtgidActionPerformed

    private void txtworkplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtworkplaceActionPerformed
        txtaddress.requestFocus();
    }//GEN-LAST:event_txtworkplaceActionPerformed

    private void txtGNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGNameActionPerformed
        txtNic.requestFocus();
    }//GEN-LAST:event_txtGNameActionPerformed

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed
        txtemail.requestFocus();
    }//GEN-LAST:event_txtaddressActionPerformed

    private void txtNicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNicActionPerformed
        txtTp.requestFocus();
    }//GEN-LAST:event_txtNicActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        txtprofession.requestFocus();
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgenderActionPerformed
        txtworkplace.requestFocus();
    }//GEN-LAST:event_txtgenderActionPerformed

    private void txtTpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTpActionPerformed
        txtgender.requestFocus();
    }//GEN-LAST:event_txtTpActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed

        try {
            String guestId = txtgid.getText();
            String guestName = txtGName.getText();
            String nic = txtNic.getText();
            String address = txtaddress.getText();
            String workPlace = txtworkplace.getText();
            String phoneNo = txtTp.getText();
            String email = txtemail.getText();
            String profession = txtprofession.getText();
            String gender = txtgender.getText();

//            System.out.println(guestId + " " + guestName + " " + nic + " " + address + " " + workPlace + " " + email + " " + profession + " " + gender + " " + phoneNo);
            RegistrationDTO regModel = new RegistrationDTO(guestId, guestName, nic, address, workPlace, phoneNo, email, profession, gender);
            boolean addGuest = RegistrationController.addGuest(regModel);
            if (addGuest) {
                JOptionPane.showMessageDialog(this, "Registration Succesfully");
                getAllGuests();
                clearAll();
            } else {
                JOptionPane.showMessageDialog(this, "Registration Failed");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GuestRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GuestRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnsaveActionPerformed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        new DashBoard().setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void txtGNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGNameKeyReleased
        Validation.name(txtGName);
    }//GEN-LAST:event_txtGNameKeyReleased

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed

        try {
            String gid = txtgid.getText();
            boolean deleteguest = deleteguest(gid);
            if (deleteguest) {

                JOptionPane.showMessageDialog(this, "Guest Delete Successfully");
                getAllGuests();
                clearAll();
            } else {
                JOptionPane.showMessageDialog(this, "Guest Delete Failed");
                clearAll();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GuestRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GuestRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnremoveActionPerformed

    private void tblGuestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGuestMouseClicked
        int selectedRow = tblGuest.getSelectedRow();
        String gid = dtm.getValueAt(selectedRow, 0).toString();
        String fullName = dtm.getValueAt(selectedRow, 1).toString();
        String workPlace = dtm.getValueAt(selectedRow, 2).toString();
        String tp = dtm.getValueAt(selectedRow, 3).toString();
        String gender = dtm.getValueAt(selectedRow, 4).toString();
        String nic = dtm.getValueAt(selectedRow, 5).toString();
        String address = dtm.getValueAt(selectedRow, 6).toString();
        String email = dtm.getValueAt(selectedRow, 7).toString();
        String profession = dtm.getValueAt(selectedRow, 8).toString();
        txtgid.setText(gid);
        txtGName.setText(fullName);
        txtworkplace.setText(workPlace);
        txtTp.setText(tp);
        txtgender.setText(gender);
        txtNic.setText(nic);
        txtaddress.setText(address);
        txtemail.setText(email);
        txtprofession.setText(profession);
    }//GEN-LAST:event_tblGuestMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try {
            String gid = txtgid.getText();
//            String guestId = txtgid.getText();
            String guestName = txtGName.getText();
            String nic = txtNic.getText();
            String address = txtaddress.getText();
            String workPlace = txtworkplace.getText();
            String phoneNo = txtTp.getText();
            String email = txtemail.getText();
            String profession = txtprofession.getText();
            String gender = txtgender.getText();

            RegistrationDTO regModel = new RegistrationDTO(gid, guestName, nic, address, workPlace, phoneNo, email, profession, gender);
            boolean updateGuest = RegistrationController.updateGuest(regModel);
            if (updateGuest) {
                JOptionPane.showMessageDialog(this, "Successfully Updated");
                getAllGuests();
                clearAll();
            } else {
                JOptionPane.showMessageDialog(this, "Faild!");
                clearAll();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GuestRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GuestRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void txtgidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgidKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgidKeyReleased

    private void txtNicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNicKeyReleased
        Validation.validateNIC(txtNic);
    }//GEN-LAST:event_txtNicKeyReleased

    private void txtTpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTpKeyReleased
        Validation.phoneNumber(txtTp, evt);
    }//GEN-LAST:event_txtTpKeyReleased

    private void txtworkplaceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtworkplaceKeyReleased
        Validation.name(txtworkplace);
    }//GEN-LAST:event_txtworkplaceKeyReleased

    private void txtaddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaddressKeyReleased
        Validation.name(txtaddress);
    }//GEN-LAST:event_txtaddressKeyReleased

    private void txtprofessionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprofessionKeyReleased
        Validation.name(txtprofession);
    }//GEN-LAST:event_txtprofessionKeyReleased

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        new ReservationForm2().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            JasperReport jr = JasperCompileManager.compileReport("./src/reports/GuestsReport.jrxml");
            HashMap paraValues = new HashMap();

            System.out.println(jr);
            JasperPrint print = JasperFillManager.fillReport(jr, paraValues, new JRTableModelDataSource(dtm));
            JasperViewer.viewReport(print, false);

        } catch (JRException ex) {
            Logger.getLogger(GuestRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuestRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuestRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuestRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuestRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuestRegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGuest;
    private javax.swing.JTextField txtGName;
    private javax.swing.JTextField txtNic;
    private javax.swing.JTextField txtTp;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtgid;
    private javax.swing.JTextField txtprofession;
    private javax.swing.JTextField txtworkplace;
    // End of variables declaration//GEN-END:variables

    private void getAllGuests() {

        try {
            dtm.setRowCount(0);
            ArrayList<RegistrationDTO> allguests = RegistrationController.getAllGuests();
            for (RegistrationDTO allReg : allguests) {
                Object[] rowdata = {allReg.getGID(), allReg.getFull_name(), allReg.getWork_place(), allReg.getPhone_NO(), allReg.getGender(), allReg.getNIC(), allReg.getAddress(), allReg.getE_mail(), allReg.getProfession()};
                dtm.addRow(rowdata);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GuestRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GuestRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void clearAll() {
        txtGName.setText("");
        txtNic.setText("");
        txtTp.setText("");
        txtaddress.setText("");
        txtemail.setText("");
        txtgender.setText("");
        txtgid.setText("");
        txtprofession.setText("");
        txtworkplace.setText("");

    }

    private void setIdAuto() {
        try {
            String newId = IdGenerator.getNewId("Guest", "GID", "G");
            txtgid.setText(newId);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GuestRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GuestRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean deleteguest(String gid) throws ClassNotFoundException, SQLException {
        return RegistrationController.deleteGuest(gid);
    }

}
