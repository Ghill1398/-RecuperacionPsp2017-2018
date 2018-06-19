/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.BorderLayout;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class Video extends javax.swing.JFrame implements Runnable {
    public Thread thr;
    private final JFXPanel jfxPanel = new JFXPanel();  
    static File file;
    String hora;
    public Duration duration = new Duration(0);
    MediaPlayer oracleVid;
    MediaPlayer oracleVid2;
    public MediaView mediaView;

    public Video() {
        initComponents();
        //createScene();
        this.thr = new Thread(this, "repro");
        setTitle("Java Swing Video con FX");
        setResizable(false);
        setLocationRelativeTo(null);
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(jfxPanel,BorderLayout.CENTER);
        this.thr.start();
    }
    
     public Video(File file) {
        initComponents();
        this.file = file;
        this.thr = new Thread(this, "repro");
        setTitle("Java Swing Video con FX");
        setResizable(false);
        setLocationRelativeTo(null);
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(jfxPanel,BorderLayout.CENTER);
        this.thr.start();
    }
     
    public Video(String fech) {
        initComponents();
        createScene();
        hora = fech;
        
        setTitle("Java Swing Video con FX");
        setResizable(false);
        setLocationRelativeTo(null);
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(jfxPanel,BorderLayout.CENTER);
        
        oracleVid.setOnEndOfMedia(new Runnable() {
        @Override public void run() {
          oracleVid.stop();
          mediaView.setMediaPlayer(oracleVid2);
          oracleVid2.play();
        }
      });
    }
    
    private void createScene(){    
                    oracleVid = new MediaPlayer(                                       
                        new Media(this.file.toURI().toString())
                    );
                    
                    this.mediaView = new MediaView(oracleVid);
                    jfxPanel.setScene(new Scene(new Group(this.mediaView)));                    
                    oracleVid.setVolume(0.7);
                    oracleVid.setStartTime(duration);
                    oracleVid.play();          

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 997, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    boolean activado = true;
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
            java.util.logging.Logger.getLogger(Video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Video(file).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        this.createScene();
        boolean parado = true;
        Duration total_Duration = new Duration(1000);
        Duration aux = new Duration(0);
        Duration aux2 = new Duration(0);
        int i = 0;
        while(true){
            if(oracleVid.getTotalDuration().toSeconds() > 0)
            {
                total_Duration = oracleVid.getTotalDuration();
            }
            if(parado){
                aux = oracleVid.getCurrentTime();
                parado = !parado;
            }
            else if(!parado){
                aux2 = oracleVid.getCurrentTime();
                parado = !parado;
            }         
            
            if(oracleVid.getCurrentTime().toSeconds() >= total_Duration.toSeconds()){
        
                if(parado){
                    this.oracleVid.seek(aux);
                }
                else if(!parado){
                    this.oracleVid.seek(aux2);
                }            
                
                this.oracleVid.pause();
                try {
                    this.thr.sleep(300);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Video.class.getName()).log(Level.SEVERE, null, ex);
                }
                               
                if(parado){
                    this.duration = aux;
                    this.oracleVid.dispose();
                    this.createScene();
                }
                else if(!parado){
                    this.duration = aux2;
                    this.oracleVid.dispose();
                    this.createScene();
                }  
            }
        }

        
    }
}
