/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.Programacion1.ArreglosTranspuestos.vista;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Familia
 */
public class ClaseConMain {
private static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Fl,  Cl;
        int i,j;
        Fl = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de filas"));
        Cl = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de Columnas"));
        int [][] matriz = new int[Fl][Cl];
          System.out.println("Ingrese los datos de la primera matriz");
        for ( i = 0; i < Fl; i++) {
             for ( j = 0; j < Cl; j++) {
                 System.out.print("Matriz ["+i+"]["+j+"]");
                 matriz[i][j]= sc.nextInt();
             }
        }
        System.out.println("\nMatriz Original : ");
        for ( i = 0; i < Fl; i++) {
             for ( j = 0; j < Cl; j++) {             
                 System.out.print(matriz[i][j]+" ");
             }
             System.out.println("");
             }
        int aux;
         for ( i = 0; i < Fl; i++) {
             for ( j = 0; j < i; j++) {     
                 aux = matriz[i][j];
                 matriz[i][j] = matriz[j][i];
                 matriz[j][i] = aux;
             }
             }
           System.out.println("\nLa Matriz Transpuesta es : ");
        for ( i = 0; i < Fl; i++) {
             for ( j = 0; j < Cl; j++) {       
                   System.out.print(matriz[i][j]+" ");
             }
             System.out.println(""); 
             }
        // TODO code application logic here
    }
    
}
