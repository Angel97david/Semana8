/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.SimpleDateFormat;
import java.util.Date;
import model.Registrar;

/**
 *
 * @author DELL
 */
public class Registro extends javax.swing.JFrame {
 String tipoVehiculo ="";
  String tipoServicio ="";
  String funcionario ="";
  String fecha="";

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        jTextFecha.setText(fechaActual());
        
       
    }
   public static String fechaActual(){
       Date fecha=new Date();
       SimpleDateFormat formatoFecha= new  SimpleDateFormat("dd/MM/YYYY");
      return formatoFecha.format(fecha);
   }
   public void datosRegistro(){
       tipoVehiculo = jComboVehiculo.getSelectedItem().toString();
       tipoServicio = jComboTipoSer.getSelectedItem().toString();
       funcionario=jComFuncioanrio.getSelectedItem().toString();
       fecha=jTextFecha.getText();
        
   }
     public void llenar(){
     Registrar re =new Registrar(tipoServicio, funcionario, fecha);
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
        jComboVehiculo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboTipoSer = new javax.swing.JComboBox<>();
        jTextFecha = new javax.swing.JTextField();
        jButtRegistrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComFuncioanrio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tipo de vehiculo ");

        jComboVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automóvil ", "Camioneta" }));

        jLabel2.setText("Tipo de Servicio");

        jLabel3.setText("Fecha");

        jComboTipoSer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lavado Básico", "Lavado especial", "Desinfección básica", "Desinfección avanzada", "Combos" }));

        jButtRegistrar.setText("Registrar");
        jButtRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtRegistrarActionPerformed(evt);
            }
        });

        jLabel4.setText("Funcionario");

        jComFuncioanrio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Funcionario 1", "Funcionario 2", "Funcionario 3", "Funcionario 4", "Funcionario 5", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jComboVehiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboTipoSer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFecha)
                    .addComponent(jComFuncioanrio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtRegistrar)
                .addGap(151, 151, 151))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboTipoSer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComFuncioanrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButtRegistrar)
                .addGap(38, 38, 38))
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

    private void jButtRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtRegistrarActionPerformed
        // TODO add your handling code here:  
        
       datosRegistro();
        llenar();
    }//GEN-LAST:event_jButtRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtRegistrar;
    public javax.swing.JComboBox<String> jComFuncioanrio;
    public javax.swing.JComboBox<String> jComboTipoSer;
    public javax.swing.JComboBox<String> jComboVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextFecha;
    // End of variables declaration//GEN-END:variables
}
