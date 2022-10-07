/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 *
 * @author nieto
 */
public class Grafo {
    public static ArrayList<Vertice> panel = new ArrayList<>();
    public static int c = 0;
    public static int cl = 0;
    public static int maxN = 10;
    public static boolean N = false;
    public static boolean L = false;
    public static Graphics h;
    public static String nombreN[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
    public static String nombreL[] = {"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10",
        "A11", "A12", "A13", "A14", "A15", "A16", "A17", "A18", "A19", "A20"};
    public static int maxL = nombreL.length;
    public static boolean eligioP = true;
    public Point punto;
    public static int x1, x2, y1, y2;
    public static int i = -1, j = -1;
    public static boolean MAdyacencia[][] = new boolean[maxN][maxN];
    public static boolean MIncidencia[][] = new boolean[maxN][maxL];
    private String matrizAdyacente = "", matrizIncedencia = "";

    public static ArrayList<Vertice> getPanel() {
        return panel;
    }

    public static void setPanel(ArrayList<Vertice> panel) {
        Grafo.panel = panel;
    }

    public static int getC() {
        return c;
    }

    public static void setC(int c) {
        Grafo.c = c;
    }

    public static int getCl() {
        return cl;
    }

    public static void setCl(int cl) {
        Grafo.cl = cl;
    }

    public static int getMaxN() {
        return maxN;
    }

    public static void setMaxN(int maxN) {
        Grafo.maxN = maxN;
    }

    public static boolean isN() {
        return N;
    }

    public static void setN(boolean N) {
        Grafo.N = N;
    }

    public static boolean isL() {
        return L;
    }

    public static void setL(boolean L) {
        Grafo.L = L;
    }

    public static Graphics getH() {
        return h;
    }

    public static void setH(Graphics h) {
        Grafo.h = h;
    }

    public static String[] getNombreN() {
        return nombreN;
    }

    public static void setNombreN(String[] nombreN) {
        Grafo.nombreN = nombreN;
    }

    public static String[] getNombreL() {
        return nombreL;
    }

    public static void setNombreL(String[] nombreL) {
        Grafo.nombreL = nombreL;
    }

    public static int getMaxL() {
        return maxL;
    }

    public static void setMaxL(int maxL) {
        Grafo.maxL = maxL;
    }

    public static boolean isEligioP() {
        return eligioP;
    }

    public static void setEligioP(boolean eligioP) {
        Grafo.eligioP = eligioP;
    }

    public Point getPunto() {
        return punto;
    }

    public void setPunto(Point punto) {
        this.punto = punto;
    }

    public static int getX1() {
        return x1;
    }

    public static void setX1(int x1) {
        Grafo.x1 = x1;
    }

    public static int getX2() {
        return x2;
    }

    public static void setX2(int x2) {
        Grafo.x2 = x2;
    }

    public static int getY1() {
        return y1;
    }

    public static void setY1(int y1) {
        Grafo.y1 = y1;
    }

    public static int getY2() {
        return y2;
    }

    public static void setY2(int y2) {
        Grafo.y2 = y2;
    }

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        Grafo.i = i;
    }

    public static int getJ() {
        return j;
    }

    public static void setJ(int j) {
        Grafo.j = j;
    }

    public static boolean[][] getMAdyacencia() {
        return MAdyacencia;
    }

    public static void setMAdyacencia(boolean[][] MAdyacencia) {
        Grafo.MAdyacencia = MAdyacencia;
    }

    public static boolean[][] getMIncidencia() {
        return MIncidencia;
    }

    public static void setMIncidencia(boolean[][] MIncidencia) {
        Grafo.MIncidencia = MIncidencia;
    }

    public String getMatrizAdyacente() {
        return matrizAdyacente;
    }

    public void setMatrizAdyacente(String matrizAdyacente) {
        this.matrizAdyacente = matrizAdyacente;
    }

    public String getMatrizIncedencia() {
        return matrizIncedencia;
    }

    public void setMatrizIncedencia(String matrizIncedencia) {
        this.matrizIncedencia = matrizIncedencia;
    }
    
    public void inicializa() {
        for (int r = 0; r < maxN; r++) {
            for (int s = 0; s < maxN; s++) {
                MAdyacencia[r][s] = false;
            }
        }
        for (int e = 0; e < maxN; e++) {
            for (int f = 0; f < maxL; f++) {
                MIncidencia[e][f] = false;
            }
        }
    }

    public static void linea(int x, int y, int w, int z) {
        h.setColor(Color.RED);
        if (x == w && y == z) {
            h.drawArc(x + 10, y + 5, 20, 30, 320, 290);
            x = x + 15;
            y = y + 20;
        } else {
            h.drawLine(x + 20, y + 45, w + 20, z + 45);
            x = ((x + 20 - w + 20) / 2) + w;
            y = ((y + 45 - z + 45) / 2) + z;
        }
        h.setColor(Color.BLACK);
        h.drawString(nombreL[cl], x, y);
//        h.drawString(nombreL[cl], ((x + 20 - w + 20) / 2) + w, ((y + 45 - z + 45) / 2) + z);
        cl++;
    }
    

}
