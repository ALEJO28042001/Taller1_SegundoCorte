package vista;

import controlador.Controller;

import javax.swing.*;

public class Ventana extends JFrame {

    private Panel panel = new Panel();
    private Controller controller;
    private JButton botonIniciar = new JButton("Iniciar");
    private JComboBox<Integer> cboIteraciones = new JComboBox<Integer>();

    public Ventana(){

        this.setSize(800, 700);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.initComponents();
        this.addItems();
    }

    private void addItems() {

        for (int i = 0; i < 20; i++) {
            this.cboIteraciones.addItem(i+1);
        }

    }

    public void initComponents(){

        this.add(panel);
        this.add(botonIniciar);
        this.botonIniciar.setBounds(10,600,100,30);
        this.add(cboIteraciones);
        this.cboIteraciones.setBounds(10,550,100,30);

    }

    public void setController(Controller cont){
        this.controller = cont;
        this.botonIniciar.addActionListener(this.controller);

    }

    public Panel getPanel() {
        return panel;
    }

    public void setPanel(Panel panel) {
        this.panel = panel;
    }
}
