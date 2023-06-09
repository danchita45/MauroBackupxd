/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projectosuc;

import EDD.ArchivoSuc;
import EDD.IngresoEgreso;
import EDD.ListaDoblementeLigada;
import EDD.NodoLista;
import EDD.Sucursales;
import java.util.LinkedList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Danchita45
 */
public class RegistrarIE extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarIE
     */
    public RegistrarIE() {
        initComponents();
        llenarCombox();
    }

    public boolean verificarCampos() {
        if (Montotxt.getText() != "" && Descuentotxt.getText() != "" && fechatxt.getText() != "") {
            return true;
        } else {
            return false;
        }
    }

    public void llenarCombox() {
        ComboSucursal.removeAllItems();
        ComboIE.removeAllItems();
        ArchivoSuc archivo = new ArchivoSuc("sucursales.txt");
        ListaDoblementeLigada sucs = new ListaDoblementeLigada();
        LinkedList<String> lineas = archivo.obtenerTexto();

        ComboIE.addItem("Ingreso");
        ComboIE.addItem("Egreso");

        if (lineas != null) {
            for (int i = 0; i < lineas.size(); i++) {
                NodoLista nl = new NodoLista();
                Sucursales newsuc = new Sucursales();
                String linea = lineas.get(i);
                StringTokenizer tokens = new StringTokenizer(linea, ";");
                newsuc.setNoSuc(Integer.parseInt(tokens.nextToken()));
                newsuc.setNombre(tokens.nextToken());
                newsuc.setZona(Integer.parseInt(tokens.nextToken()));
                nl.setEtiqueta(newsuc.getNombre());
                nl.setTObj(newsuc);
                sucs.inserta(nl);
                ComboSucursal.addItem(newsuc.getNombre());
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ComboSucursal = new javax.swing.JComboBox<>();
        ComboIE = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fechatxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Montotxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Descuentotxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("Sucursal:");

        ComboSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboSucursalActionPerformed(evt);
            }
        });

        ComboIE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Ingreso/ Egreso:");

        jLabel3.setText("Monto:");

        fechatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechatxtActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha (dd/MM/yyyy):");

        Montotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MontotxtActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Descuentotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescuentotxtActionPerformed(evt);
            }
        });

        jLabel5.setText("Descuento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Descuentotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ComboIE, 0, 161, Short.MAX_VALUE)
                                .addComponent(ComboSucursal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Montotxt, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addGap(105, 105, 105))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(237, 237, 237)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(283, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Montotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Descuentotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(211, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(305, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(121, 121, 121)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fechatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechatxtActionPerformed

    private void MontotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MontotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MontotxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuPrinc m = new MenuPrinc();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        ArchivoSuc archivo = new ArchivoSuc("sucursales.txt");
        EDD.ArchivoSuc archivoI = new ArchivoSuc("Ingresos.txt");
        ListaDoblementeLigada sucs = new ListaDoblementeLigada();
        LinkedList<String> lineas = archivo.obtenerTexto();
        LinkedList<String> lineasI = archivoI.obtenerTexto();
        if (lineas != null) {
            for (int i = 0; i < lineas.size(); i++) {
                NodoLista nl = new NodoLista();
                Sucursales newsuc = new Sucursales();
                String linea = lineas.get(i);
                StringTokenizer tokens = new StringTokenizer(linea, ";");
                newsuc.setNoSuc(Integer.parseInt(tokens.nextToken()));
                newsuc.setNombre(tokens.nextToken());
                newsuc.setZona(Integer.parseInt(tokens.nextToken()));
                newsuc.setcI(new ListaDoblementeLigada());
                newsuc.setcE(new ListaDoblementeLigada());
                for (int j = 0; j < lineasI.size(); j++) {
                    NodoLista nodoI = new NodoLista();
                    IngresoEgreso I = new IngresoEgreso();
                    String lineaI = lineasI.get(j);
                    
                    StringTokenizer tokensI = new StringTokenizer(lineaI, ";");
                    
                    I.setMonto(Double.parseDouble(tokensI.nextToken()));
                    I.setFecha(tokensI.nextToken());
                    
                    I.setDescuento(Double.parseDouble(tokensI.nextToken()));
                    I.setSucursal(Integer.parseInt(tokensI.nextToken()));
                    
                    I.setEI(1);
                    nodoI.setEtiqueta("Ingreso"+j);
                    nodoI.setTObj(I);
                    if(I.getSucursal()==newsuc.getNoSuc()){
                        ListaDoblementeLigada copiadelista = (ListaDoblementeLigada) newsuc.getcI();  
                        copiadelista.inserta(nodoI);
                    }
                }
                nl.setEtiqueta(newsuc.getNombre());
                nl.setTObj(newsuc);
                sucs.inserta(nl);
            }
        }

        NodoLista nl = new NodoLista();
        Sucursales newsuc = new Sucursales();
        String nombre = (String) ComboSucursal.getSelectedItem();
        nl = sucs.buscar(nombre);
        newsuc = (Sucursales) nl.getTObj();

        if (verificarCampos()) {
            String IE = (String) ComboIE.getSelectedItem();
            IngresoEgreso ingregr = new IngresoEgreso();
            if (IE == "Ingreso") {
                ingregr.setEI(1);
                if (Descuentotxt.getText() != "0") {
                    ingregr.setDescuento(Double.parseDouble(Descuentotxt.getText()));
                } else {
                    ingregr.setDescuento(0.0);
                }
                ingregr.setMonto(Double.parseDouble(Montotxt.getText()));
                ingregr.setFecha(fechatxt.getText());
                ingregr.setSucursal(newsuc.getNoSuc());
                ArchivoSuc archivoIE = new ArchivoSuc("Ingresos.txt");
                archivoIE.registrar(ingregr.toString());
                sucs.eliminar(newsuc.getNombre());
                ListaDoblementeLigada obtenerIngresos = (ListaDoblementeLigada) newsuc.getcI();
                if (obtenerIngresos == null) {
                    NodoLista nlparanuevoIngreso = new NodoLista();
                    obtenerIngresos = new ListaDoblementeLigada();

                    nlparanuevoIngreso.setTObj(ingregr);
                    nlparanuevoIngreso.setEtiqueta("Ingreso");
                    obtenerIngresos.inserta(nlparanuevoIngreso);
                    newsuc.setcI(obtenerIngresos);
                } else {
                    NodoLista nlparanuevoIngreso = new NodoLista();
                    nlparanuevoIngreso.setTObj(ingregr);
                    nlparanuevoIngreso.setEtiqueta("Ingreso");
                    obtenerIngresos.inserta(nlparanuevoIngreso);
                    newsuc.setcI(obtenerIngresos);
                }
                
                nl.setTObj(newsuc);
                sucs.inserta(nl);
                sucs.reescribe("sucursales.txt");
            } else {
                ingregr.setEI(0);
                if (Descuentotxt.getText() != "0") {
                    ingregr.setDescuento(Double.parseDouble(Descuentotxt.getText()));
                } else {
                    ingregr.setDescuento(0.0);
                }
                ingregr.setMonto(Double.parseDouble(Montotxt.getText()));
                ingregr.setFecha(fechatxt.getText());
                ingregr.setSucursal(newsuc.getNoSuc());
                ArchivoSuc archivoIE = new ArchivoSuc("Egresos.txt");
                archivoIE.registrar(ingregr.toString());
                sucs.eliminar(newsuc.getNombre());
                ListaDoblementeLigada obtenerEngresos = (ListaDoblementeLigada) newsuc.getcE();
                if (obtenerEngresos == null) {
                    NodoLista nlparanuevoIngreso = new NodoLista();
                    obtenerEngresos = new ListaDoblementeLigada();

                    nlparanuevoIngreso.setTObj(ingregr);
                    nlparanuevoIngreso.setEtiqueta("Ingreso");
                    obtenerEngresos.inserta(nlparanuevoIngreso);
                    newsuc.setcI(obtenerEngresos);
                } else {
                    NodoLista nlparanuevoIngreso = new NodoLista();
                    nlparanuevoIngreso.setTObj(ingregr);
                    nlparanuevoIngreso.setEtiqueta("Ingreso");
                    obtenerEngresos.inserta(nlparanuevoIngreso);
                    newsuc.setcI(obtenerEngresos);
                }
                nl.setTObj(newsuc);
                sucs.inserta(nl);
                sucs.reescribe("sucursales.txt");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Verifique Campos");
        }
        MenuPrinc m = new MenuPrinc();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ComboSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboSucursalActionPerformed

    private void DescuentotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescuentotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescuentotxtActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarIE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarIE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarIE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarIE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarIE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboIE;
    private javax.swing.JComboBox<String> ComboSucursal;
    private javax.swing.JTextField Descuentotxt;
    private javax.swing.JTextField Montotxt;
    private javax.swing.JTextField fechatxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
