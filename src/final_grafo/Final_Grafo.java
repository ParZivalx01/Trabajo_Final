/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_grafo;

import controlador.Controlador;
import vista.Vista;
import modelo.Grafo;
import modelo.Vertice;

/**
 *
 * @author nieto
 */
public class Final_Grafo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Vertice vert=new Vertice();
       Grafo grafo =new Grafo();
       Vista view= new Vista();
       Controlador ctrl = new Controlador(grafo, vert, view);
       ctrl.Iniciar();
       view.setVisible(true);
       
    }
}
