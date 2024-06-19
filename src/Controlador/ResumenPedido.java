package Controlador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResumenPedido extends javax.swing.JFrame {
    public ResumenPedido(String distribuidor, String resumenPedido, String direccion) {
        initComponents(distribuidor, resumenPedido, direccion);
    }

    private void initComponents(String distribuidor, String resumenPedido, String direccion) {
        JLabel lblResumenPedido = new JLabel(resumenPedido);
        JLabel lblDireccion = new JLabel(direccion);
        JButton btnCancelar = new JButton("Cancelar");
        JButton btnEnviar = new JButton("Enviar Pedido");

        // Configurar la acción del botón "Cancelar"
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cierra la ventana actual
            }
        });

        // Configurar la acción del botón "Enviar Pedido"
        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pedido enviado");
                dispose(); // Cierra la ventana actual
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pedido al distribuidor " + distribuidor);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblResumenPedido)
                    .addComponent(lblDireccion)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEnviar)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblResumenPedido)
                .addGap(18, 18, 18)
                .addComponent(lblDireccion)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnEnviar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }
}
