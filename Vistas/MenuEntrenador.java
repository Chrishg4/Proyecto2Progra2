/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.Graphics;
import java.awt.PopupMenu;
import javax.swing.ImageIcon;
import Vistas.ClientesFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author chris
 */
public class MenuEntrenador extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public MenuEntrenador() {
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

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/Fondogym.jpg"));
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent (Graphics g){
                g.drawImage (icon.getImage(), 0, 0, getWidth(),getHeight(),this);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        jMenu1.setText("Agregar Cliente");

        // Supongo que ya tienes declarado algo como:

        ClientesFrame frmC = new ClientesFrame();
        // Agregar el MouseListener al JMenu para detectar clics
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Mostrar el JInternalFrame "jMenu1"
                jDesktopPane1.add(frmC);
                if (!frmC.isVisible()) {
                    frmC.setVisible(true);
                }
                frmC.toFront(); // Traer el frame al frente
            }
        });

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Entrenadores");

        EntrenadoresFrame frmE = new EntrenadoresFrame();
        // Agregar el MouseListener al JMenu para detectar clics
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Mostrar el JInternalFrame "jMenu1"
                jDesktopPane1.add(frmE);
                if (!frmE.isVisible()) {
                    frmE.setVisible(true);
                }
                frmE.toFront(); // Traer el frame al frente
            }
        });

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Clases");

        ClaseFrame frmCl = new ClaseFrame();
        // Agregar el MouseListener al JMenu para detectar clics
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Mostrar el JInternalFrame "jMenu1"
                jDesktopPane1.add(frmCl);
                if (!frmCl.isVisible()) {
                    frmCl.setVisible(true);
                }
                frmCl.toFront(); // Traer el frame al frente
            }
        });

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Pagos");

        PagoFrame frmP = new PagoFrame();
        // Agregar el MouseListener al JMenu para detectar clics
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Mostrar el JInternalFrame "jMenu1"
                jDesktopPane1.add(frmP);
                if (!frmP.isVisible()) {
                    frmP.setVisible(true);
                }
                frmP.toFront(); // Traer el frame al frente
            }
        });

        jMenuBar1.add(jMenu4);

        jMenu5.setText("BuscarCliente");

        SearchCliente frmSH = new SearchCliente();
        // Agregar el MouseListener al JMenu para detectar clics
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Mostrar el JInternalFrame "jMenu1"
                jDesktopPane1.add(frmSH);
                if (!frmSH.isVisible()) {
                    frmSH.setVisible(true);
                }
                frmSH.toFront(); // Traer el frame al frente
            }
        });

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

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
            java.util.logging.Logger.getLogger(MenuEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new MenuEntrenador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
