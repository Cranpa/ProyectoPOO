/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproyecto;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class iPets extends javax.swing.JFrame {

    public iPets() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/LogoHuella.png"));
        return retValue;
    }

    public static ArrayList<Usuario> usuarios = new ArrayList();

    public static ArrayList leerArchivo() {

        File file = new File("C:\\archivos\\estudiantes.txt");
        ArrayList listausuarios = new ArrayList<>();
        Scanner scanner;
        try {

            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {

                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);

                delimitar.useDelimiter("\\s*,\\s*");
                Usuario e = new Usuario();
                e.setNombre(delimitar.next());
                e.setUsuario(delimitar.next());
                e.setContraseña(delimitar.next());

                listausuarios.add(e);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return listausuarios;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        usuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JTextField();
        mensaje = new javax.swing.JLabel();
        LogoH = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 0, 153));
        jButton1.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ingresar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 108, 38));

        jButton2.setBackground(new java.awt.Color(153, 0, 153));
        jButton2.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Registrar");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 108, 38));

        usuario.setBackground(new java.awt.Color(153, 0, 153));
        usuario.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 153, -1));

        contraseña.setBackground(new java.awt.Color(153, 0, 153));
        contraseña.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 153, -1));

        mensaje.setFont(new java.awt.Font("Yu Gothic Light", 1, 13)); // NOI18N
        mensaje.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 320, 240, 23));

        LogoH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoHuella.png"))); // NOI18N
        getContentPane().add(LogoH, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Harlow Solid Italic", 1, 44)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 153));
        jLabel3.setText("iPets");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

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
        getContentPane().add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 60, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMagenta.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Registro1 reg = new Registro1();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Registro1 reg = new Registro1();
        usuarios = leerArchivo();
        reg.usuarios.equals(usuarios);
        Inicio ini = new Inicio();

        String usu = usuario.getText();
        String contra = contraseña.getText();

        boolean sw = false;

        for (Usuario u : reg.usuarios) {
            if (u.getUsuario().equals(usu)) {
                if (u.getContraseña().equals(contra)) {
                    sw = true;
                    ini.setVisible(true);
                    this.setVisible(false);
                    break;
                }
            }
        }
        if (sw == false) {
            mensaje.setText("No se encontró el usuario");
        }

        Inicio.nombre.setText(usuario.getText());


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
            java.util.logging.Logger.getLogger(iPets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iPets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iPets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iPets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iPets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel LogoH;
    private javax.swing.JTextField contraseña;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel mensaje;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
