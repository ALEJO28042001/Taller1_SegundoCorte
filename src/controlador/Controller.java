package controlador;

import modelo.Modelo;
import vista.Ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Controller implements ActionListener, ItemListener {

    private Ventana vista;
    private Modelo modelo;

    public Controller(Ventana vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        this.vista.getPanel().repaint();

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}
