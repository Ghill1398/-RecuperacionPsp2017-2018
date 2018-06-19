/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;
import Modelo.Cliente;

public class Main extends javax.swing.JFrame{
    private String cadena;
    private Cliente client = null;
    
    public Main(String cadena, Cliente client) {
        initComponents();
        this.cadena = cadena;
        this.client = client;
        mostrar(this.cadena);
        //verVideo();
    }
    
    public Main(){}

    public void mostrar(String cadena){   
        final SwingWorker worker = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                mostrarVideos(listaVideos, cadena);
                return null;
            }
        };
        worker.execute();
    }
    
    public void mostrarVideos(JTable jTable1, String cadena) {
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        String[] strings = cadena.split("#");
        String [] datosUsuario = new String[strings.length];
        
        for(int i = 0; i < strings.length; i++){
            datosUsuario = strings[i].split("@");
            for(int j = 1; j < datosUsuario.length; j++){
                String[] datosVideo = datosUsuario[j].split("&");
                String[] conjuntoDatos = {datosUsuario[0], datosVideo[0], datosVideo[1], datosVideo[2]};
                modelo.addRow(conjuntoDatos);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaVideos = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btnSubir = new javax.swing.JButton();
        jTextDescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnVer1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 125, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaVideos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "ID Video", "Titulo", "Descripción"
            }
        ));
        jScrollPane1.setViewportView(listaVideos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 610, 270));

        jToolBar1.setRollover(true);
        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, -1));

        btnSubir.setText("Subir video");
        btnSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 110, -1));

        jTextDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDescripcionActionPerformed(evt);
            }
        });
        getContentPane().add(jTextDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 140, -1));

        jLabel3.setText("Descripcion :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 70, 20));

        btnVer1.setText("DOWNLOAD");
        btnVer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVer1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnVer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 110, -1));

        jButton1.setText("Borrar video");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 120, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Videos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirActionPerformed
        // TODO add your handling code here:
        JFileChooser jFileChooser1 = new JFileChooser();
        int seleccion=jFileChooser1.showOpenDialog(this);

        if(seleccion==jFileChooser1.APPROVE_OPTION){
            File fichero=jFileChooser1.getSelectedFile();
            client.setFile(fichero);
            //PROTOCOLCRISTOTUBE1.0#VIDEO_UP#TOTAL_SIZE#SIZE_PACKAGE#METADATOS_VIDEO#LOGIN_USER#TITULO#DESCRIPCION
            System.out.println("Elijo fichero");
            System.out.println("Tamaño: "+ fichero.length());
            jFileChooser1.setVisible(false);
            final SwingWorker worker = new SwingWorker(){

                @Override
                protected Object doInBackground() throws Exception {
                    Interfaz.client.clientOn("PROTOCOLCRISTOTUBE1.0#VIDEO_UP#"+fichero.length()+"#1024#METADATOS_VIDEO#"+client.getLogin()+"#"+fichero.getName()+"#"+jTextDescripcion.getText());
                    return null;
                }
            };
            worker.execute();
        }
    }//GEN-LAST:event_btnSubirActionPerformed

    private void jTextDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDescripcionActionPerformed

    }//GEN-LAST:event_jTextDescripcionActionPerformed

    private void btnVer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVer1ActionPerformed
        // TODO add your handling code here:
        String idVideo = (String) this.listaVideos.getValueAt(this.listaVideos.getSelectedRow(), 1);
        System.out.println(idVideo);
        String login = (String) this.listaVideos.getValueAt(this.listaVideos.getSelectedRow(), 0);
        final SwingWorker worker = new SwingWorker(){

            @Override
            protected Object doInBackground() throws Exception {
                Interfaz.client.clientOn("PROTOCOLCRISTOTUBE1.0#"+login+"#GETVIDEO#"+ idVideo);
                return null;
            }
        };
        worker.execute();
    }//GEN-LAST:event_btnVer1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String idVideo = (String) this.listaVideos.getValueAt(this.listaVideos.getSelectedRow(), 1);
        System.out.println(idVideo);
        final SwingWorker worker = new SwingWorker(){

            @Override
            protected Object doInBackground() throws Exception {
                Interfaz.client.clientOn("PROTOCOLCRISTOTUBE1.0#DELETE_VIDEO#"+ idVideo);
                return null;
            }
        };
        worker.execute();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubir;
    private javax.swing.JButton btnVer1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextDescripcion;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable listaVideos;
    // End of variables declaration//GEN-END:variables

}
