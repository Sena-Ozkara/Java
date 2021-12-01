/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.sortuygulamaörneği;

import java.util.Arrays;

/**
 *
 * @author Sena Özkara
 */
public class ArraysSortUygulamaÖrneği {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        
        
        
            int Array[] = {3, 1, 2, 18, 10};

                    for (int number : Array) {
             System.out.println("Dizideki numaralar = " + number);
          }

          
          Arrays.sort(Array, 0, 3);

         
          System.out.println("Sıralanmış dizi(0 - 3) :");
          for (int number : Array) {
             System.out.println("Dizideki numaralar  = " + number);
        
     
        
    }
    
}
}