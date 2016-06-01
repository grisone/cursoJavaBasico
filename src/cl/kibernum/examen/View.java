package cl.kibernum.examen;

//import cl.kibernum.entornografico.objects.CreditCardUtil;
//import cl.kibernum.entornografico.objects.Persona;
//import cl.kibernum.entornografico.objects.exception.NoSuchCardException;
import cl.kibernum.db.Cliente;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class View extends JFrame{
    public View() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
        private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            txtNombre = new javax.swing.JTextField();
            txtPassword = new javax.swing.JTextField();
            spinnerEdad = new javax.swing.JSpinner();
            cbSexo = new javax.swing.JComboBox<>();
            btnLimpiar = new javax.swing.JButton();
            btnCerrar = new javax.swing.JButton();
            btnGuardar = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel1.setText("Nombre");
            jLabel2.setText("Password");
            jLabel3.setText("Edad");
            jLabel4.setText("Genero");

            spinnerEdad.setModel(new javax.swing.SpinnerNumberModel(1, 0, 99, 1));
            cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Macho Alfa", "Amazona", "Fletito", "bicurioso" }));

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel1)
                                                            .addComponent(jLabel2)
                                                            .addComponent(jLabel3))
                                                    .addGap(42, 42, 42)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(txtNombre)
                                                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                                            .addComponent(spinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addContainerGap(22, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(6, 6, 6)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(spinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(35, Short.MAX_VALUE))
            );


            btnLimpiar.setText("reset");
            btnLimpiar.setName("btnLimpiar"); // NOI18N
            btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnLimpiarActionPerformed(evt);
                }
            });

            btnGuardar.setText("Guardar");
        btnGuardar.setName("btnGuardar"); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCerrar.setText("cerrar");
        btnCerrar.setName("btnCerrar"); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });



            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(82, 82, 82)
                                                    .addComponent(btnLimpiar)
                                                    .addGap(82, 82, 82)
                                                    .addComponent(btnGuardar)))
                                    .addContainerGap(17, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnLimpiar)
                                            .addComponent(btnGuardar))
                                    .addContainerGap(29, Short.MAX_VALUE))
            );

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>

        private void btnLimpiarActionPerformed(ActionEvent evt) {
            cleanForm();
            JOptionPane.showMessageDialog(null, "limpiar");
        }

        private void cleanForm(){
            txtNombre.setText("");
            txtPassword.setText("");
            spinnerEdad.getModel().setValue(0);
            cbSexo.setSelectedIndex(0);

        }

        private static void Error(String msj){
            JOptionPane.showMessageDialog(null, msj);
        }

        private static void Info(String msj){
            JOptionPane.showMessageDialog(null, msj);
        }


        private void btnGuardarActionPerformed(ActionEvent evt) {
            if(txtNombre.getText().equals("")){
               Error("Nombre es necesario");
            }else if(txtPassword.getText().equals("")){
                Error("password es necesario");
            }else if(spinnerEdad.getModel().getValue().equals(0)){
                Error("edad es necesario");
            }else if(cbSexo.getModel().getSelectedItem().equals( cbSexo.getModel().getElementAt(0))){
                Error("sexo es necesario");
            }else{
                Cliente micliente = new Cliente();

                micliente.setNombre( txtNombre.getText() );
                micliente.setPassword( txtPassword.getText() );
                micliente.setEdad( (int) spinnerEdad.getModel().getValue() );

                micliente.setGenero( cbSexo.getModel().getSelectedItem().toString() );



                Info("Almacenado correctamente");
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
                java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

        /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new View().setVisible(true);
                }
            });
        }

        // Variables declaration - do not modify
        private javax.swing.JButton btnGuardar;
        private javax.swing.JButton btnCerrar;
        private javax.swing.JButton btnLimpiar;
        private javax.swing.JComboBox<String> cbSexo;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JSpinner spinnerEdad;
        private javax.swing.JTextField txtNombre;
        private javax.swing.JTextField txtPassword;
        // End of variables declaration
}