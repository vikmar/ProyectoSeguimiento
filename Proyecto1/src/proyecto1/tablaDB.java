/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author Vikmar
 */
public class tablaDB extends javax.swing.JFrame {

    int respuesta = 0; 
    /**
     * Creates new form tablaDB
     */
    public tablaDB() {
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

        btnSelecion = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        GbtnTabla = new javax.swing.JRadioButton();
        GbtnInsertar = new javax.swing.JRadioButton();
        GbtnModificar = new javax.swing.JRadioButton();
        GbtnEliminar = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnSiguiente.setText("SIGUIENTE ");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnSelecion.add(GbtnTabla);
        GbtnTabla.setText("VER TABLA");
        GbtnTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GbtnTablaActionPerformed(evt);
            }
        });

        btnSelecion.add(GbtnInsertar);
        GbtnInsertar.setText("INSERTAR");
        GbtnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GbtnInsertarActionPerformed(evt);
            }
        });

        btnSelecion.add(GbtnModificar);
        GbtnModificar.setText("MODIFICAR");
        GbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GbtnModificarActionPerformed(evt);
            }
        });

        btnSelecion.add(GbtnEliminar);
        GbtnEliminar.setText("ELIMINAR");
        GbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GbtnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(GbtnTabla)
                        .addGap(56, 56, 56)
                        .addComponent(GbtnInsertar)
                        .addGap(43, 43, 43)
                        .addComponent(GbtnModificar)
                        .addGap(53, 53, 53)
                        .addComponent(GbtnEliminar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GbtnTabla)
                    .addComponent(GbtnInsertar)
                    .addComponent(GbtnModificar)
                    .addComponent(GbtnEliminar))
                .addGap(90, 90, 90)
                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

         System.exit(0);


// TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void GbtnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GbtnInsertarActionPerformed
        respuesta = 2;
    }//GEN-LAST:event_GbtnInsertarActionPerformed

    private void GbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GbtnEliminarActionPerformed
        respuesta = 4;
    }//GEN-LAST:event_GbtnEliminarActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        
        if(respuesta == 1){
            vertabla selec = new vertabla();
            selec.setVisible(rootPaneCheckingEnabled);
            this.setVisible(false);
        }else if(respuesta == 2){
            insertar inser = new insertar();
            inser.setVisible(rootPaneCheckingEnabled);
            this.setVisible(false);
        }else if(respuesta == 3){
            modificar modi = new modificar();
            modi.setVisible(rootPaneCheckingEnabled);
            this.setVisible(false);
        }else if(respuesta == 4){
            eliminar elim = new eliminar();
            elim.setVisible(rootPaneCheckingEnabled);
            this.setVisible(false);           
        }else{
            
        }
          
            
        
        
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void GbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GbtnModificarActionPerformed
        respuesta = 3;
    }//GEN-LAST:event_GbtnModificarActionPerformed

    private void GbtnTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GbtnTablaActionPerformed
        respuesta = 1;
    }//GEN-LAST:event_GbtnTablaActionPerformed

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
            java.util.logging.Logger.getLogger(tablaDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablaDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablaDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablaDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablaDB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton GbtnEliminar;
    private javax.swing.JRadioButton GbtnInsertar;
    private javax.swing.JRadioButton GbtnModificar;
    private javax.swing.JRadioButton GbtnTabla;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup btnSelecion;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
