
package com.rosmery.pe.presentacion;

import java.awt.BorderLayout;

public class JFramePrincipal extends javax.swing.JFrame {

    public JFramePrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        principal = new javax.swing.JPanel();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        btnmenucalculadora = new javax.swing.JMenuItem();
        btnmenucontador = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        btnmenutipodicumento = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPersonaDocumento = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("aplicacion Javaswin");

        principal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1199, Short.MAX_VALUE)
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenuBar3.setBackground(new java.awt.Color(153, 153, 153));

        jMenu5.setText("APLICACIONES");

        btnmenucalculadora.setText("calculadora");
        btnmenucalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenucalculadoraActionPerformed(evt);
            }
        });
        jMenu5.add(btnmenucalculadora);

        btnmenucontador.setText("contador");
        btnmenucontador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenucontadorActionPerformed(evt);
            }
        });
        jMenu5.add(btnmenucontador);

        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu1.setText("MANTENIMIENTO");

        btnmenutipodicumento.setText("Tipo Documento");
        btnmenutipodicumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenutipodicumentoActionPerformed(evt);
            }
        });
        jMenu1.add(btnmenutipodicumento);

        jMenuItem2.setText("Genero");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Persona");
        jMenu1.add(jMenuItem3);

        jPersonaDocumento.setText("Persona Documento");
        jPersonaDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPersonaDocumentoActionPerformed(evt);
            }
        });
        jMenu1.add(jPersonaDocumento);

        jMenuBar3.add(jMenu1);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmenucalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenucalculadoraActionPerformed
        //este codigo sirve para llamar un panel
        Calculadora cal = new Calculadora();
        cal.setSize(400, 677);
        cal.setLocation(0,0);
        principal.removeAll();
        principal.add(cal, BorderLayout.CENTER);
        principal.revalidate();
        principal.repaint();
    }//GEN-LAST:event_btnmenucalculadoraActionPerformed

    private void btnmenucontadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenucontadorActionPerformed
        Contador con = new Contador();
        con.setSize(400, 600);
        con.setLocation(0,0);
        principal.removeAll();
        principal.add(con, BorderLayout.CENTER);
        principal.revalidate();
        principal.repaint();
    }//GEN-LAST:event_btnmenucontadorActionPerformed

    private void btnmenutipodicumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenutipodicumentoActionPerformed
        JPTipoDocumento tp = new JPTipoDocumento();
        tp.setSize(1100, 600);
        tp.setLocation(0,0);
        principal.removeAll();
        principal.add(tp, BorderLayout.CENTER);
        principal.revalidate();
        principal.repaint();
    }//GEN-LAST:event_btnmenutipodicumentoActionPerformed

    private void jPersonaDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPersonaDocumentoActionPerformed
         JPPersonaDocumento tp = new JPPersonaDocumento();
        tp.setSize(1100, 600);
        tp.setLocation(0,0);
        principal.removeAll();
        principal.add(tp, BorderLayout.CENTER);
        principal.revalidate();
        principal.repaint();
    }//GEN-LAST:event_jPersonaDocumentoActionPerformed

//    int seleccion = tablaTipoDocumento.rowAtPoint(evt.getPoint());
//    idTipoDocumento = tablaTipoDocumento.getValueAT(seleccion, 0)+"";
//    txtNombre.setText(tablaTipoDocumento.getValueAT(seleccion, 1)+"");
 //   System.out.println(idTipoDocumento);
    
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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnmenucalculadora;
    private javax.swing.JMenuItem btnmenucontador;
    private javax.swing.JMenuItem btnmenutipodicumento;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem jPersonaDocumento;
    private javax.swing.JPanel principal;
    // End of variables declaration//GEN-END:variables
}
