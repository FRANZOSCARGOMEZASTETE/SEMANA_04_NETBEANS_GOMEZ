/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_04_netbeans_gomez;

import java.util.Scanner;

/**
 *
 * @author Franz
 * MATRIZ DE 10X1O INGRESADO POR TECLADO QUE SUME TODAS LA COLUMNAS IMPARES DE LA MATRIZ
 */
public class EJERCICIO5  {
    
    public static void main(String[] args) {
        int [][] matriz=new  int [10][10];
        int sum=0,cont=1;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Ingrese el numero en la posicion {"+i+"}{"+j+"} : ");
                matriz[i][j]=(int) (Math.random()*90)+10;
                //matriz[i][j]=sc.nextInt();
                System.out.println(" "+matriz[i][j]);
            }
        }
        System.out.println("--------------------------------");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) 
                System.out.print(matriz[i][j]+" ");
            System.out.println("");
        }
        System.out.println("--------------------------------");
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                if(j%2==0)
                    sum=sum+matriz[i][j];
            }  
            if(j%2==0)
                System.out.println("Suma de la Columna "+cont+" => "+sum);
            cont++;
            sum=0;
        }
    }
}