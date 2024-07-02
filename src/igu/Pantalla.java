/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;
import java.awt.*;
import javax.swing.ImageIcon;
/**
 *
 * @author user
 */
public class Pantalla extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        initComponents();
        Image icono = Toolkit.getDefaultToolkit().getImage("src/iconoCalculadora.png");
        this.setIconImage(icono);
        setIconImage(new ImageIcon(getClass().getResource("/iconoCalculadora.png")).getImage());
    }
    
    String operacion="";
    int numA=0, numB=0;
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pantallaVisualizadora = new javax.swing.JTextField();
        buttonBorrar = new javax.swing.JButton();
        buttonDivision = new javax.swing.JButton();
        buttonMultiplicar = new javax.swing.JButton();
        buttonRestar = new javax.swing.JButton();
        buttonSumar = new javax.swing.JButton();
        buttonIgual = new javax.swing.JButton();
        num1 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        potencia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setToolTipText("");

        pantallaVisualizadora.setBackground(new java.awt.Color(0, 0, 0));
        pantallaVisualizadora.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        pantallaVisualizadora.setForeground(new java.awt.Color(255, 255, 255));
        pantallaVisualizadora.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pantallaVisualizadora.setText("0");
        pantallaVisualizadora.setBorder(null);
        pantallaVisualizadora.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        buttonBorrar.setBackground(new java.awt.Color(204, 204, 204));
        buttonBorrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonBorrar.setForeground(new java.awt.Color(0, 0, 0));
        buttonBorrar.setText("C");
        buttonBorrar.setBorder(null);
        buttonBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBorrar.setFocusable(false);
        buttonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBorrarActionPerformed(evt);
            }
        });

        buttonDivision.setBackground(new java.awt.Color(255, 153, 51));
        buttonDivision.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonDivision.setForeground(new java.awt.Color(255, 255, 255));
        buttonDivision.setText("/");
        buttonDivision.setBorder(null);
        buttonDivision.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDivision.setFocusable(false);
        buttonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDivisionActionPerformed(evt);
            }
        });

        buttonMultiplicar.setBackground(new java.awt.Color(255, 153, 51));
        buttonMultiplicar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonMultiplicar.setForeground(new java.awt.Color(255, 255, 255));
        buttonMultiplicar.setText("x");
        buttonMultiplicar.setBorder(null);
        buttonMultiplicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMultiplicar.setFocusable(false);
        buttonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMultiplicarActionPerformed(evt);
            }
        });

        buttonRestar.setBackground(new java.awt.Color(255, 153, 51));
        buttonRestar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonRestar.setForeground(new java.awt.Color(255, 255, 255));
        buttonRestar.setText("-");
        buttonRestar.setBorder(null);
        buttonRestar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRestar.setFocusable(false);
        buttonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRestarActionPerformed(evt);
            }
        });

        buttonSumar.setBackground(new java.awt.Color(255, 153, 51));
        buttonSumar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonSumar.setForeground(new java.awt.Color(255, 255, 255));
        buttonSumar.setText("+");
        buttonSumar.setBorder(null);
        buttonSumar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSumar.setFocusable(false);
        buttonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSumarActionPerformed(evt);
            }
        });

        buttonIgual.setBackground(new java.awt.Color(255, 153, 51));
        buttonIgual.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonIgual.setForeground(new java.awt.Color(255, 255, 255));
        buttonIgual.setText("=");
        buttonIgual.setBorder(null);
        buttonIgual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonIgual.setFocusable(false);
        buttonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIgualActionPerformed(evt);
            }
        });

        num1.setBackground(new java.awt.Color(51, 51, 51));
        num1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        num1.setForeground(new java.awt.Color(255, 255, 255));
        num1.setText("1");
        num1.setBorder(null);
        num1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num1.setFocusable(false);
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        num2.setBackground(new java.awt.Color(51, 51, 51));
        num2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        num2.setForeground(new java.awt.Color(255, 255, 255));
        num2.setText("2");
        num2.setBorder(null);
        num2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num2.setFocusable(false);
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        num3.setBackground(new java.awt.Color(51, 51, 51));
        num3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        num3.setForeground(new java.awt.Color(255, 255, 255));
        num3.setText("3");
        num3.setBorder(null);
        num3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num3.setFocusable(false);
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });

        num4.setBackground(new java.awt.Color(51, 51, 51));
        num4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        num4.setForeground(new java.awt.Color(255, 255, 255));
        num4.setText("4");
        num4.setBorder(null);
        num4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num4.setFocusable(false);
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });

        num5.setBackground(new java.awt.Color(51, 51, 51));
        num5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        num5.setForeground(new java.awt.Color(255, 255, 255));
        num5.setText("5");
        num5.setBorder(null);
        num5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num5.setFocusable(false);
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });

        num6.setBackground(new java.awt.Color(51, 51, 51));
        num6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        num6.setForeground(new java.awt.Color(255, 255, 255));
        num6.setText("6");
        num6.setBorder(null);
        num6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num6.setFocusable(false);
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });

        num7.setBackground(new java.awt.Color(51, 51, 51));
        num7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        num7.setForeground(new java.awt.Color(255, 255, 255));
        num7.setText("7");
        num7.setBorder(null);
        num7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num7.setFocusable(false);
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });

        num8.setBackground(new java.awt.Color(51, 51, 51));
        num8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        num8.setForeground(new java.awt.Color(255, 255, 255));
        num8.setText("8");
        num8.setBorder(null);
        num8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num8.setFocusable(false);
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });

        num9.setBackground(new java.awt.Color(51, 51, 51));
        num9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        num9.setForeground(new java.awt.Color(255, 255, 255));
        num9.setText("9");
        num9.setBorder(null);
        num9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num9.setFocusable(false);
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });

        num0.setBackground(new java.awt.Color(51, 51, 51));
        num0.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        num0.setForeground(new java.awt.Color(255, 255, 255));
        num0.setText("0");
        num0.setBorder(null);
        num0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num0.setFocusable(false);
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });

        potencia.setBackground(new java.awt.Color(255, 153, 51));
        potencia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        potencia.setForeground(new java.awt.Color(255, 255, 255));
        potencia.setText("^");
        potencia.setBorder(null);
        potencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        potencia.setFocusable(false);
        potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pantallaVisualizadora)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(buttonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, 0)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pantallaVisualizadora, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(160, 160, 160))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBorrarActionPerformed
        // TODO add your handling code here:
        pantallaVisualizadora.setText("0");
    }//GEN-LAST:event_buttonBorrarActionPerformed

    private void buttonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDivisionActionPerformed
        // TODO add your handling code here:
        
        if(pantallaVisualizadora.getText().equals("0")){
            pantallaVisualizadora.setText("no dividir 0");
        }
        
        try{
        numA = Integer.parseInt(pantallaVisualizadora.getText());
        operacion = "dividir";
        pantallaVisualizadora.setText("0");
        }
        catch(NumberFormatException e){
        pantallaVisualizadora.setText("error");
        }
    }//GEN-LAST:event_buttonDivisionActionPerformed

    private void buttonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMultiplicarActionPerformed
        // TODO add your handling code here:
        try{
        numA = Integer.parseInt(pantallaVisualizadora.getText());
        operacion = "multiplicar";
        pantallaVisualizadora.setText("0");
        }
        catch(NumberFormatException e){
        pantallaVisualizadora.setText("error");
        }
    }//GEN-LAST:event_buttonMultiplicarActionPerformed

    private void buttonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIgualActionPerformed
        // TODO add your handling code here:
        
        try{
        numB = Integer.parseInt(pantallaVisualizadora.getText());
        }
        catch(NumberFormatException e){
        pantallaVisualizadora.setText("error");
        }
        
        if(operacion.equals("dividir")){
            if(numB == 0){
                pantallaVisualizadora.setText("error");
            }
            try{
                pantallaVisualizadora.setText(String.valueOf(numA/numB));
            }
            catch(ArithmeticException e){
                pantallaVisualizadora.setText("error");
            }
        }
        if(operacion.equals("multiplicar")){
            pantallaVisualizadora.setText(String.valueOf(numA*numB));
        }
        if(operacion.equals("sumar")){
            pantallaVisualizadora.setText(String.valueOf(numA+numB));
        }
        if(operacion.equals("restar")){
            pantallaVisualizadora.setText(String.valueOf(numA-numB));
        }
        if(operacion.equals("potencia")){
            double potencia = Math.pow(numA, numB);
            int resultado = (int) potencia;
            pantallaVisualizadora.setText(String.valueOf(resultado));
        
        }
    }//GEN-LAST:event_buttonIgualActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        // TODO add your handling code here:
        if(pantallaVisualizadora.getText().equals("0")){
            pantallaVisualizadora.setText("");
            pantallaVisualizadora.setText("1");
        }else{pantallaVisualizadora.setText(pantallaVisualizadora.getText()+"1");}
    }//GEN-LAST:event_num1ActionPerformed

    
    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        // TODO add your handling code here:
        if(pantallaVisualizadora.getText().equals("0")){
            pantallaVisualizadora.setText("");
            pantallaVisualizadora.setText("2");
        }else{pantallaVisualizadora.setText(pantallaVisualizadora.getText()+"2");}
    }//GEN-LAST:event_num2ActionPerformed

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed
        // TODO add your handling code here:
        if(pantallaVisualizadora.getText().equals("0")){
            pantallaVisualizadora.setText("");
            pantallaVisualizadora.setText("9");
        }else{pantallaVisualizadora.setText(pantallaVisualizadora.getText()+"9");}
    }//GEN-LAST:event_num9ActionPerformed

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed
        // TODO add your handling code here:
        if(pantallaVisualizadora.getText().equals("0")){
            pantallaVisualizadora.setText("");
            pantallaVisualizadora.setText("5");
        }else{pantallaVisualizadora.setText(pantallaVisualizadora.getText()+"5");}
    }//GEN-LAST:event_num5ActionPerformed

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
        // TODO add your handling code here:
        if(pantallaVisualizadora.getText().equals("0")){
            pantallaVisualizadora.setText("");
            pantallaVisualizadora.setText("3");
        }else{pantallaVisualizadora.setText(pantallaVisualizadora.getText()+"3");}
    }//GEN-LAST:event_num3ActionPerformed

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
        // TODO add your handling code here:
        if(pantallaVisualizadora.getText().equals("0")){
            pantallaVisualizadora.setText("");
            pantallaVisualizadora.setText("4");
        }else{pantallaVisualizadora.setText(pantallaVisualizadora.getText()+"4");}
    }//GEN-LAST:event_num4ActionPerformed

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
        // TODO add your handling code here:
        if(pantallaVisualizadora.getText().equals("0")){
            pantallaVisualizadora.setText("");
            pantallaVisualizadora.setText("6");
        }else{pantallaVisualizadora.setText(pantallaVisualizadora.getText()+"6");}
    }//GEN-LAST:event_num6ActionPerformed

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
        // TODO add your handling code here:
        if(pantallaVisualizadora.getText().equals("0")){
            pantallaVisualizadora.setText("");
            pantallaVisualizadora.setText("7");
        }else{pantallaVisualizadora.setText(pantallaVisualizadora.getText()+"7");}
    }//GEN-LAST:event_num7ActionPerformed

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed
        // TODO add your handling code here:
        if(pantallaVisualizadora.getText().equals("0")){
            pantallaVisualizadora.setText("");
            pantallaVisualizadora.setText("8");
        }else{pantallaVisualizadora.setText(pantallaVisualizadora.getText()+"8");}
    }//GEN-LAST:event_num8ActionPerformed

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed
        // TODO add your handling code here:
        if(pantallaVisualizadora.getText().equals("0")){
            pantallaVisualizadora.setText("");
            pantallaVisualizadora.setText("0");
        }else{pantallaVisualizadora.setText(pantallaVisualizadora.getText()+"0");}
    }//GEN-LAST:event_num0ActionPerformed

    private void buttonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSumarActionPerformed
        // TODO add your handling code here:
        try{
        numA = Integer.parseInt(pantallaVisualizadora.getText());
        operacion = "sumar";
        pantallaVisualizadora.setText("0");
        }
        catch(NumberFormatException e){
        pantallaVisualizadora.setText("error");
        }
    }//GEN-LAST:event_buttonSumarActionPerformed

    private void buttonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRestarActionPerformed
        // TODO add your handling code here:
        try{
        numA = Integer.parseInt(pantallaVisualizadora.getText());
        operacion = "restar";
        pantallaVisualizadora.setText("0");
        }
        catch(NumberFormatException e){
        pantallaVisualizadora.setText("error");
        }
    }//GEN-LAST:event_buttonRestarActionPerformed

    private void potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potenciaActionPerformed
        // TODO add your handling code here:
        try{
        numA = Integer.parseInt(pantallaVisualizadora.getText());
        operacion = "potencia";
        pantallaVisualizadora.setText("0");
        }
        catch(NumberFormatException e){
        pantallaVisualizadora.setText("error");
        }
    }//GEN-LAST:event_potenciaActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBorrar;
    private javax.swing.JButton buttonDivision;
    private javax.swing.JButton buttonIgual;
    private javax.swing.JButton buttonMultiplicar;
    private javax.swing.JButton buttonRestar;
    private javax.swing.JButton buttonSumar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JTextField pantallaVisualizadora;
    private javax.swing.JButton potencia;
    // End of variables declaration//GEN-END:variables
}
