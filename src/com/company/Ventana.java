package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Ventana extends JFrame  {
    private JLabel etiqueta, etiqueta2;
    private JTextField campo;
    private JButton boton, boton2;
    private JDialog mensaje;

    public Ventana() {

        super("Ventana");
        etiqueta = new JLabel("entrada");
        campo = new JTextField(15);
        boton = new JButton("Aceptar");
        boton2 = new JButton("ingresar nueva frase");

        mensaje = new JDialog(this);
        mensaje.setSize(400, 400);


        FlowLayout f = new FlowLayout();
        etiqueta2 = new JLabel("");
        setLayout(f);

        add(etiqueta);
        add(campo);
        add(boton);
        //add(boton2);
        mensaje.add(etiqueta2);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                boton();
                campo.setText(null);
            }
        });
       /*boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                campo.setText(null);
                mensaje.setVisible(false);

            }
        });   */


    }

    private void boton() {


        String valor = campo.getText();
        mensaje.getContentPane().setBackground(Color.BLACK);//color del fondo
        etiqueta2.setText(valor);
        etiqueta2.setForeground(Color.WHITE);//color de la letra
        etiqueta2.setFont(new java.awt.Font("Tahoma", 0, 50));//fuente y tamaño de la letra

        mensaje.setVisible(true);


    }
}


