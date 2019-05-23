/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproyecto;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class SolServicios extends javax.swing.JFrame {
 
   
    public SolServicios() {
        initComponents();
        servicio.addItem("Baño");
        servicio.addItem("Paseo");
        servicio.addItem("Servicio de veterinario");
        this.setLocationRelativeTo(null);
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/LogoHuella.png"));
        return retValue;
    }
   public static ArrayList<Servicio> servicios = new ArrayList();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        pago = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        hor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lug = new javax.swing.JTextField();
        servicio = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        men = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JButton();
        LogoCel = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic Light", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pago");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        pago.setBackground(new java.awt.Color(153, 0, 153));
        pago.setFont(new java.awt.Font("Yu Gothic Light", 1, 11)); // NOI18N
        pago.setForeground(new java.awt.Color(255, 255, 255));
        pago.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 150, -1));

        jButton2.setBackground(new java.awt.Color(153, 0, 153));
        jButton2.setFont(new java.awt.Font("Yu Gothic Light", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Atrás");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 60, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Horario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        hor.setBackground(new java.awt.Color(153, 0, 153));
        hor.setFont(new java.awt.Font("Yu Gothic Light", 1, 11)); // NOI18N
        hor.setForeground(new java.awt.Color(255, 255, 255));
        hor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(hor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 150, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lugar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        lug.setBackground(new java.awt.Color(153, 0, 153));
        lug.setFont(new java.awt.Font("Yu Gothic Light", 1, 11)); // NOI18N
        lug.setForeground(new java.awt.Color(255, 255, 255));
        lug.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lug, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 150, -1));

        servicio.setBackground(new java.awt.Color(204, 204, 204));
        servicio.setFont(new java.awt.Font("Yu Gothic Light", 1, 11)); // NOI18N
        servicio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 150, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo de servicio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 0, 153));
        jButton1.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Mandar Solicitud");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 160, 43));

        men.setFont(new java.awt.Font("Yu Gothic Light", 1, 13)); // NOI18N
        men.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(men, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 200, 23));

        BotonSalir.setBackground(new java.awt.Color(153, 0, 153));
        BotonSalir.setFont(new java.awt.Font("Yu Gothic Light", 1, 11)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("Salir");
        BotonSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 60, -1));

        LogoCel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/towel.png"))); // NOI18N
        getContentPane().add(LogoCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        nom.setBackground(new java.awt.Color(153, 0, 153));
        nom.setFont(new java.awt.Font("Yu Gothic Light", 1, 11)); // NOI18N
        nom.setForeground(new java.awt.Color(255, 255, 255));
        nom.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 150, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic Light", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre Servicio");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2FondoPoo.jpg"))); // NOI18N
        Fondo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Inicio ini = new Inicio();
        this.setVisible(false);
        ini.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Servicio ser = new Servicio();
        String hora = hor.getText();
        ser.horario = hora;
        String luga = lug.getText();
        ser.lugar = luga;
        int pag = Integer.parseInt(pago.getText());
        ser.pago = pag;
        String nomb = nom.getText();
        ser.nombre = nomb;
        String serv = (String) servicio.getSelectedItem();
        if (serv.equals("Baño")) {
            ser.servicio = TipoServicio.Baño;
        } else {
            if (serv.equals("paseo")) {
                ser.servicio = TipoServicio.Paseo;
            } else {
                ser.servicio = TipoServicio.Veterinario;
            }
        }
        servicios.add(ser);     
        men.setText("Servicio solicitado");
        PreServicios.servicios.equals(servicios);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(SolServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SolServicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel LogoCel;
    private javax.swing.JTextField hor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField lug;
    private javax.swing.JLabel men;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField pago;
    private javax.swing.JComboBox<String> servicio;
    // End of variables declaration//GEN-END:variables
}
