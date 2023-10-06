/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lab06_Pantallas;

import Lab06_Entidades.Curso;
import javax.swing.JFrame;

/**
 *
 * @author Frank
 */
public class JFrameEditarCurso extends javax.swing.JFrame {

    //El formulario padre
    private JFrameGestorDeCursos padre;
    private Curso curso;
    /**
     * Creates new form JFrameEditarCurso
     */
    public JFrameEditarCurso(JFrameGestorDeCursos padre) {
        initComponents();
        this.padre = padre;
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
        txtCreditos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCreditos.setBackground(new java.awt.Color(153, 204, 255));
        txtCreditos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 270, 50));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("[Nombre del Curso]");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 330, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/lblCurso.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 90));

        txtCodigo.setBackground(new java.awt.Color(153, 204, 255));
        txtCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 270, 50));

        txtNombre.setBackground(new java.awt.Color(153, 204, 255));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 270, 50));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/btnGuardar1.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setContentAreaFilled(false);
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/btnCancelar1.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setContentAreaFilled(false);
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, 70));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/lblCodigo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/lblCreditos.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/lblNombre.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(JFrameEditarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameEditarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameEditarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameEditarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameEditarCurso(new JFrameGestorDeCursos()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCreditos;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}