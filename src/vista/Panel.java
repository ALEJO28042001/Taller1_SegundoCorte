package vista;

import modelo.Linea;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Panel extends JPanel {

    private ArrayList<Linea> lineas = new ArrayList<Linea>();

    public Panel(){
        this.setSize(500,500);
        this.setVisible(true);
        this.setBackground(Color.BLACK);
    }


    @Override
    public void paint(Graphics g){

        for (Linea l : lineas) {
            g.drawLine(l.getX1(),l.getY1(),l.getX2(),l.getY2());
        }

    }

}
