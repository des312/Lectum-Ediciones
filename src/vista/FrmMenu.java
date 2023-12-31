package vista;

import java.awt.Dimension;
import static java.awt.GridBagConstraints.BOTH;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;
import vista.InternalFrameInventario.InternalAgregarLibros;
import vista.InternalFrameInventario.InternalVerInventario;

public class FrmMenu extends javax.swing.JFrame {

    public static JDesktopPane jDesktopPane_menu;

    public FrmMenu() {
        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Inventario");

//        ImageIcon icon = new ImageIcon("src/img/verinventario.png");
//        jMenuItemVerEn.setIcon(icon);
//        JMenuItem menuItem = new JMenuItem("Item de Menú");
//        menu.add(menuItem);
        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();

        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        this.jDesktopPane_menu.setBounds(0, 0, ancho, (alto - 110));
        this.add(jDesktopPane_menu);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuInventario = new javax.swing.JMenu();
        jMenuItemVerInven = new javax.swing.JMenuItem();
        jMenuItemAgregarInve = new javax.swing.JMenuItem();
        jMenuNEntrega = new javax.swing.JMenu();
        jMenuItemVerEn = new javax.swing.JMenuItem();
        jMenuItemAgregarEn = new javax.swing.JMenuItem();
        jMenuNVenta = new javax.swing.JMenu();
        jMenuItemVerVe = new javax.swing.JMenuItem();
        jMenuItemAgregVe = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemComoAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(242, 242, 242));

        jMenuInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inventario2.png"))); // NOI18N
        jMenuInventario.setText("Inventario");
        jMenuInventario.setFont(new java.awt.Font("Bodoni MT", 2, 24)); // NOI18N
        jMenuInventario.setPreferredSize(new java.awt.Dimension(300, 50));

        jMenuItemVerInven.setFont(new java.awt.Font("Bodoni MT", 2, 14)); // NOI18N
        jMenuItemVerInven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Verinventario.png"))); // NOI18N
        jMenuItemVerInven.setText("Ver Inventario");
        jMenuItemVerInven.setPreferredSize(new java.awt.Dimension(250, 50));
        jMenuItemVerInven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVerInvenActionPerformed(evt);
            }
        });
        jMenuInventario.add(jMenuItemVerInven);

        jMenuItemAgregarInve.setFont(new java.awt.Font("Bodoni MT", 2, 14)); // NOI18N
        jMenuItemAgregarInve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/libro.png"))); // NOI18N
        jMenuItemAgregarInve.setText("Agregar Libros");
        jMenuItemAgregarInve.setPreferredSize(new java.awt.Dimension(150, 50));
        jMenuItemAgregarInve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgregarInveActionPerformed(evt);
            }
        });
        jMenuInventario.add(jMenuItemAgregarInve);

        jMenuBar1.add(jMenuInventario);

        jMenuNEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Notasdeentrega (8).png"))); // NOI18N
        jMenuNEntrega.setText("Notas de entrega");
        jMenuNEntrega.setFont(new java.awt.Font("Bodoni MT", 2, 24)); // NOI18N
        jMenuNEntrega.setPreferredSize(new java.awt.Dimension(350, 50));

        jMenuItemVerEn.setFont(new java.awt.Font("Bodoni MT", 2, 14)); // NOI18N
        jMenuItemVerEn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/VerENtregas.png"))); // NOI18N
        jMenuItemVerEn.setText("Ver Notas de entrega");
        jMenuItemVerEn.setPreferredSize(new java.awt.Dimension(250, 50));
        jMenuItemVerEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVerEnActionPerformed(evt);
            }
        });
        jMenuNEntrega.add(jMenuItemVerEn);

        jMenuItemAgregarEn.setFont(new java.awt.Font("Bodoni MT", 2, 14)); // NOI18N
        jMenuItemAgregarEn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jMenuItemAgregarEn.setText("Agregar Nota de Entrega");
        jMenuItemAgregarEn.setPreferredSize(new java.awt.Dimension(250, 50));
        jMenuItemAgregarEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgregarEnActionPerformed(evt);
            }
        });
        jMenuNEntrega.add(jMenuItemAgregarEn);

        jMenuBar1.add(jMenuNEntrega);

        jMenuNVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/NotasDeVenta 3.jpg"))); // NOI18N
        jMenuNVenta.setText("Notas de venta");
        jMenuNVenta.setFont(new java.awt.Font("Bodoni MT", 2, 24)); // NOI18N
        jMenuNVenta.setPreferredSize(new java.awt.Dimension(250, 50));

        jMenuItemVerVe.setFont(new java.awt.Font("Bodoni MT", 2, 14)); // NOI18N
        jMenuItemVerVe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/VerVentas.png"))); // NOI18N
        jMenuItemVerVe.setText("Ver Notas de Venta");
        jMenuItemVerVe.setPreferredSize(new java.awt.Dimension(250, 50));
        jMenuItemVerVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVerVeActionPerformed(evt);
            }
        });
        jMenuNVenta.add(jMenuItemVerVe);

        jMenuItemAgregVe.setFont(new java.awt.Font("Bodoni MT", 2, 14)); // NOI18N
        jMenuItemAgregVe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add1.png"))); // NOI18N
        jMenuItemAgregVe.setText("Agregar Notas de Venta");
        jMenuItemAgregVe.setPreferredSize(new java.awt.Dimension(250, 50));
        jMenuItemAgregVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgregVeActionPerformed(evt);
            }
        });
        jMenuNVenta.add(jMenuItemAgregVe);

        jMenuBar1.add(jMenuNVenta);

        jMenuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ayuda3.png"))); // NOI18N
        jMenuAyuda.setText("Ayuda");
        jMenuAyuda.setFont(new java.awt.Font("Bodoni MT", 2, 24)); // NOI18N
        jMenuAyuda.setPreferredSize(new java.awt.Dimension(250, 50));

        jMenuItemComoAyuda.setFont(new java.awt.Font("Bodoni MT", 2, 14)); // NOI18N
        jMenuItemComoAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ayuda6.png"))); // NOI18N
        jMenuItemComoAyuda.setText("¿Cómo funciona la aplicacion?");
        jMenuItemComoAyuda.setPreferredSize(new java.awt.Dimension(250, 50));
        jMenuAyuda.add(jMenuItemComoAyuda);

        jMenuBar1.add(jMenuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemVerInvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVerInvenActionPerformed
        // TODO add your handling code here:
        InternalVerInventario ver= new InternalVerInventario();
        jDesktopPane_menu.add(ver);
        ver.setVisible(true);
    }//GEN-LAST:event_jMenuItemVerInvenActionPerformed

    private void jMenuItemAgregarEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgregarEnActionPerformed


    }//GEN-LAST:event_jMenuItemAgregarEnActionPerformed

    private void jMenuItemAgregarInveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgregarInveActionPerformed
        InternalAgregarLibros agregar = new InternalAgregarLibros();
        jDesktopPane_menu.add(agregar);
        agregar.setVisible(true);


    }//GEN-LAST:event_jMenuItemAgregarInveActionPerformed

    private void jMenuItemVerEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVerEnActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jMenuItemVerEnActionPerformed

    private void jMenuItemVerVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVerVeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuItemVerVeActionPerformed

    private void jMenuItemAgregVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgregVeActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jMenuItemAgregVeActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuInventario;
    private javax.swing.JMenuItem jMenuItemAgregVe;
    private javax.swing.JMenuItem jMenuItemAgregarEn;
    private javax.swing.JMenuItem jMenuItemAgregarInve;
    private javax.swing.JMenuItem jMenuItemComoAyuda;
    private javax.swing.JMenuItem jMenuItemVerEn;
    private javax.swing.JMenuItem jMenuItemVerInven;
    private javax.swing.JMenuItem jMenuItemVerVe;
    private javax.swing.JMenu jMenuNEntrega;
    private javax.swing.JMenu jMenuNVenta;
    // End of variables declaration//GEN-END:variables
}
