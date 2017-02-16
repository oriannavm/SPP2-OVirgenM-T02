/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.ovirgenm.t02;
import java.util.Scanner;
/**
 *
 * @author Orianna
 */
public class SPP2OVirgenMT02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Programa para calcular sueldos de trabajadores
        //Declaración de variables
        
        Scanner teclado = new Scanner(System.in);
        int sue;
        int categoria;
        int horasExtras;
        int sueldo;
        int sueldoTotal;
           
  
        Scanner keyboard= new Scanner (System.in);
        System.out.println("Introduce la categoria del trabajador:");
        categoria= keyboard.nextInt();
        
      
        if (categoria > 8){
            System.out.println("ERROR");           
        } else {
    switch (categoria) {
                case 1 :
                    sueldo = pedirSueldo();
                    horasExtras = horasExtra();
                    sueldoTotal = horasExtras*30;
                System.out.println("El sueldo total es: " +(sueldo+sueldoTotal));
                break;
                case 2: 
                    sueldo = pedirSueldo();
                    horasExtras = horasExtra();
                    sueldoTotal = horasExtras*38;
                System.out.println("El sueldo total es: " +(sueldo+sueldoTotal));  
                break;
                case 3:
                    sueldo = pedirSueldo();
                    horasExtras = horasExtra();
                    sueldoTotal = horasExtras*50;
                System.out.println("El sueldo total es: " +(sueldo+sueldoTotal));
                break;
                case 4: 
                    sueldo = pedirSueldo();
                    horasExtras = horasExtra();
                    sueldoTotal = horasExtras*70;
                System.out.println("El sueldo total es: " +(sueldo+sueldoTotal));
                break;
                case 5: 
                    sueldo = pedirSueldo();
                    horasExtras = horasExtra();
                    sueldoTotal = horasExtras*93;
                System.out.println("El sueldo total es: " +(sueldo+sueldoTotal));
                break;
                case 6:
                    sueldo = pedirSueldo();
                    horasExtras = horasExtra();
                    sueldoTotal = horasExtras*100;
                System.out.println("El sueldo total es: " +(sueldo+sueldoTotal));
                case 7:
                    sueldo = pedirSueldo();
                    horasExtras = horasExtra();
                    sueldoTotal = horasExtras*112;
                System.out.println("El sueldo total es: " +(sueldo+sueldoTotal));
                case 8: 
                    sueldo = pedirSueldo();
                    horasExtras = horasExtra();
                    sueldoTotal = horasExtras*125;
                System.out.println("El sueldo total es: " +(sueldo+sueldoTotal));

                                                         
    }
    
    }
    }      
    static int pedirSueldo(){
        Scanner teclado = new Scanner(System.in);
        int sueldo;
        System.out.println("Introduzca su sueldo normal: ");
        sueldo = teclado.nextInt();
        return sueldo;
                }
    static int horasExtra(){
        Scanner teclado = new Scanner(System.in);
        int horasExtras;
        System.out.println("Introduzca las horas extras trabajadas:");
        horasExtras = teclado.nextInt();
        return horasExtras; 
    }
    }
                
    
 
