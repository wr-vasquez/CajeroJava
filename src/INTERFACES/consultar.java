/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFACES;

import static INTERFACES.LOGIN.cn;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author Ale
 */
public class consultar extends javax.swing.JFrame {
public String igual;
    /**
     * Creates new form consultar
     */
    public consultar() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.igual=LOGIN.usuarioingreso.getText();
        consultarsaldo();
        consultarusuario();
        this.count1.setText(igual);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        saldo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        LAB = new javax.swing.JLabel();
        count1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Bazaronite", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("SU SALDO ACTUAL ES:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 320, 60));

        jLabel4.setFont(new java.awt.Font("Bazaronite", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("CUENTA NO-");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 320, 60));

        saldo.setEditable(false);
        saldo.setBackground(new java.awt.Color(51, 51, 255));
        saldo.setFont(new java.awt.Font("Bodoni MT Black", 1, 48)); // NOI18N
        getContentPane().add(saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 290, 50));

        jButton2.setText("NO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 170, -1));

        jButton1.setText("SI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 170, -1));

        LAB.setFont(new java.awt.Font("Bazaronite", 1, 24)); // NOI18N
        LAB.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(LAB, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 310, 40));

        count1.setEditable(false);
        count1.setBackground(new java.awt.Color(51, 0, 255));
        count1.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        count1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                count1ActionPerformed(evt);
            }
        });
        getContentPane().add(count1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 250, 40));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("AUTOCASHER");
        jLabel7.setToolTipText("");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 170, 50));

        jLabel5.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("DESEA REALIZAR OTRA TRANSACCION");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 420, 140));

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("UNO SIEMPRE CERCA DE USTED.");
        jLabel8.setToolTipText("");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 210, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/FondoAzul.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new LOGIN().setVisible(true);
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void count1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_count1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_count1ActionPerformed

    
    public void consultarsaldo()
    {
        try { 
        
        
        LOGIN L= new LOGIN();
        L.conectar();
        Statement sent1=cn.createStatement();
        
        ResultSet consulta= sent1.executeQuery("Select SALDO_TOTAL_MONETARIA from CUENTA_MONETARIA WHERE USUARIO_CUENTA_MONETARIA='"+igual+"'");
        
       
        consulta.next();
      this.saldo.setText("Q."+String.valueOf(consulta.getInt("SALDO_TOTAL_MONETARIA"))+".00");
        
        
        
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "ERROR"+ex);
    }
              
    }
    public void consultarusuario()
    {
        try { 
        
        
        LOGIN L= new LOGIN();
        L.conectar();
        Statement sent1=cn.createStatement();
        
        ResultSet consulta= sent1.executeQuery("Select NOMBRE_USUARIO, APELLIDO_USUARIO from USUARIO WHERE USUARIO_CUENTA='"+igual+"'");
        
       
        consulta.next();
      this.LAB.setText("    "+String.valueOf(consulta.getString("NOMBRE_USUARIO"))+" "+String.valueOf(consulta.getString("APELLIDO_USUARIO")));
        
        
        
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "ERROR"+ex);
    }
              
    }
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
            java.util.logging.Logger.getLogger(consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LAB;
    private javax.swing.JTextField count1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField saldo;
    // End of variables declaration//GEN-END:variables
}
