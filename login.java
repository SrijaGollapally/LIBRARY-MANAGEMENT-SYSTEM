/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.management.system;
     
 import java.sql.Connection;
import javax.swing.JOptionPane;
 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
  

/**
 *
 * @author srija
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close icon.png"))); // NOI18N
        jButton1.setText("  ");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 50, 40));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USER ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, -1, 40));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" PASSWORD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, -1));

        txtname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 4, true));
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 170, -1));

        txtpassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(153, 153, 153));
        txtpassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 4, true));
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, 170, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LOGIN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 120, 28));

        jButton2.setBackground(new java.awt.Color(204, 51, 0));
        jButton2.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("LOGIN NOW");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 6));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 130, 30));

        jLabel4.setBackground(new java.awt.Color(204, 153, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/login page.jpg"))); // NOI18N
        jLabel4.setText(" ");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code herPanee:
            int yes=JOptionPane.showConfirmDialog(this,"Are you sure you really want to close this application?","Exit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(yes==JOptionPane.YES_OPTION)
            
                System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet res = null;

    System.out.println("Login button clicked!"); // Debugging print statement

    try {
        // Establishing database connection
        con = Connect.ConnectToDB();

        // Debugging connection success
        if (con != null) {
            System.out.println("Connection to the database was successful.");
        } else {
            System.out.println("Failed to connect to the database.");
        }

        // Preparing the SQL statement
        String sql = "SELECT * FROM login WHERE userid = ? AND password = ?";
        pst = con.prepareStatement(sql);
        pst.setString(1, txtname.getText());
        pst.setString(2, String.valueOf(txtpassword.getPassword())); // Correct way to fetch password

        // Debugging query execution
        System.out.println("Executing query: " + pst.toString());
        

        res = pst.executeQuery();

        // Checking if the user exists
        if (res.next()) {
            System.out.println("Login successful!");
            new Home().setVisible(true);
             
            
        } else {
            System.out.println("Invalid username or password.");
            JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.");
        }
    } catch (SQLException ex) {
        Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    } finally {
        // Ensuring the connection and resources are closed
        try {
            if (res != null) res.close();
            if (pst != null) pst.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
         
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
