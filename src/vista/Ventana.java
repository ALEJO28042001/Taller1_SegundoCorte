package vista;

import controlador.Controller;

import javax.swing.*;

public class Ventana extends JFrame {

    private Panel panel = new Panel();
    private Controller controller;
    private JButton botonIniciar = new JButton("Iniciar");
    private JComboBox<Integer> cboIteraciones = new JComboBox<Integer>();
    private JTextField semilla = new JTextField();
    private JLabel labelSemilla = new JLabel("Semilla:");
    private JLabel labelIteraciones = new JLabel("Iteraciones:");
    private JLabel labelUdlr =new JLabel("(Solo u,d,l,r)");

    public Ventana(){

        this.setSize(1200, 750);
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
        this.add(labelSemilla);
        this.labelSemilla.setBounds(10,600,100,30);
        this.add(semilla);
        this.semilla.setBounds(110,600,100,30);
        this.add(botonIniciar);
        this.botonIniciar.setBounds(110,670,100,30);
        this.add(cboIteraciones);
        this.cboIteraciones.setBounds(110,630,100,30);
        this.add(labelIteraciones);
        this.labelIteraciones.setBounds(10,630,100,30);
        this.add(labelUdlr);
        this.labelUdlr.setBounds(230,600,100,30);

    }


    public void setController(Controller cont){
        this.controller = cont;
        this.botonIniciar.addActionListener(this.controller);

    }

    //Getters y Setters

    public Panel getPanel() {
        return panel;
    }

    public void setPanel(Panel panel) {
        this.panel = panel;
    }

    public JButton getBotonIniciar() {
        return botonIniciar;
    }

    public void setBotonIniciar(JButton botonIniciar) {
        this.botonIniciar = botonIniciar;
    }

    public JComboBox<Integer> getCboIteraciones() {
        return cboIteraciones;
    }

    public void setCboIteraciones(JComboBox<Integer> cboIteraciones) {
        this.cboIteraciones = cboIteraciones;
    }

    public JTextField getSemilla() {
        return semilla;
    }

    public void setSemilla(JTextField semilla) {
        this.semilla = semilla;
    }
}
