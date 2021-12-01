/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.mismatch.uygulama.örneği;

import java.util.Arrays;

/**
 *
 * @author Sena Özkara
 */
public class ArraysMismatchUygulamaÖrneği {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
         System.out.println("\n ********************** Arrays.mismatch() Uygulama Örneği-1 ****************************** \n" );
        
        
        int intArr[] = { 10, 20, 15, 22, 35 };
  
        
        int intArr1[] = { 10, 15, 22 };
  

        System.out.println("Dizide eşleşmeyen öğenin indexi: "
                           + Arrays.mismatch(intArr, intArr1));
        
         System.out.println("\n ********************** Arrays.mismatch() Uygulama Örneği-1 ****************************** \n" );
        
    }
    
}
