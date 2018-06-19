
package Vista;

import javax.swing.SwingWorker;

import Modelo.Cliente;

public class Interfaz extends javax.swing.JFrame {

    static Cliente client;
    String cadena;

    public Interfaz(String cadena) {
        this.cadena = cadena;
    }
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);/*
        // PrintStream around it to support the println/printf methods.
        PrintStream out = new PrintStream( new TextAreaOutputStream( txtConsole) );

        // redirect standard output stream to the TextAreaOutputStream
        System.setOut( out );

        // redirect standard error stream to the TextAreaOutputStream
        System.setErr( out );*/
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Conexion = new javax.swing.JPanel();
        ConectButton = new javax.swing.JButton();
        cadenaConexion = new javax.swing.JTextField();
        jTextLogin = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jTextPassword = new javax.swing.JTextField();
        jLabelLogin = new javax.swing.JLabel();
        jLabelUrl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelUrl1 = new javax.swing.JLabel();
        StringPuerto = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtConsole = new javax.swing.JTextArea();
        AddUser = new javax.swing.JPanel();
        textPassword = new javax.swing.JTextField();
        textDni = new javax.swing.JTextField();
        textApellido1 = new javax.swing.JTextField();
        textApellido2 = new javax.swing.JTextField();
        textLogin = new javax.swing.JTextField();
        textNombre = new javax.swing.JTextField();
        Insertar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);

        jTabbedPane1.setToolTipText("");

        ConectButton.setText("Login");
        ConectButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ConectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConectButtonActionPerformed(evt);
            }
        });

        cadenaConexion.setText("localhost");
        cadenaConexion.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        cadenaConexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadenaConexionActionPerformed(evt);
            }
        });

        jTextLogin.setText("Ghill");
        jTextLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextLoginActionPerformed(evt);
            }
        });

        jLabelPassword.setText("Password");

        jTextPassword.setText("1234");

        jLabelLogin.setText("Usuario");

        jLabelUrl.setText("Servidor");

        jLabelUrl1.setText("Puerto");

        StringPuerto.setText("6");
        StringPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        StringPuerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StringPuertoActionPerformed(evt);
            }
        });

        txtConsole.setColumns(20);
        txtConsole.setRows(5);
        jScrollPane5.setViewportView(txtConsole);

        javax.swing.GroupLayout ConexionLayout = new javax.swing.GroupLayout(Conexion);
        Conexion.setLayout(ConexionLayout);
        ConexionLayout.setHorizontalGroup(
            ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConexionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConexionLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(ConexionLayout.createSequentialGroup()
                        .addGroup(ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ConexionLayout.createSequentialGroup()
                                .addGroup(ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ConexionLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabelLogin))
                                    .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(ConexionLayout.createSequentialGroup()
                                        .addComponent(jLabelUrl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cadenaConexion, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ConexionLayout.createSequentialGroup()
                                        .addComponent(jLabelUrl1)
                                        .addGap(18, 18, 18)
                                        .addComponent(StringPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addComponent(ConectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        ConexionLayout.setVerticalGroup(
            ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConexionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConexionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLogin)
                            .addComponent(jTextLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelUrl1)
                            .addComponent(StringPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(ConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelUrl)
                            .addComponent(cadenaConexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ConexionLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(ConectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
        );

        jTabbedPane1.addTab("Login", Conexion);

        AddUser.setToolTipText("");
        AddUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textPassword.setText("NewPass");
        textPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPasswordActionPerformed(evt);
            }
        });
        AddUser.add(textPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 150, 20));

        textDni.setText("NewDNI");
        textDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDniActionPerformed(evt);
            }
        });
        AddUser.add(textDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 150, 20));

        textApellido1.setText("NewLN1");
        textApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textApellido1ActionPerformed(evt);
            }
        });
        AddUser.add(textApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 150, -1));

        textApellido2.setText("NewLN2");
        textApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textApellido2ActionPerformed(evt);
            }
        });
        AddUser.add(textApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 150, 20));

        textLogin.setText("NewLogin");
        textLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLoginActionPerformed(evt);
            }
        });
        AddUser.add(textLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 150, 20));

        textNombre.setText("NewNombre");
        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });
        AddUser.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 150, 20));

        Insertar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Insertar.setText("OK");
        Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarActionPerformed(evt);
            }
        });
        AddUser.add(Insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 70, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setText("Registro");
        AddUser.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel3.setText("Nombre");
        AddUser.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel4.setText("DNI");
        AddUser.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel8.setText("Last Name1");
        AddUser.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel9.setText("Last Name2");
        AddUser.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel5.setText("Login");
        AddUser.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel7.setText("Password");
        AddUser.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jTabbedPane1.addTab("Register", AddUser);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextLoginActionPerformed

    private void cadenaConexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadenaConexionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadenaConexionActionPerformed

    private void ConectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConectButtonActionPerformed

        client = new Cliente(cadenaConexion.getText().trim(),6);
        String mensajeCliente = "PROTOCOLCRISTOTUBE1.0#LOGIN#" +
        jTextLogin.getText().trim() + "#" +
        jTextPassword.getText().trim();

        final SwingWorker worker = new SwingWorker(){

            @Override
            protected Object doInBackground() throws Exception {
                client.clientOn(mensajeCliente);
                return null;
            }
        };
        worker.execute();

    }//GEN-LAST:event_ConectButtonActionPerformed

    private void InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarActionPerformed
        // TODO add your handling code here:

        final SwingWorker worker = new SwingWorker(){

            @Override
            protected Object doInBackground() throws Exception {
                insertarDatos();
                return null;
            }
        };
        worker.execute();
        
        //jLabel1.setText("User: " + client.getLogin());
    }//GEN-LAST:event_InsertarActionPerformed

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void textLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLoginActionPerformed

    private void textApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textApellido2ActionPerformed

    private void textApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textApellido1ActionPerformed

    private void textDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDniActionPerformed

    private void textPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPasswordActionPerformed

    private void StringPuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StringPuertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StringPuertoActionPerformed
    
    
    
    public void insertarDatos(){
            String mensajeCliente = "PROTOCOLCRISTOTUBE1.0#REGISTER#" +
                                    textDni.getText().trim() + "#" +
                                    textNombre.getText().trim() + "#" +
                                    textApellido1.getText().trim() + "#" +
                                    textApellido2.getText().trim() + "#" +
                                    textLogin.getText().trim() + "#" +
                                    textPassword.getText().trim();
            
            client.enviarMensaje(mensajeCliente);
    }
    
    public void comprobarLogin(){
            String mensajeCliente = "PROTOCOLCRISTOTUBE1.0#LOGIN#" +
                                    jTextLogin.getText().trim() + "#" +
                                    jTextPassword.getText().trim();
            
            client.enviarMensaje(mensajeCliente);
        
    }

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddUser;
    private javax.swing.JButton ConectButton;
    private javax.swing.JPanel Conexion;
    private javax.swing.JButton Insertar;
    private javax.swing.JTextField StringPuerto;
    private javax.swing.JTextField cadenaConexion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUrl;
    private javax.swing.JLabel jLabelUrl1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextLogin;
    private javax.swing.JTextField jTextPassword;
    private javax.swing.JTextField textApellido1;
    private javax.swing.JTextField textApellido2;
    private javax.swing.JTextField textDni;
    private javax.swing.JTextField textLogin;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textPassword;
    private javax.swing.JTextArea txtConsole;
    // End of variables declaration//GEN-END:variables

}
