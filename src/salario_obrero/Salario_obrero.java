/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario_obrero;

import java.util.Scanner;

/**
 *
 * @author Karol Martinez
 */
public class Salario_obrero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int Nhoras,totalapagar; 
        
        System.out.println("PORFAVOR INGRESE EL NUMERO DE HORAS TRABAJADAS");
        Nhoras=leer.nextInt();
        
        
        
        if(Nhoras>=40){
            totalapagar=40*5000+((Nhoras-40)*6000);
            /* 1000 es el 20%
            1000+5000=6000*/   
        }
        else 
         {
            totalapagar=Nhoras*5000;
        }
       
        
        System.out.println("su salario seria de :"+totalapagar);
    }
    
}
