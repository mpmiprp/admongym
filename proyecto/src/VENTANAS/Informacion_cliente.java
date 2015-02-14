/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VENTANAS;

import BASE_DE_DATOS.ConexionMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;


/**
 *
 * @author Paula
 */
public class Informacion_cliente extends javax.swing.JDialog {
  

    /**
     * Creates new form Informacion_cliente
     */
    public Informacion_cliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
  
        initComponents();
     cargartabla();
        inhabilitar();
    }
    void cargartabla()
    {
        String[] titulos={"ID","Nombre","Telefono","Direccion","Email"};
        String[] registro = new String[5];
        DefaultTableModel modelo;
        modelo = new DefaultTableModel(null,titulos);
         ConexionMySQL mysql=new ConexionMySQL();
    Connection cn= mysql.Conectar();
    try{


       PreparedStatement pst = (PreparedStatement) cn.prepareStatement("SELECT idpersona, nombre, telefono, direccion, email FROM contactos" );
            ResultSet res = pst.executeQuery();
while(res.next())
{
registro[0]=res.getString( "idpersona");
registro[1]=res.getString( "nombre");
registro[2]=res.getString( "telefono");
registro[3]=res.getString( "direccion");
registro[4]=res.getString( "email");
modelo.addRow(registro);
    }
tbinfoclie.setModel(modelo);
    }
      catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    void habilitar()
    {
txtNombre.setEnabled(true);
txtTelefono.setEnabled(true);
txtEmail.setEnabled(true);
txtDireccion.setEnabled(true);
btnNuevo.setEnabled(false);
btnGuardar.setEnabled(true);
btnCancelar.setEnabled(true);
txtNombre.setText("");
txtTelefono.setText("");
txtEmail.setText("");
txtDireccion.setText("");
    }
    void inhabilitar()
    {
txtNombre.setEnabled(false);
txtTelefono.setEnabled(false);
txtEmail.setEnabled(false);
txtDireccion.setEnabled(false);
btnNuevo.setEnabled(true);
btnGuardar.setEnabled(false);
btnCancelar.setEnabled(false);
txtNombre.setText("");
txtTelefono.setText("");
txtEmail.setText("");
txtDireccion.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbinfoclie = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        textBUSCAR = new org.edisoncor.gui.textField.TextField();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel1.setColorPrimario(new java.awt.Color(50, 119, 255));
        panel1.setColorSecundario(new java.awt.Color(200, 216, 252));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES_REDISEÑO/CERRAR-NORM.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES_REDISEÑO/CERRAR-PRESS.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES_REDISEÑO/CERRAR-ROLL.png"))); // NOI18N
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BOTONES/MOSTRAR-NORM.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BOTONES/MOSTRAR-PRESS.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BOTONES/MOSTRAR-ROLL.png"))); // NOI18N
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tbinfoclie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbinfoclie);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BOTONES/ELIMINAR-NORM.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BOTONES/ELIMINAR-PRESS.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BOTONES/ELIMINAR-ROLL.png"))); // NOI18N
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES_REDISEÑO/BUSCAR-NORM.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES_REDISEÑO/BUSCAR-PRESS.png"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES_REDISEÑO/BUSCAR-ROLL.png"))); // NOI18N
        jButton4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton5.setText(" Modificar");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton2))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(411, 411, 411)
                        .addComponent(jButton3)
                        .addGap(146, 146, 146)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(443, 443, 443)
                        .addComponent(jButton5)))
                .addGap(0, 160, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jButton4)
                    .addComponent(textBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jButton2)
                .addGap(116, 116, 116)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cerrar();
       Clientes dialog = new Clientes(new javax.swing.JFrame(), true);
        dialog.setTitle("CLIENTES");
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);   
    }                                        
private void cerrar(){
   this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        mostrardatos("");   } 
    void mostrardatos(String valor){
    DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("ID");
    modelo.addColumn("NOMBRE(S)");
    modelo.addColumn("APELLIDO PATERNO");
    modelo.addColumn("APELLIDO MATERNO");
    modelo.addColumn("CALLE");
    modelo.addColumn("NUMERO");
    modelo.addColumn("COLONIA");
    modelo.addColumn("DELEGACION");
    modelo.addColumn("CP");
    modelo.addColumn("TELEFONO");
    modelo.addColumn("ID EXPEDIENTE");
    modelo.addColumn("EDAD");
    modelo.addColumn("SEXO");
    modelo.addColumn("No. SS");
    modelo.addColumn("INSTITUCION");
    modelo.addColumn("CONTACTO");
    modelo.addColumn("TELEFONO EMERG");
    tbinfoclie.setModel(modelo);
    
    String sql="";
    if(valor.equals(""))
    {
        sql="SELECT * FROM clientes inner join expediente_clientes on idClientes = idexpedienteclientes"; 
    }
    
    String []datos = new String [17];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                datos[8]=rs.getString(9);
                datos[9]=rs.getString(10);
                datos[10]=rs.getString(11);
                datos[11]=rs.getString(12);
                datos[12]=rs.getString(13);
                datos[13]=rs.getString(14);
                datos[14]=rs.getString(15);
                datos[15]=rs.getString(16);
                datos[16]=rs.getString(17);  
                modelo.addRow(datos);
            }
            tbinfoclie.setModel(modelo);
    }
          catch (SQLException ex) {
            Logger.getLogger(Informacion_cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Informacion_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informacion_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informacion_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informacion_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Informacion_cliente dialog = new Informacion_cliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane2;
    private org.edisoncor.gui.panel.Panel panel1;
    private javax.swing.JTable tbinfoclie;
    private org.edisoncor.gui.textField.TextField textBUSCAR;
    // End of variables declaration//GEN-END:variables
 
}

