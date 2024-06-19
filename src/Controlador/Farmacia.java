/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane; // Importa JOptionPane aquí
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.GridLayout;

/**
 *
 * @author JB
 */
public class Farmacia extends javax.swing.JFrame {

    /**
     * Creates new form Farmacia
     */
    public Farmacia() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreMedicamento = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jComboBox = new javax.swing.JComboBox<>();
        jrdCofarma = new javax.swing.JRadioButton();
        jrdEmpsephar = new javax.swing.JRadioButton();
        jrdCemefar = new javax.swing.JRadioButton();
        jchbPrincipal = new javax.swing.JCheckBox();
        jchbSecundaria = new javax.swing.JCheckBox();
        btnBorrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("SOLICITUD DE MEDICAMENTOS");

        jLabel2.setText("Nombre del Medicamento:");

        jLabel3.setText("Tipo de Medicamento:");

        jLabel4.setText("Cantidad:");

        jLabel5.setText("Distribuidor Farmaceutico:");

        jLabel6.setText("Farmacia");

        txtNombreMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreMedicamentoActionPerformed(evt);
            }
        });

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Analgésico", "Analéptico", "Anestésico", "Antiácido", "Antidepresivo", "Antibióticos" }));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jrdCofarma.setText("Cofarma");

        jrdEmpsephar.setText("Empsephar");

        jrdCemefar.setText("Cemefar");

        jchbPrincipal.setText("Principal");

        jchbSecundaria.setText("Secundaria");

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Confirmar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(33, 33, 33))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(52, 52, 52))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(110, 110, 110)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jchbPrincipal)
                        .addGap(36, 36, 36)
                        .addComponent(jchbSecundaria)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox, 0, 210, Short.MAX_VALUE)
                            .addComponent(txtNombreMedicamento)
                            .addComponent(txtCantidad))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrdCofarma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(jrdEmpsephar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrdCemefar)))
                        .addGap(48, 48, 48))))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnBorrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jrdCofarma)
                    .addComponent(jrdEmpsephar)
                    .addComponent(jrdCemefar))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jchbPrincipal)
                        .addComponent(jchbSecundaria)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// Validación de los campos antes de mostrar el resumen del pedido

        String nombreMedicamento = txtNombreMedicamento.getText().trim();
        String tipoMedicamento = jComboBox.getSelectedItem().toString();
        String cantidad = txtCantidad.getText().trim();
        String distribuidor = obtenerDistribuidorSeleccionado();
        String sucursal = obtenerSucursalSeleccionada();

        // Validar que se haya ingresado el nombre del medicamento
        if (nombreMedicamento.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el nombre del medicamento.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar que se haya seleccionado el tipo de medicamento
        if (tipoMedicamento.equals("Seleccione...")) {
            JOptionPane.showMessageDialog(this, "Debe elegir el tipo de medicamento.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar que la cantidad sea un número entero positivo
        int cantidadNumero;
        try {
            cantidadNumero = Integer.parseInt(cantidad);
            if (cantidadNumero <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La cantidad debe ser un número entero positivo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar que se haya elegido un distribuidor
        if (distribuidor == null) {
            JOptionPane.showMessageDialog(this, "Debe elegir un distribuidor farmacéutico.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar que se haya elegido al menos una sucursal
        if (sucursal.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe elegir al menos una sucursal.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Si todas las validaciones pasan, mostrar el resumen del pedido
        mostrarResumenPedido(nombreMedicamento, tipoMedicamento, cantidadNumero, distribuidor, sucursal);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void mostrarResumenPedido(String nombreMedicamento, String tipoMedicamento, int cantidad, String distribuidor, String sucursal) {
        // Construir el texto del resumen del pedido
        String tituloVentana = "Pedido al distribuidor " + distribuidor;
        String textoMedicamento = cantidad + " unidades del " + tipoMedicamento.toLowerCase() + " " + nombreMedicamento;
        String textoDireccion = "Para la farmacia situada en " + obtenerDireccionSucursal(sucursal);

        // Crear la ventana del resumen del pedido
        JFrame resumenPedidoFrame = new JFrame(tituloVentana);
        resumenPedidoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Crear el panel principal y configurar el layout
        JPanel panelResumen = new JPanel(new GridLayout(3, 1));
        JLabel labelPedido = new JLabel(tituloVentana);
        JLabel labelMedicamento = new JLabel(textoMedicamento);
        JLabel labelDireccion = new JLabel(textoDireccion);

        // Agregar los componentes al panel principal
        panelResumen.add(labelPedido);
        panelResumen.add(labelMedicamento);
        panelResumen.add(labelDireccion);

        // Crear el panel para los botones y configurar el layout
        JPanel panelBotones = new JPanel();
        JButton btnCancelar = new JButton("Cancelar");
        JButton btnEnviar = new JButton("Enviar Pedido");

        // Agregar ActionListener para el botón Cancelar
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resumenPedidoFrame.dispose();
            }
        });

        // Agregar ActionListener para el botón Enviar Pedido
        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pedido enviado");
                limpiarFormulario();
                resumenPedidoFrame.dispose();
            }
        });

        // Agregar botones al panel de botones
        panelBotones.add(btnCancelar);
        panelBotones.add(btnEnviar);

        // Configurar el layout de la ventana principal
        resumenPedidoFrame.setLayout(new BorderLayout());
        resumenPedidoFrame.add(panelResumen, BorderLayout.CENTER);
        resumenPedidoFrame.add(panelBotones, BorderLayout.SOUTH);

        // Establecer tamaño y posición de la ventana
        resumenPedidoFrame.setSize(400, 200); // Tamaño deseado (ancho x alto)
        resumenPedidoFrame.setLocationRelativeTo(null); // Centrar en pantalla

        // Mostrar la ventana
        resumenPedidoFrame.setVisible(true);
    }

    private String obtenerDistribuidorSeleccionado() {
        if (jrdCofarma.isSelected()) {
            return "Cofarma";
        } else if (jrdEmpsephar.isSelected()) {
            return "Empsephar";
        } else if (jrdCemefar.isSelected()) {
            return "Cemefar";
        }
        return null;
    }

    private String obtenerSucursalSeleccionada() {
        String sucursales = "";
        if (jchbPrincipal.isSelected()) {
            sucursales += "Principal";
        }
        if (jchbSecundaria.isSelected()) {
            if (!sucursales.isEmpty()) {
                sucursales += " y ";
            }
            sucursales += "Secundaria";
        }
        return sucursales;
    }

    private String obtenerDireccionSucursal(String sucursal) {
        if (sucursal.equals("Principal")) {
            return "Calle de la Rosa n. 28";
        } else if (sucursal.equals("Secundaria")) {
            return "Calle Alcazabilla n. 3";
        }
        return "";
    }

    private void txtNombreMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreMedicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMedicamentoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void limpiarFormulario() {
        txtNombreMedicamento.setText("");
        jComboBox.setSelectedIndex(0);
        txtCantidad.setText("");
        jrdCofarma.setSelected(false);
        jrdEmpsephar.setSelected(false);
        jrdCemefar.setSelected(false);
        jchbPrincipal.setSelected(false);
        jchbSecundaria.setSelected(false);
    }

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
            java.util.logging.Logger.getLogger(Farmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Farmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Farmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Farmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Farmacia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JCheckBox jchbPrincipal;
    private javax.swing.JCheckBox jchbSecundaria;
    private javax.swing.JRadioButton jrdCemefar;
    private javax.swing.JRadioButton jrdCofarma;
    private javax.swing.JRadioButton jrdEmpsephar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombreMedicamento;
    // End of variables declaration//GEN-END:variables
}
