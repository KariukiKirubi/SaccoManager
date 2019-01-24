/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saccomanager;

import java.awt.TrayIcon;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author KEKA-TECH
 */
public class operator_login extends javax.swing.JFrame {
 Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
    DisplayTrayIcon DTI = new DisplayTrayIcon();

    int timeRun = 0;

    /**
     * Creates new form operator_login
     */
    public operator_login() {

        initComponents();
       
        txt_pass.setEnabled(false);
        

        new Thread() {
            public void run() {
                txt_pass.setEnabled(true);
               
                /*
                 try {
                 Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:\\wamp\\wampmanager.exe");
                 } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "Error");
                 }
                 */
                while (timeRun == 0) {
                    Calendar cal = new GregorianCalendar();

                    int hour = cal.get(Calendar.HOUR);
                    int min = cal.get(Calendar.MINUTE);
                    int sec = cal.get(Calendar.SECOND);
                    int AM_PM = cal.get(Calendar.AM_PM);
                    String day_night = "";

                    if (AM_PM == 1) {
                        day_night = "PM";
                    } else {
                        day_night = "AM";
                    }
                    String time = hour + ":" + min + ":" + sec;

                    Clock.setText(time);
                }

            }

        }.start();
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
        karisload = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        com_sel = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        Clock = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MANAGEMENT SYSTEM LOGIN PANEL");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        karisload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/details/Loading-Animated-GIF.gif"))); // NOI18N
        karisload.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                karisloadComponentHidden(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel7.setText("OPERATOR LOGIN PANEL");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/PadLock-icon.png"))); // NOI18N
        jLabel3.setToolTipText("STAFF ALTERNATIVE LOG IN");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("select operator");

        com_sel.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        com_sel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--select operator--", "ADMINISTRATOR", "STAFF" }));
        com_sel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                com_selItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("operator password");

        txt_pass.setBackground(new java.awt.Color(204, 204, 204));
        txt_pass.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        txt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passActionPerformed(evt);
            }
        });
        txt_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_passKeyReleased(evt);
            }
        });

        jLabel8.setText("Note: password is case sensitive");

        Clock.setBackground(new java.awt.Color(153, 153, 153));
        Clock.setFont(new java.awt.Font("DS-Digital", 0, 18)); // NOI18N
        Clock.setForeground(new java.awt.Color(255, 255, 255));
        Clock.setText("time");

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CLEAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Clock, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(36, 36, 36)
                .addComponent(jButton2)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(com_sel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(karisload)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(146, 146, 146)
                        .addComponent(jLabel6)))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(com_sel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(karisload)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clock, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(502, 293));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
//        connection connect=new connection();
//        conn=connect.Connectdb();

        String pass = JOptionPane.showInputDialog(null, "PROVIDE PASS PLEASE:::..");

        if (pass.equals("kekatech") || pass.equals("KEKATECH")) {
            dispose();
            //admin_full p = new admin_full();

            //p.setVisible(true);
            try {

                String querry = "SELECT * FROM settings WHERE my_id_code = 1";

                pst = conn.prepareStatement(querry);
                rs = pst.executeQuery();

                if (rs.next()) {
                    int f = rs.getInt("my_voice_code");

                    if (f == 1) {
                        try {

                            DisplayTrayIcon.trayIcon.displayMessage("System Information", "You have logged into the system successfully", TrayIcon.MessageType.INFO);

                            try {
                                Thread.sleep(3000);

                            } catch (Exception e) {
                            }

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);

                        }
                    } else if (f == 2) {

                    }

                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_jLabel3MouseClicked

    private void com_selItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_com_selItemStateChanged

    }//GEN-LAST:event_com_selItemStateChanged

    private void txt_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passActionPerformed

    private void txt_passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            connection connect=new connection();
            conn=connect.Connectdb();

            String co = (String) com_sel.getSelectedItem();
            String txt = txt_pass.getText();

            if (co.equals("--select user--")) {
                JOptionPane.showMessageDialog(null, "Be sure to select the operator.");
            }

            //ADMINISTRATOR_________________________________________________________
            if (co.equals("ADMINISTRATOR")) {

                try {
                    String pass = txt_pass.getText();
                    String use = (String) com_sel.getSelectedItem();

                    String querry = "SELECT * FROM admin_data WHERE pass = '" + pass + "'";
                    pst = conn.prepareStatement(querry);
                    rs = pst.executeQuery();

                    if (rs.next()) {
                        String i = rs.getString("user");
                        String p = rs.getString("pass");

                        Statement sn = conn.createStatement();
                        long time = System.currentTimeMillis();
                        java.sql.Timestamp timestamp = new java.sql.Timestamp(time);

                        if (pass.equals(p) && use.equals(i)) {

                            String sql = "update admin_data set log_date= '" + timestamp + "' where pass='" + p + "'";
                            sn.executeUpdate(sql);

                            dispose();
//                            admin_full a = new admin_full();
//                            a.setVisible(true);

                        } else {
                            //A method ic comming here

                            JOptionPane.showMessageDialog(null, "Enter correct administrator passowrd first");

                            txt_pass.setText("");
                        }
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }

            //STAFF_________________________________________________________________
            if (co.equals("STAFF")) {

                try {
                    String pass = txt_pass.getText();
                    String use = (String) com_sel.getSelectedItem();

                    String querry = "SELECT * FROM admin_data WHERE pass = '" + pass + "'";
                    pst = conn.prepareStatement(querry);
                    rs = pst.executeQuery();

                    if (rs.next()) {
                        String i = rs.getString("user");
                        String p = rs.getString("pass");

                        Statement sn = conn.createStatement();
                        long time = System.currentTimeMillis();
                        java.sql.Timestamp timestamp = new java.sql.Timestamp(time);

                        if (pass.equals(p) && use.equals(i)) {

                            String sql = "update admin_data set log_date= '" + timestamp + "' where pass='" + p + "'";
                            sn.executeUpdate(sql);

                            selection_panel a = new selection_panel();
                            a.setVisible(true);
                            dispose();

                        } else {

                            JOptionPane.showMessageDialog(null, "Enter correct staff password first");

                            txt_pass.setText("");
                        }
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }
        }
    }//GEN-LAST:event_txt_passKeyPressed

    private void txt_passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passKeyReleased

    }//GEN-LAST:event_txt_passKeyReleased

    private void karisloadComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_karisloadComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_karisloadComponentHidden

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         connection connect=new connection();
            conn=connect.Connectdb();

            String co = (String) com_sel.getSelectedItem();
            String txt = txt_pass.getText();

            if (co.equals("--select user--")) {
                JOptionPane.showMessageDialog(null, "Be sure to select the operator.");
            }

            //ADMINISTRATOR_________________________________________________________
            if (co.equals("ADMINISTRATOR")) {

                try {
                    String pass = txt_pass.getText();
                    String use = (String) com_sel.getSelectedItem();

                    String querry = "SELECT * FROM admin_data WHERE pass = '" + pass + "'";
                    pst = conn.prepareStatement(querry);
                    rs = pst.executeQuery();

                    if (rs.next()) {
                        String i = rs.getString("user");
                        String p = rs.getString("pass");

                        Statement sn = conn.createStatement();
                        long time = System.currentTimeMillis();
                        java.sql.Timestamp timestamp = new java.sql.Timestamp(time);

                        if (pass.equals(p) && use.equals(i)) {

                            String sql = "update admin_data set log_date= '" + timestamp + "' where pass='" + p + "'";
                            sn.executeUpdate(sql);

                            dispose();
//                            admin_full a = new admin_full();
//                            a.setVisible(true);

                        } else {
                            //A method ic comming here

                            JOptionPane.showMessageDialog(null, "Enter correct administrator password first");

                            txt_pass.setText("");
                        }
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }

            //STAFF_________________________________________________________________
            if (co.equals("STAFF")) {

                try {
                    String pass = txt_pass.getText();
                    String use = (String) com_sel.getSelectedItem();

                    String querry = "SELECT * FROM admin_data WHERE pass = '" + pass + "'";
                    pst = conn.prepareStatement(querry);
                    rs = pst.executeQuery();

                    if (rs.next()) {
                        String i = rs.getString("user");
                        String p = rs.getString("pass");

                        Statement sn = conn.createStatement();
                        long time = System.currentTimeMillis();
                        java.sql.Timestamp timestamp = new java.sql.Timestamp(time);

                        if (pass.equals(p) && use.equals(i)) {

                            String sql = "update admin_data set log_date= '" + timestamp + "' where pass='" + p + "'";
                            sn.executeUpdate(sql);

                            selection_panel a = new selection_panel();
                            a.setVisible(true);
                            dispose();

                        } else {

                            JOptionPane.showMessageDialog(null, "Enter correct staff password first");

                            txt_pass.setText("");
                        }
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }
        // TODO add your handling code here:
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(operator_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(operator_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(operator_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(operator_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new operator_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Clock;
    private javax.swing.JComboBox com_sel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel karisload;
    private javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables
}
