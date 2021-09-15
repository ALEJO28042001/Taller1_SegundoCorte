package modelo;

import vista.Ventana;

import java.util.ArrayList;

public class Modelo {

    private Ventana vista;

    public Modelo(Ventana vista) {
        this.vista = vista;
    }

    public String replaceString(String s, Integer it){

        String resultado = "";

        //Caso base

        if (it == 0){
            System.out.println(s);
            return s;
        }

        //Función Recursiva

        else{
            String[] arreglo = new String[s.length()];

            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='u'){
                    arreglo[i] = "ld";
                }
                else if(s.charAt(i)=='d'){
                    arreglo[i] = "rl";
                }
                else if(s.charAt(i)=='l'){
                    arreglo[i] = "ur";
                }
                else if(s.charAt(i)=='r'){
                    arreglo[i] = "du";
                }
                else{
                    arreglo[i] = "";
                }

            }

            for (int i = 0; i < arreglo.length; i++) {
                resultado += arreglo[i];
            }
            //Un cambio
            return replaceString(resultado, it-1);
        }

    }

    public void crearLineas(String s){
        this.vista.getPanel().getLineas().clear();
        ArrayList<Linea> lineas = new ArrayList<Linea>();

        if (s.charAt(0)=='u'){
            lineas.add(new Linea(250,250,250,245));
        }
        else if(s.charAt(0)=='d'){
            lineas.add(new Linea(250,250,250,255));
        }
        else if (s.charAt(0)=='l'){
            lineas.add(new Linea(250,250,245,250));
        }
        else if(s.charAt(0)=='r'){
            lineas.add(new Linea(250,250,255,250));
        }

        for (int i = 1; i <s.length() ; i++) {
            Linea anterior = lineas.get(i-1);
            if (s.charAt(i)=='u'){
                lineas.add(new Linea( anterior.getX2(), anterior.getY2()
                        , anterior.getX2(), anterior.getY2()-5));
            }
            else if(s.charAt(i)=='d'){
                lineas.add(new Linea( anterior.getX2(), anterior.getY2()
                        , anterior.getX2(), anterior.getY2()+5));
            }
            else if (s.charAt(i)=='l'){
                lineas.add(new Linea( anterior.getX2(), anterior.getY2()
                        , anterior.getX2()-5, anterior.getY2()));
            }
            else if(s.charAt(i)=='r'){
                lineas.add(new Linea( anterior.getX2(), anterior.getY2()
                        , anterior.getX2()+5, anterior.getY2()));
            }
        }
        this.vista.getPanel().setLineas(lineas);
    }

}
