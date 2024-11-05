/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import Classes.Formulas;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * Ya jala jejejej
 */
public class tema4 extends javax.swing.JPanel {
private DefaultTableModel tableModel;

    //Metodo Main temporal para hacer pruebas 
    public static void main(String[] args) {
        
        
        
        JFrame frame = new JFrame("Prueba de Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(925, 730);
        tema4 panel = new tema4(); //cambiar "tema4" por nombre del panel   
        frame.add(panel);   
        frame.setVisible(true); 
    }
    
    
    public tema4() {
        initComponents();
        tableModel = new DefaultTableModel(new String[]{"Intervalo", "Frecuencia", "Marca de Clase"}, 0);
        tbDatos.setModel(tableModel);   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        txtLimiteSuperior = new javax.swing.JTextField();
        txtLimiteInferior = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFrecuencia = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMediaAritmetica = new javax.swing.JTextField();
        txtVarianza = new javax.swing.JTextField();
        txtDesviacionEstandar = new javax.swing.JTextField();
        txtCoeficienteVariacion = new javax.swing.JTextField();
        txtPrecision = new javax.swing.JTextField();
        btnObtenerMuestra = new javax.swing.JButton();
        btnObtenerPoblacion = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(925, 730));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(925, 735));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Tema 4 (Datos Agrupados)");

        btnNuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        tbDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbDatos);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Limite Inferior:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Limite Superior:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Frecuencia:");

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Media Aritmetica:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Varianza:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Desviacion Estandar:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Coeficiente de Variacion:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Nivel de Precision:");

        btnObtenerMuestra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnObtenerMuestra.setText("Muestra");
        btnObtenerMuestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerMuestraActionPerformed(evt);
            }
        });

        btnObtenerPoblacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnObtenerPoblacion.setText("Poblacion");
        btnObtenerPoblacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerPoblacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLimiteSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLimiteInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addGap(22, 22, 22)
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPrecision, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCoeficienteVariacion, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMediaAritmetica, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDesviacionEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtVarianza, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnObtenerPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel1)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnObtenerMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtLimiteInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLimiteSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(txtMediaAritmetica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtVarianza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDesviacionEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtCoeficienteVariacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtPrecision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnObtenerMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnObtenerPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(213, Short.MAX_VALUE))
        );

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        tableModel.setRowCount(0);
        txtLimiteInferior.setText("");
        txtLimiteSuperior.setText("");
        txtFrecuencia.setText("");
        
    // Habilitar los campos de límite
    txtLimiteInferior.setEnabled(true);
    txtLimiteSuperior.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        try {
        // Verificar que los campos no estén vacíos
        if (txtLimiteInferior.getText().isEmpty() || txtLimiteSuperior.getText().isEmpty() || txtFrecuencia.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Detener el método si falta algún campo
        }

        // Convertir los valores ingresados
        double limiteInferior = Double.parseDouble(txtLimiteInferior.getText());
        double limiteSuperior = Double.parseDouble(txtLimiteSuperior.getText());
        int frecuencia = Integer.parseInt(txtFrecuencia.getText());
        double marcaClase = (limiteInferior + limiteSuperior) / 2;
        // Agregar los datos a la tabla
        tableModel.addRow(new Object[]{ limiteInferior + " - "+ limiteSuperior, frecuencia, marcaClase});
        
        // Limpiar el campo de frecuencia
        txtFrecuencia.setText("");

        // Calcular y mostrar los nuevos límites
        double proximoIntervalo = limiteSuperior - limiteInferior; // Amplitud
        double nuevoLimiteInferior = limiteSuperior + 1;
        double nuevoLimiteSuperior = limiteSuperior + proximoIntervalo + 1;
        txtLimiteInferior.setText("" + nuevoLimiteInferior);
        txtLimiteSuperior.setText("" + nuevoLimiteSuperior);
        
        // Deshabilitar los campos de límite
        txtLimiteInferior.setEnabled(false);
        txtLimiteSuperior.setEnabled(false);
        
                // Centrar los datos de la tabla
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < tbDatos.getColumnCount(); i++) {
         tbDatos.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

    } catch (NumberFormatException ex) {
        // Mostrar un mensaje de error si la conversión falla
        JOptionPane.showMessageDialog(this, "Por favor, ingresa valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        txtLimiteInferior.setText("");
        txtLimiteSuperior.setText("");
        txtFrecuencia.setText("");
     }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnObtenerMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerMuestraActionPerformed
        Formulas formula = new Formulas();
        double media = Double.parseDouble(formula.MediaAritmetica(tbDatos));
        txtMediaAritmetica.setText(formula.MediaAritmetica(tbDatos));
        
        double varianza = formula.varianzaMuestra(tbDatos, media);
        String varianzaStr = String.format("%.3f", varianza);
        txtVarianza.setText(varianzaStr);
        
       String desviacionEstandarMuestraStr = String.format("%.3f", Math.sqrt(varianza));
       double desviacionEstandar = Double.parseDouble(desviacionEstandarMuestraStr);
       txtDesviacionEstandar.setText(desviacionEstandarMuestraStr );
       
       double coeficienteVariacion = formula.CoeficienteVariacion(desviacionEstandar, media);
       String coeficiente = String.format("%.3f", coeficienteVariacion);
       txtCoeficienteVariacion.setText(coeficiente+ "%");
       
       if (coeficienteVariacion <= 7){
           txtPrecision.setText("Preciso");
       }
       if (coeficienteVariacion >7 && coeficienteVariacion <14){
           txtPrecision.setText("Aceptable");
       }
       if (coeficienteVariacion >=14 && coeficienteVariacion <=20){
           txtPrecision.setText("Regular");
       }
       if (coeficienteVariacion >20){
           txtPrecision.setText("Poco Precisa");
       }
    }//GEN-LAST:event_btnObtenerMuestraActionPerformed

    private void btnObtenerPoblacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerPoblacionActionPerformed
        Formulas formula = new Formulas();
        double media = Double.parseDouble(formula.MediaAritmetica(tbDatos));
        txtMediaAritmetica.setText(formula.MediaAritmetica(tbDatos));
        
        double varianza = formula.varianzaPoblacion(tbDatos, media);
        String varianzaStr = String.format("%.3f", varianza);
        txtVarianza.setText(varianzaStr);
        
       String desviacionEstandarPoblacionStr = String.format("%.3f", Math.sqrt(varianza));
       double desviacionEstandar = Double.parseDouble(desviacionEstandarPoblacionStr);
       txtDesviacionEstandar.setText(desviacionEstandarPoblacionStr );
       
       double coeficienteVariacion = formula.CoeficienteVariacion(desviacionEstandar, media);
       String coeficiente = String.format("%.3f", coeficienteVariacion);
       txtCoeficienteVariacion.setText( coeficiente + "%");
       
       if (coeficienteVariacion <= 7){
           txtPrecision.setText("Preciso");
       }
       if (coeficienteVariacion >7 && coeficienteVariacion <14){
           txtPrecision.setText("Aceptable");
       }
       if (coeficienteVariacion >=14 && coeficienteVariacion <=20){
           txtPrecision.setText("Regular");
       }
       if (coeficienteVariacion >20){
           txtPrecision.setText("Poco Precisa");
       }
        
        
        
    }//GEN-LAST:event_btnObtenerPoblacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnObtenerMuestra;
    private javax.swing.JButton btnObtenerPoblacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField txtCoeficienteVariacion;
    private javax.swing.JTextField txtDesviacionEstandar;
    private javax.swing.JTextField txtFrecuencia;
    private javax.swing.JTextField txtLimiteInferior;
    private javax.swing.JTextField txtLimiteSuperior;
    private javax.swing.JTextField txtMediaAritmetica;
    private javax.swing.JTextField txtPrecision;
    private javax.swing.JTextField txtVarianza;
    // End of variables declaration//GEN-END:variables

   

}
