package controlador;

import modelo.Modelo;
import vista.Ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Controller implements ActionListener {

    private Ventana vista;
    private Modelo modelo;

    public Controller(Ventana vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.vista.getBotonIniciar())){
            String semilla = this.vista.getSemilla().getText().toString();
            int iteraciones = Integer.parseInt(this.vista.getCboIteraciones().getSelectedItem().toString());
            this.modelo.crearLineas(this.modelo.replaceString(semilla,iteraciones));
            this.vista.getPanel().repaint();
        }



    }
}
