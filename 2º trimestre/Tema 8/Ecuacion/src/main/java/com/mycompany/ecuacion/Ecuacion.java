package com.mycompany.ecuacion;

/**
 *
 * @author a20alejandrofs
 */
public class Ecuacion extends javax.swing.JFrame {

    /**
     * Creates new form Ecuacion
     */
    public Ecuacion() {
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

        resultado1 = new javax.swing.JLabel();
        resultado2 = new javax.swing.JLabel();
        boton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        valorA = new javax.swing.JTextField();
        valorB = new javax.swing.JTextField();
        valorC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultado1.setText("Click en calcular");
        getContentPane().add(resultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 220, -1));

        resultado2.setText("Click en calcular");
        getContentPane().add(resultado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 220, -1));

        boton.setText("Calcular");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });
        getContentPane().add(boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        jLabel1.setText("Valor A");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel2.setText("Valor B");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jLabel3.setText("Valor C");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));
        getContentPane().add(valorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 80, -1));
        getContentPane().add(valorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 80, -1));
        getContentPane().add(valorC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        if (!valorA.getText().isEmpty() && !valorB.getText().isEmpty() && !valorC.getText().isEmpty()){
            resultado1.setText(String.valueOf((-Double.parseDouble(valorB.getText()) + Math.sqrt((Double.parseDouble(valorB.getText())*Double.parseDouble(valorB.getText()))-(4*Double.parseDouble(valorA.getText())*Double.parseDouble(valorC.getText()))))/(2*Double.parseDouble(valorA.getText()))));
            resultado2.setText(String.valueOf((-Double.parseDouble(valorB.getText()) - Math.sqrt((Double.parseDouble(valorB.getText())*Double.parseDouble(valorB.getText()))-(4*Double.parseDouble(valorA.getText())*Double.parseDouble(valorC.getText()))))/(2*Double.parseDouble(valorA.getText()))));
        } else{
            resultado1.setText("Error");
            resultado2.setText("Error");
        }
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
            java.util.logging.Logger.getLogger(Ecuacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ecuacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ecuacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ecuacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ecuacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel resultado1;
    private javax.swing.JLabel resultado2;
    private javax.swing.JTextField valorA;
    private javax.swing.JTextField valorB;
    private javax.swing.JTextField valorC;
    // End of variables declaration//GEN-END:variables
}
