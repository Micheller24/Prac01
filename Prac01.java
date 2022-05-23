/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.scc202.prac01;

import javax.swing.JOptionPane;

/**
 *
 * @author Michelle
 */
public class Prac01 {

    public static void main(String[] args) {
        System.out.println("Bienvenido a introducción a la programación!");
        String nombre = JOptionPane.showInputDialog("Digite su nombre:");
        
        String lectura;
        int edad;
        int salario;
        double deducciones =0;
        int rebajos =0;
        
        lectura = JOptionPane.showInputDialog("Digite su edad:");
        edad=Integer.parseInt(lectura);
        
        lectura = JOptionPane.showInputDialog("Digite su salario:");
        salario=Integer.parseInt(lectura);
        
        deducciones = salario * 0.0934/100;
        
        rebajos -= salario - deducciones;
        
       
        System.out.print("El señor(a)(ita)" + nombre);
        System.out.print("tiene" + edad + "años");
        System.out.println("y gana un salario de" + salario);
        System.out.print("Su salario con deducciones es:" + deducciones);
        System.out.print("El rebajo de su salario seria de: " + rebajos);
        
        JOptionPane.showMessageDialog
                (null, "La persona " + nombre + "que tiene "+ edad + 
                        "años recibe un salario bruto de " + salario +
                        "Su salario con deducciones es: " + deducciones + 
                        "El rebajo de su salario seria de: " + rebajos);
        
        
    }
}
