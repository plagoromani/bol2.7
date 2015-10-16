/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2.pkg7;

import java.util.Scanner;

/**
 *
 * @author plagoromani
 */
public class Bol27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float n,i,t,total;
        
        System.out.println("Nomina:");
        Scanner obx=new Scanner(System.in);
        n=obx.nextFloat();
        System.out.println("Interes Anual %:");
        i=obx.nextFloat();
        System.out.println("Años:");
        t=obx.nextFloat();
        
        total=n*i*t/1200;
        System.out.println("Renta Mensual="+total);
    }
    
}
