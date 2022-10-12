/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_04_netbeans_gomez;
import java.util.Scanner;

/**
 *
 * @author Franz
//EJERCICIO: MATRIZ DE 10X1O INGRESADO POR TECLADO MULTIPLIQUE LA DIAGONAL PRIMARIA Y SECUNDARIA
 */
public class EJERCICIO2 {
    
    public static void main(String[] args) {
        int [][] matriz=new  int [10][10];
        int sumP=0,sumS=0,cont=9;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Ingrese el numero en la posicion {"+i+"}{"+j+"} : ");
                matriz[i][j]=(int) (Math.random()*100);
                //matriz[i][j]=sc.nextInt();
                System.out.println(" "+matriz[i][j]);
                if(i==j)
                    sumP=sumP+matriz[i][j];
            }
        }
        for (int i = 0; i < 10; i++) {
            sumS=matriz[i][cont]+sumS;
            cont--;
        }
        cont=sumP*sumS;
        System.out.println("Diagonal Primaria : "+sumP);
        System.out.println("Diagonal Secundaria : "+sumS);
        System.out.println("Producto de las Diagonales : "+cont);
    }
}