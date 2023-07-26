/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pobrejosue;
import java.util.Scanner;
/**
 *
 * @author 507
 */
public class PobreJosue {

    public static void main(String[] args) {
        int a = 5;
        int b = 15;
        double c; 
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingresa el valor de a");
        a = sc.nextInt();
        
        System.out.println("Ingresa el valor de b");
        b = sc.nextInt();
        
        c = (Math.sqrt(Math.pow(a, 2)+(Math.pow(b, 2))));
                
        System.out.println("Josue esta a "+c+" metros de Sara");
    }
}
