/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.rosmery.pe.presentacion;

import java.awt.BorderLayout;
/**
 *
 * @author Alumno-PB203
 */
public class Calculadora extends javax.swing.JPanel {

    
    public Calculadora() {
        initComponents();
        this.jTextFieldresultado.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldresultado = new javax.swing.JTextField();
        btnmultiplicacion = new javax.swing.JButton();
        btnporcentaje = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnCC = new javax.swing.JButton();
        btndivicion = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnarroba = new javax.swing.JButton();
        btnigual = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnmenos = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnmas = new javax.swing.JButton();
        btnpunto = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel1.setText("CALCULADORA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 350, 80));

        jTextFieldresultado.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jTextFieldresultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldresultado.setText("0");
        jTextFieldresultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldresultadoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 360, 90));

        btnmultiplicacion.setBackground(new java.awt.Color(255, 255, 204));
        btnmultiplicacion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnmultiplicacion.setText("*");
        btnmultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnmultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 80, 60));

        btnporcentaje.setBackground(new java.awt.Color(255, 204, 255));
        btnporcentaje.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnporcentaje.setText("%");
        jPanel1.add(btnporcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 80, 60));

        btnCE.setBackground(new java.awt.Color(255, 204, 255));
        btnCE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCE.setText("CE");
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });
        jPanel1.add(btnCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 80, 60));

        btnCC.setBackground(new java.awt.Color(255, 204, 255));
        btnCC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCC.setText("CC");
        btnCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCCActionPerformed(evt);
            }
        });
        jPanel1.add(btnCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 80, 60));

        btndivicion.setBackground(new java.awt.Color(255, 255, 204));
        btndivicion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btndivicion.setText("/");
        btndivicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivicionActionPerformed(evt);
            }
        });
        jPanel1.add(btndivicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 80, 60));

        btn7.setBackground(new java.awt.Color(204, 204, 204));
        btn7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 80, 60));

        btn4.setBackground(new java.awt.Color(231, 230, 230));
        btn4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 80, 60));

        btn1.setBackground(new java.awt.Color(204, 204, 204));
        btn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 80, 60));

        btnarroba.setBackground(new java.awt.Color(204, 255, 255));
        btnarroba.setText("@");
        btnarroba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnarrobaActionPerformed(evt);
            }
        });
        jPanel1.add(btnarroba, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 80, 60));

        btnigual.setBackground(new java.awt.Color(255, 153, 153));
        btnigual.setText("=");
        btnigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnigualActionPerformed(evt);
            }
        });
        jPanel1.add(btnigual, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, 80, 60));

        btn9.setBackground(new java.awt.Color(204, 204, 204));
        btn9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 80, 60));

        btn8.setBackground(new java.awt.Color(228, 226, 226));
        btn8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 80, 60));

        btn5.setBackground(new java.awt.Color(204, 204, 204));
        btn5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 80, 60));

        btn2.setBackground(new java.awt.Color(232, 231, 231));
        btn2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 80, 60));

        btn0.setBackground(new java.awt.Color(204, 204, 204));
        btn0.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, 80, 60));

        btn6.setBackground(new java.awt.Color(231, 228, 228));
        btn6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 80, 60));

        btnmenos.setBackground(new java.awt.Color(255, 255, 204));
        btnmenos.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnmenos.setText("-");
        btnmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenosActionPerformed(evt);
            }
        });
        jPanel1.add(btnmenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 80, 60));

        btn3.setBackground(new java.awt.Color(204, 204, 204));
        btn3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 80, 60));

        btnmas.setBackground(new java.awt.Color(255, 255, 204));
        btnmas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnmas.setText("+");
        btnmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmasActionPerformed(evt);
            }
        });
        jPanel1.add(btnmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 80, 60));

        btnpunto.setBackground(new java.awt.Color(204, 255, 255));
        btnpunto.setText(".");
        btnpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpuntoActionPerformed(evt);
            }
        });
        jPanel1.add(btnpunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, 80, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void operacion(String sentencia){
        if (sentencia.contains("+")){
            this.numeroOperado(sentencia, "\\+","+");
        }else if (sentencia.contains("-")){
            this.numeroOperado(sentencia, "\\-","-");
        }else if (sentencia.contains("*")){
            this.numeroOperado(sentencia, "\\*","*");
        }else if (sentencia.contains("/")){
            this.numeroOperado(sentencia, "\\/","/");
        }
    }
    
    public void numeroOperado(String Sentencia, String Simbolo, String valida){
        String[] cortar = Sentencia.split("");
        String[] numero;
        float primerNumero = 0;
        float segundoNumero = 0;
        if(cortar[0].contains(valida)){
            numero = Sentencia.substring(1,Sentencia.length()).split(Simbolo);
            primerNumero = Float.parseFloat(numero[0])-Float.parseFloat(numero[0])*2;
            segundoNumero = 0;
        }else{
           numero = Sentencia.split(Simbolo);
           primerNumero = Float.parseFloat(numero[0]);
        }
        float resultado = 0;
      if (Simbolo.equals("\\+")){
          resultado = primerNumero + segundoNumero;
      }else if(Simbolo.equals("\\-")){
          resultado = primerNumero - segundoNumero;
      }else if(Simbolo.equals("\\*")){
          resultado = primerNumero * segundoNumero;
      }else if(Simbolo.equals("\\/")){
          resultado = primerNumero / segundoNumero;
      }
      this.jTextFieldresultado.setText(String.valueOf(resultado));
    }
         
    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        String currentText = this.jTextFieldresultado.getText();
    this.jTextFieldresultado.setText(currentText + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btnarrobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnarrobaActionPerformed
        String currentText = this.jTextFieldresultado.getText();
    this.jTextFieldresultado.setText(currentText + "@");
    }//GEN-LAST:event_btnarrobaActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        String currentText = this.jTextFieldresultado.getText();
    this.jTextFieldresultado.setText(currentText + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        String currentText = this.jTextFieldresultado.getText();
    this.jTextFieldresultado.setText(currentText + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
           String currentText = this.jTextFieldresultado.getText();
    this.jTextFieldresultado.setText(currentText + "1");  
    }//GEN-LAST:event_btn1ActionPerformed
 
    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        String currentText = this.jTextFieldresultado.getText();
    this.jTextFieldresultado.setText(currentText + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String currentText = this.jTextFieldresultado.getText();
    this.jTextFieldresultado.setText(currentText + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        String currentText = this.jTextFieldresultado.getText();
    this.jTextFieldresultado.setText(currentText + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        String currentText = this.jTextFieldresultado.getText();
    this.jTextFieldresultado.setText(currentText + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        String currentText = this.jTextFieldresultado.getText();
    this.jTextFieldresultado.setText(currentText + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        String currentText = this.jTextFieldresultado.getText();
    this.jTextFieldresultado.setText(currentText + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpuntoActionPerformed
       String currentText = this.jTextFieldresultado.getText();
    this.jTextFieldresultado.setText(currentText + ".");
    }//GEN-LAST:event_btnpuntoActionPerformed

    private void btnigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnigualActionPerformed
        this.operacion(this.jTextFieldresultado.getText());
    }//GEN-LAST:event_btnigualActionPerformed

    private void btnmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmasActionPerformed
        this.operacion(this.jTextFieldresultado.getText());
    this.jTextFieldresultado.setText(this.jTextFieldresultado.getText() + "+");
    }//GEN-LAST:event_btnmasActionPerformed

    private void btnmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenosActionPerformed
        this.operacion(this.jTextFieldresultado.getText());
    this.jTextFieldresultado.setText(this.jTextFieldresultado.getText() + "-");
    }//GEN-LAST:event_btnmenosActionPerformed

    private void btnmultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicacionActionPerformed
        this.operacion(this.jTextFieldresultado.getText());
    this.jTextFieldresultado.setText(this.jTextFieldresultado.getText() + "*");
    }//GEN-LAST:event_btnmultiplicacionActionPerformed

    private void btndivicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivicionActionPerformed
        this.operacion(this.jTextFieldresultado.getText());
    this.jTextFieldresultado.setText(this.jTextFieldresultado.getText() + "/");
    }//GEN-LAST:event_btndivicionActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        int tamanio = this.jTextFieldresultado.getText().length();
        this.jTextFieldresultado.setText(this.jTextFieldresultado.getText().substring(0,tamanio-1));
    }//GEN-LAST:event_btnCEActionPerformed

    private void btnCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCCActionPerformed
        this.jTextFieldresultado.setText("");
    }//GEN-LAST:event_btnCCActionPerformed

    private void jTextFieldresultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldresultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldresultadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnCC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnarroba;
    private javax.swing.JButton btndivicion;
    private javax.swing.JButton btnigual;
    private javax.swing.JButton btnmas;
    private javax.swing.JButton btnmenos;
    private javax.swing.JButton btnmultiplicacion;
    private javax.swing.JButton btnporcentaje;
    private javax.swing.JButton btnpunto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldresultado;
    // End of variables declaration//GEN-END:variables
}
