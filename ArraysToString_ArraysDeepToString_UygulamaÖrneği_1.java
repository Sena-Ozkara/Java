/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.tostring_arrays.deeptostring_uygulama.örneği_1;

import java.util.Arrays;

/**
 *
 * @author Sena Özkara
 */
public class ArraysToString_ArraysDeepToString_UygulamaÖrneği_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("\n ********************** Arrays.toString()  Arrays.deepToString() in Uygulama Örneği-1 ****************************** \n" );
        
        Integer[] array1 = { 1, 2, 3, 4, 5 };
        Integer[] array2 = { 6, 7, 8, 9, 10 };
        Integer[][] combinatıonarray = { array1, array2 };
        
        System.out.println(" Arrays.toString() kullanımı: "
                           + Arrays.toString(combinatıonarray));
        
        System.out.println(" Arrays.deepToString()kullanımı: "
                           + Arrays.deepToString(combinatıonarray));
        
        
        System.out.println("\n ********************** Arrays.toString()  Arrays.deepToString() in Uygulama Örneği-1 ****************************** \n" );

    }
    
}
