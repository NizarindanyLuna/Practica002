/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Is Dahud
 */
public class dlgAutomoviles extends javax.swing.JFrame {

    /**
     * Creates new form dlgAutomoviles
     */
    public dlgAutomoviles() {
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

        BoxPlazo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTotFinanciar = new javax.swing.JTextField();
        txtPMensual = new javax.swing.JTextField();
        txtPInicial = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        txtPorcentajeI = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtDescripcionA = new javax.swing.JTextField();
        txtNumC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        BoxPlazo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36" }));
        BoxPlazo.setEnabled(false);
        getContentPane().add(BoxPlazo);
        BoxPlazo.setBounds(230, 250, 72, 22);

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        jLabel1.setText("--- :: Concesionaria :: ---");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 20, 257, 32);

        jLabel2.setText("Numero de Cotizacion");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 80, 130, 16);

        jLabel3.setText("Descripcion");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 120, 80, 16);

        jLabel4.setText("Precio");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 170, 50, 16);

        jLabel5.setText("Porcentaje de pago incial");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 210, 160, 16);

        jLabel6.setText("Plazo");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 250, 50, 16);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, ":: ---[ CALCULOS ]--- ::", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI Historic", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(null);

        jLabel7.setText("Pago inicial");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(100, 40, 70, 16);

        jLabel8.setText("Pago mensual");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(90, 100, 90, 16);

        jLabel9.setText("Total a fin");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(110, 70, 70, 16);

        txtTotFinanciar.setEnabled(false);
        jPanel1.add(txtTotFinanciar);
        txtTotFinanciar.setBounds(190, 70, 100, 22);

        txtPMensual.setEnabled(false);
        jPanel1.add(txtPMensual);
        txtPMensual.setBounds(190, 100, 80, 22);

        txtPInicial.setEnabled(false);
        jPanel1.add(txtPInicial);
        txtPInicial.setBounds(190, 40, 90, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 310, 450, 140);

        btnNuevo.setBackground(new java.awt.Color(204, 204, 204));
        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        getContentPane().add(btnNuevo);
        btnNuevo.setBounds(430, 80, 72, 40);

        btnMostrar.setBackground(new java.awt.Color(204, 204, 204));
        btnMostrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar.setText("Mostrar");
        btnMostrar.setEnabled(false);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrar);
        btnMostrar.setBounds(430, 140, 74, 40);

        btnGuardar.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(430, 200, 75, 40);

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setEnabled(false);
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(70, 470, 72, 23);

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(230, 470, 90, 23);

        btnCerrar.setBackground(new java.awt.Color(204, 204, 204));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("Cerrar");
        btnCerrar.setEnabled(false);
        getContentPane().add(btnCerrar);
        btnCerrar.setBounds(410, 470, 72, 23);

        txtPorcentajeI.setEnabled(false);
        getContentPane().add(txtPorcentajeI);
        txtPorcentajeI.setBounds(230, 210, 70, 22);

        txtPrecio.setEnabled(false);
        getContentPane().add(txtPrecio);
        txtPrecio.setBounds(230, 170, 90, 22);

        txtDescripcionA.setEnabled(false);
        getContentPane().add(txtDescripcionA);
        txtDescripcionA.setBounds(230, 120, 170, 40);

        txtNumC.setEnabled(false);
        txtNumC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumCActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumC);
        txtNumC.setBounds(230, 80, 100, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumCActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(dlgAutomoviles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgAutomoviles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgAutomoviles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgAutomoviles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dlgAutomoviles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> BoxPlazo;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnMostrar;
    public javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtDescripcionA;
    public javax.swing.JTextField txtNumC;
    public javax.swing.JTextField txtPInicial;
    public javax.swing.JTextField txtPMensual;
    public javax.swing.JTextField txtPorcentajeI;
    public javax.swing.JTextField txtPrecio;
    public javax.swing.JTextField txtTotFinanciar;
    // End of variables declaration//GEN-END:variables
}