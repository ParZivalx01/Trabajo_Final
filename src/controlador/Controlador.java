/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import modelo.Grafo;
import modelo.Vertice;
import vista.Vista;

/**
 *
 * @author nieto
 */
public class Controlador implements ActionListener {

    private Grafo grafo;
    private Vertice vert;
    private Vista view;

    public Controlador() {
    }

    public Controlador(Grafo grafo, Vertice vert, Vista view) {
        this.grafo = grafo;
        this.vert = vert;
        this.view = view;

        this.view.verticeBTN.addActionListener(this);
        this.view.ladoBTN.addActionListener(this);
        
    }

    public void panelViewMouseClicked(java.awt.event.MouseEvent evt) {
        if (this.view.Jpanel.getMousePosition() != null) {
            Point p = this.view.Jpanel.getMousePosition().getLocation();
            if (!this.grafo.L) {
                if (this.grafo.N) {
                    this.view.ladoBTN.setEnabled(true);
                    this.view.matrizadBTN.setEnabled(true);
                    this.view.MatrizIBTN.setEnabled(true);
                    Vertice prueba = new Vertice();
                    prueba.setBounds(p.x - 15, p.y - 10, 31, 31);
                    this.view.Jpanel.add(prueba);
                    this.grafo.panel.add(prueba);
                    prueba.dibuja(prueba.getGraphics());
                }
            }
        }
    }

    public void mouseClicked(MouseEvent e) {
        Point p;
        if (this.grafo.L) {
            p = MouseInfo.getPointerInfo().getLocation();
            if (this.grafo.eligioP) {
                p = this.vert.getLocation();
                this.grafo.x1 = p.x;
                this.grafo.y1 = p.y;
                this.grafo.eligioP = false;
                this.grafo.i = this.vert.getPos();
            } else {
                p = this.vert.getLocation();
                this.grafo.x2 = p.x;
                this.grafo.y2 = p.y;
                this.grafo.linea(this.grafo.x1, this.grafo.y1, this.grafo.x2, this.grafo.y2);
                this.grafo.eligioP = true;
                this.grafo.j = this.vert.getPos();
                this.grafo.MAdyacencia[this.grafo.i][this.grafo.j] = true;
                this.grafo.MAdyacencia[this.grafo.j][this.grafo.i] = true;
                this.grafo.MIncidencia[this.grafo.i][this.grafo.j] = true;
                this.grafo.MIncidencia[this.grafo.j][this.grafo.i] = true;
            }
        }
        System.out.println("hola");
    }

    public void Mvertice() {
        if (this.grafo.N) {
            this.grafo.N = false;
            this.grafo.L = false;
            this.view.lblEstado.setText("Vertice y Arista Desactivado");
            this.view.verticeBTN.setBackground(null);
            this.view.ladoBTN.setBackground(null);
        } else {
            this.grafo.L = false;
            this.grafo.N = true;
            this.view.verticeBTN.setBackground(Color.decode("#79f966"));
            this.view.ladoBTN.setBackground(null);
            this.view.lblEstado.setText("Vertice Activo");
        }
    }
    public void Mlado(){
         if (this.grafo.L) {
            this.grafo.L = false;
            this.grafo.N = false;
            this.view.lblEstado.setText("Vertice y Arista Desactivado");
            this.view.verticeBTN.setBackground(null);
            this.view.ladoBTN.setBackground(null);
        } else {
            this.grafo.N = false;
            this.grafo.L = true;
            this.view.ladoBTN.setBackground(Color.decode("#79f966"));
            this.view.verticeBTN.setBackground(null);
            this.view.lblEstado.setText("Arista Activo");
        }
    }
      
//    public void muestraAdyacencia() {
//        matrizAdyacente = "Matriz de Adyacencia  \n\n";
//        int tNodos = panel.size();
//        int bit = 0;
//        String Nom = "";
//        matrizAdyacente += "   ";
//        matrizAdyacente += "  ";
//        for (int k = 0; k < tNodos; k++) {
//            matrizAdyacente += "  " + nombreN[k];
//        }
//        for (int k = 0; k < tNodos; k++) {
//            matrizAdyacente += "  \n";
//            for (int l = 0; l < tNodos; l++) {
//                if (MAdyacencia[k][l]) {
//                    bit = 1;
//                } else {
//                    bit = 0;
//                }
//                if (l == 0) {
//                    Nom = nombreL[k] + "  ";
//                } else {
//                    Nom = "";
//                }
//                matrizAdyacente += Nom + bit + "   ";
//            }
//        }
//        setMatriz(matrizAdyacente, matrizIncedencia);
//    }
    public void Iniciar() {
        view.setTitle("GRAFO");
        view.setLocationRelativeTo(null);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.verticeBTN) {
          Mvertice();

            System.out.println("hola");
        }else{
             if (e.getSource() == this.view.ladoBTN) {
             Mlado();
             System.out.println("hello");
        }
        }
    }
//    public void panelViewMouseClicked(java.awt.event.MouseEvent evt) {                                       
//        if (.getMousePosition() != null) {
//            Point p = panelView.getMousePosition().getLocation();
//            if (!L) {
//                if (N) {
//                    btnLinea.setEnabled(true);
//                    btnAyacente.setEnabled(true);
//                    btnIncidencia.setEnabled(true);
//                    Vertice prueba = new Vertice();
//                    prueba.setBounds(p.x - 15, p.y - 10, 31, 31);
//                    panelView.add(prueba);
//                    panel.add(prueba);
//                    prueba.dibuja(prueba.getGraphics());
//                }
//            }
//        }
//    } 
    
}
