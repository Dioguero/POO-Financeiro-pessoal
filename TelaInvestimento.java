/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.financaspessoa.classes;

import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Administrador
 */

public class TelaInvestimento extends javax.swing.JFrame {

    /**
     * Crates new form TelaInvestimento
     */
    private final ControladorTelaInvestimento controlador;
    public TelaInvestimento() {
        initComponents();
        setLocationRelativeTo(null);
        controlador = new ControladorTelaInvestimento(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jPoupanca1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLCI = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTesoura = new javax.swing.JTextField();
        jRDB = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jIPCA = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jvalorinvestimento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/financaspessoa/salario.png"))); // NOI18N
        jLabel11.setText("Poupanca");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jPoupanca1.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jPoupanca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 90, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/financaspessoa/salario.png"))); // NOI18N
        jLabel12.setText("LCI");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLCI.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jLCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 90, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/financaspessoa/salario.png"))); // NOI18N
        jLabel14.setText("Tesouro");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/financaspessoa/salario.png"))); // NOI18N
        jLabel13.setText("RDB");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        jTesoura.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jTesoura, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 100, -1));

        jRDB.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jRDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 100, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/financaspessoa/salario.png"))); // NOI18N
        jLabel15.setText("IPCA");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        jIPCA.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jIPCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 110, 30));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/financaspessoa/calculadora (1).png"))); // NOI18N
        jButton2.setText("Investimentos");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 300, -1));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel1.setText("Valor a ser Investido");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jvalorinvestimento.setBackground(new java.awt.Color(204, 204, 255));
        jvalorinvestimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvalorinvestimentoActionPerformed(evt);
            }
        });
        jvalorinvestimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jvalorinvestimentoKeyPressed(evt);
            }
        });
        getContentPane().add(jvalorinvestimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 200, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Downloads\\fundovaivc.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 690, 260));

        jMenu1.setText("Menu");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Economias");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Educacao financeira");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setText("Questionário");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        controlador.CalculoRendimentos();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jvalorinvestimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvalorinvestimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jvalorinvestimentoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        controlador.entrarSistemaEconomia();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        controlador.entrarSistemaEducacao();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
             controlador.CalculoRendimentos();
     
      
    } 
    }//GEN-LAST:event_jButton2KeyPressed

    private void jvalorinvestimentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jvalorinvestimentoKeyPressed
        // TODO add your handling code here:
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
             controlador.CalculoRendimentos();
     
      
    }
    }//GEN-LAST:event_jvalorinvestimentoKeyPressed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        controlador.entrarSistemaQuestionario();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInvestimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInvestimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInvestimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInvestimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInvestimento().setVisible(true);
            }
        });
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public JTextField getjIPCA() {
        return jIPCA;
    }

    public void setjIPCA(JTextField jIPCA) {
        this.jIPCA = jIPCA;
    }

    public JTextField getjLCI() {
        return jLCI;
    }

    public void setjLCI(JTextField jLCI) {
        this.jLCI = jLCI;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public JLabel getjLabel15() {
        return jLabel15;
    }

    public void setjLabel15(JLabel jLabel15) {
        this.jLabel15 = jLabel15;
    }

    public JTextField getjPoupanca1() {
        return jPoupanca1;
    }

    public void setjPoupanca1(JTextField jPoupanca1) {
        this.jPoupanca1 = jPoupanca1;
    }

    public JTextField getjRDB() {
        return jRDB;
    }

    public void setjRDB(JTextField jRDB) {
        this.jRDB = jRDB;
    }

    public JTextField getjTesoura() {
        return jTesoura;
    }

    public void setjTesoura(JTextField jTesoura) {
        this.jTesoura = jTesoura;
    }

    public JTextField getJvalorinvestimento() {
        return jvalorinvestimento;
    }

    public void setJvalorinvestimento(JTextField jvalorinvestimento) {
        this.jvalorinvestimento = jvalorinvestimento;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jIPCA;
    private javax.swing.JTextField jLCI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JTextField jPoupanca1;
    private javax.swing.JTextField jRDB;
    private javax.swing.JTextField jTesoura;
    private javax.swing.JTextField jvalorinvestimento;
    // End of variables declaration//GEN-END:variables
}
