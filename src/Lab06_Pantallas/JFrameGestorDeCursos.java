/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lab06_Pantallas;

import Lab06_Entidades.Curso;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import laboratorio06.Laboratorio06;
/**
 *
 * @author Frank
 */
public class JFrameGestorDeCursos extends javax.swing.JFrame {

    private List<Curso> listaCursos;
    private DefaultListModel<String>ModelListaCursosShow;
       
    /**
     * Creates new form JFrameGestorDeCursos
     */
    public JFrameGestorDeCursos() {
        initComponents();
        listaCursos = Laboratorio06.cursosRegistrados;
        ModelListaCursosShow = new DefaultListModel<>();
        this.lstCursos.setModel(ModelListaCursosShow);
        ModelListaCursosShow.removeAllElements();
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
        btnCerrar = new javax.swing.JButton();
        lblGestordeCursos = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCursos = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        btnProfesores = new javax.swing.JButton();
        btnEstudiantes = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnOrderAsc = new javax.swing.JButton();
        btnOrderDesc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/btnCerrar1 (1).png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        lblGestordeCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/lblGestordeCursos.png"))); // NOI18N
        jPanel1.add(lblGestordeCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtBuscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtBuscar.setText("Buscar");
        txtBuscar.setBorder(null);
        txtBuscar.setOpaque(true);
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 360, 30));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/btnBuscar1.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));

        lstCursos.setBackground(new java.awt.Color(204, 255, 255));
        lstCursos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lstCursos.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        jScrollPane1.setViewportView(lstCursos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 560, 250));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/lstCursos.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 600, -1));

        btnProfesores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/btnProfesores1.png"))); // NOI18N
        btnProfesores.setBorder(null);
        btnProfesores.setContentAreaFilled(false);
        btnProfesores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfesoresActionPerformed(evt);
            }
        });
        jPanel1.add(btnProfesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        btnEstudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/btnEstudiantes1.png"))); // NOI18N
        btnEstudiantes.setBorder(null);
        btnEstudiantes.setContentAreaFilled(false);
        btnEstudiantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudiantesActionPerformed(evt);
            }
        });
        jPanel1.add(btnEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, -1, -1));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/btnAgregar1.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, -1, -1));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/btnEditar1.png"))); // NOI18N
        btnEditar.setBorder(null);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, -1, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/btnEliminar1.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, -1, -1));

        btnOrderAsc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/btnOrderAsc1.png"))); // NOI18N
        btnOrderAsc.setBorder(null);
        btnOrderAsc.setContentAreaFilled(false);
        btnOrderAsc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnOrderAsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 50, -1));

        btnOrderDesc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/btnOrderDesc1.png"))); // NOI18N
        btnOrderDesc.setBorder(null);
        btnOrderDesc.setContentAreaFilled(false);
        btnOrderDesc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnOrderDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/txtBuscar.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 430, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        //Mandar referencia a su clase Padre
        JFrameEditarCurso ventanaCurso = new JFrameEditarCurso(this);
        //Centro la ventana
        ventanaCurso.setLocationRelativeTo(this);
        //Hago visible la ventana Editar Curso
        ventanaCurso.setVisible(true);
        //Hago invisible la pantalla principal
        this.setVisible(false);
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfesoresActionPerformed

        JFrameProfesores ventanaProfesor = new JFrameProfesores(this);
        ventanaProfesor.setLocationRelativeTo(this);
        ventanaProfesor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProfesoresActionPerformed

    private void btnEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudiantesActionPerformed

        JFrameEstudiantes ventanaEstudiante = new JFrameEstudiantes(this);
        ventanaEstudiante.setLocationRelativeTo(this);
        ventanaEstudiante.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEstudiantesActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        volverACargarCursos(txtBuscar.getText().trim());
    }//GEN-LAST:event_btnBuscarActionPerformed

    //minuto 37:45
    public void AgregarCurso(Curso nuevoCurso){
    
        listaCursos.add(nuevoCurso);
        ModelListaCursosShow.removeAllElements();
        for(Curso curso: listaCursos){
            
            ModelListaCursosShow.addElement(curso.mostrarCursos());
        }
    }
    
    //Este metodo va a eliminar lo que se este mostrando
    //y lo reemplazara con todos los elementos de la lista

    private void volverACargarCursos(String criterio){
        
	//Recuerda que los cambios de la lista se hacen al modelo
	//No al objeto JList

	//Eliminar todos los elementos de la lista
	ModelListaCursosShow.removeAllElements();

	//Agregar todos los elementos de la lista de citas al 
	//componente gráfico
	for(Curso curso:listaCursos){
            //Agregar a la vista siempre y cuando el nombre
            //del curso coincida con el criterio
            if(curso.getNombre().contains(criterio)){
                ModelListaCursosShow.addElement(curso.mostrarCursos());
            }
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
            java.util.logging.Logger.getLogger(JFrameGestorDeCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGestorDeCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGestorDeCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGestorDeCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameGestorDeCursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEstudiantes;
    private javax.swing.JButton btnOrderAsc;
    private javax.swing.JButton btnOrderDesc;
    private javax.swing.JButton btnProfesores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGestordeCursos;
    private javax.swing.JList<String> lstCursos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}