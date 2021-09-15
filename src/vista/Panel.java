package vista;

import modelo.Linea;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Panel extends JPanel {

    private ArrayList<Linea> lineas = new ArrayList<Linea>();

    public Panel(){
        this.setSize(1190,590);
        this.setVisible(true);
        this.setBackground(Color.BLACK);
    }


    @Override
    public void paint(Graphics g){

        System.out.println(lineas.size());

        for (Linea l : lineas) {
            g.setColor(Color.WHITE);
            g.drawLine(l.getX1(),l.getY1(),l.getX2(),l.getY2());
        }

    }

    public ArrayList<Linea> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<Linea> lineas) {
        this.lineas = lineas;
    }
}
