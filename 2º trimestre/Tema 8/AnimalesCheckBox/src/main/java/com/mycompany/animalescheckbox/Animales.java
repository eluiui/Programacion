/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.animalescheckbox;

/**
 *
 * @author a20alejandrofs
 */
public class Animales extends javax.swing.JFrame {

    /**
     * Creates new form Animales
     */
    public Animales() {
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

        gallo = new javax.swing.JCheckBox();
        gato = new javax.swing.JCheckBox();
        perro = new javax.swing.JCheckBox();
        texto = new javax.swing.JLabel();
        boton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gallo.setText("Gallo");
        getContentPane().add(gallo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        gato.setText("Gato");
        getContentPane().add(gato, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        perro.setText("Perro");
        getContentPane().add(perro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        texto.setText("Click en hablar");
        getContentPane().add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 340, -1));

        boton.setText("Hablar");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });
        getContentPane().add(boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        String cadena = "";
        if (gallo.isSelected()){
            cadena = cadena+" kikiriki";
        }
        if (gato.isSelected()){
            cadena = cadena+" miau";
        }
        if (perro.isSelected()){
            cadena = cadena+" guau";
        }
        texto.setText(cadena);
    }//GEN-LAST:event_botonActionPerformed

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
            java.util.logging.Logger.getLogger(Animales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Animales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Animales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Animales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Animales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JCheckBox gallo;
    private javax.swing.JCheckBox gato;
    private javax.swing.JCheckBox perro;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
