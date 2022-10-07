/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 *
 * @author nieto
 */
public class Vertice extends javax.swing.JPanel {

    private int pos = -1;
    private String nombreN[];
    private int cv;

    public Vertice() {
        this.cv = 0;
        this.nombreN = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String[] getNombreN() {
        return nombreN;
    }

    public void setNombreN(String[] nombreN) {
        this.nombreN = nombreN;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }
    

    public void dibuja(Graphics g) {
        Font fuenteV = this.getFont();
        Font nuevaFuente = new Font("Monospaced", Font.BOLD, 16);
        g.setColor(Color.blue);
        g.drawOval(0, 0, 30, 30);
        g.setColor(Color.black);
        g.setFont(nuevaFuente);
//        if (cv == maxN) {
//            cv = 0;
//        }
        g.drawString(nombreN[cv], 12, 19);
        g.setFont(fuenteV);
        this.setName(nombreN[cv]);
        pos = cv;
        cv++;
    }
    
    
}