package farmaciadespertad;
import javax.swing.*;

public class Login extends javax.swing.JFrame {
    
    Usuario[] usuarios;
    public Login() {
        initComponents();
         usuarios =  new Usuario[]{new Usuario("Josue","123"), new Usuario("Sanchez","respeto"), new Usuario("Teddy","Nino")};
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jUsuarioText = new javax.swing.JLabel();
        jUsuarioText1 = new javax.swing.JLabel();
        jIngresoUsuario1 = new javax.swing.JTextField();
        jContraField = new javax.swing.JPasswordField();
        jIniciarSesionButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Inicie Sesion");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jUsuarioText.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jUsuarioText.setText("Ingrese su usuario:");

        jUsuarioText1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jUsuarioText1.setText("Ingrese su contrasenia:");

        jIniciarSesionButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jIniciarSesionButton.setText("Iniciar Sesion");
        jIniciarSesionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIniciarSesionButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("INGRESE SUS DATOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jUsuarioText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jIngresoUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jIniciarSesionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jUsuarioText1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(jContraField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUsuarioText)
                    .addComponent(jIngresoUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUsuarioText1)
                    .addComponent(jContraField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jIniciarSesionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jIniciarSesionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIniciarSesionButtonActionPerformed
        try
        {
         for(Usuario usuario: usuarios ){
            if(usuario.getUsuario().equals(jIngresoUsuario1.getText()) && usuario.getContrasenia().equals(new String(jContraField.getPassword()))){
                JOptionPane.showMessageDialog(this, "Bienvenido");
                 FormularioCompra f = new FormularioCompra();
                 f.setVisible(true);
                 this.dispose();              
            } 
        }
         //JOptionPane.showMessageDialog(this, "Usuario o contrasenia no estan correcta o usuario no existe"); 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, " Oops! Datos ingresados en mal formato");   
        }
        
    }//GEN-LAST:event_jIniciarSesionButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       int result = JOptionPane.showConfirmDialog(this, "Desea salir de la app?");
       if(result == JOptionPane.YES_OPTION){
           setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField jContraField;
    private javax.swing.JTextField jIngresoUsuario1;
    private javax.swing.JButton jIniciarSesionButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jUsuarioText;
    private javax.swing.JLabel jUsuarioText1;
    // End of variables declaration//GEN-END:variables
}
