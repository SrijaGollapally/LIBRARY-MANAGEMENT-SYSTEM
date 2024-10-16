/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.management.system;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author srija
 */
public class IssueBook extends javax.swing.JFrame {
    Connection con=Connect.ConnectToDB();
    PreparedStatement pst=null;
    ResultSet res=null;
    

    /**
     * Creates new form IssueBook
     */
    public IssueBook() {
        initComponents();
        //SimpleDateFormat sfd=new SimpleDateFormat("dd/mm/yyyy");
        //Date d=new Date();
        //txtissue.setText(sfd.format(d));
        SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd");
    Date d = new Date();
    txtissue.setText(sfd.format(d));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtstuid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtissue = new javax.swing.JTextField();
        txtdue = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/allpageicon.jpg"))); // NOI18N
        jLabel1.setText("Issue Book");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 44, 308, 61));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel2.setText("Book ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 197, -1, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel3.setText("Student ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 258, -1, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel4.setText("Book Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 319, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel5.setText("Issue Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel6.setText("Due Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 442, -1, -1));

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 196, 158, -1));

        txtstuid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstuidActionPerformed(evt);
            }
        });
        getContentPane().add(txtstuid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 257, 158, -1));
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 318, 158, -1));
        getContentPane().add(txtissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 379, 158, -1));
        getContentPane().add(txtdue, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 441, 158, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 41, 40));

        jButton2.setBackground(new java.awt.Color(153, 0, 51));
        jButton2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ISSUE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 533, -1, 41));

        jButton3.setBackground(new java.awt.Color(153, 0, 0));
        jButton3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bokokok.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtstuidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstuidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstuidActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(txtid.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please enter book id and search for it ");
            txtid.requestFocus();
        }
        else
        {
            try {
                pst = con.prepareStatement("UPDATE book SET STATUS=?, ISSUEDATE=?, DUEDATE=?, STUDENTID=? WHERE id=?");
                   // Add this line to specify the book to update.

                pst.setString(1,"ISSUED");
                pst.setString(2,txtissue.getText());
                pst.setString(3,txtdue.getText());
                pst.setString(4,txtstuid.getText());
                pst.setString(5, txtid.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"Book Issued");
                txtid.setText("");
                txtname.setText("");
                txtstuid.setText("");
                txtissue.setText("");
                txtdue.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       /* if (txtid.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "Please enter book id and search for it ");
        txtid.requestFocus();
        return;
    }

    try {
        // Check if the book is already issued
        pst = con.prepareStatement("SELECT STATUS FROM book WHERE id=?");
        pst.setString(1, txtid.getText());
        res = pst.executeQuery();
        
        if (res.next()) {
            String status = res.getString("STATUS");
            if (status.equals("ISSUED")) {
                JOptionPane.showMessageDialog(this, "This book is already issued.");
                return; // Exit the method if the book is already issued
            }
        }

        // Validate student ID
        pst = con.prepareStatement("SELECT * FROM students WHERE id=?");
        pst.setString(1, txtstuid.getText());
        res = pst.executeQuery();
        if (!res.next()) {
            JOptionPane.showMessageDialog(this, "Invalid Student ID.");
            return;
        }

        // Update book status
        /*pst = con.prepareStatement("UPDATE book SET STATUS=?, ISSUEDATE=?, DUEDATE=?, STUDENTID=? WHERE id=?");
        pst.setString(1, "ISSUED");
        pst.setString(2, txtissue.getText());
        // Calculate due date (for example, 14 days from issue date)
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        cal.setTime(sdf.parse(txtissue.getText()));
        cal.add(Calendar.DATE, 14);
        String dueDate = sdf.format(cal.getTime());
        txtdue.setText(dueDate); // Set due date in the text field
        pst.setString(3, dueDate);
        pst.setString(4, txtstuid.getText());
        pst.setString(5, txtid.getText()); // Update specific book
        pst.executeUpdate();
        
        JOptionPane.showMessageDialog(this, "Book Issued");
        txtid.setText("");
        txtname.setText("");
        txtstuid.setText("");
        txtissue.setText("");
        txtdue.setText("");
    } catch (SQLException | ParseException ex) {
        Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
    }*/
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(txtid.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please enter the book id and search it");
            txtid.requestFocus();
        
        }
        
        else
        {
            try {
                pst=con.prepareStatement("SELECT * FROM book WHERE id=?");
                pst.setString(1,txtid.getText());
                res=pst.executeQuery();
                if(res.next())
                {
                    txtname.setText(res.getString(2));
                }
            } catch (SQLException ex) {
                Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
            }
                   
                   
                    
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtdue;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtissue;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtstuid;
    // End of variables declaration//GEN-END:variables
}
