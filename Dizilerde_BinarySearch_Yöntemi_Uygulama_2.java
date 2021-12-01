/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dizilerde_binarysearch_yöntemi_uygulama_2;

import java.util.Arrays;

/**
 *
 * @author Sena Özkara
 */
public class Dizilerde_BinarySearch_Yöntemi_Uygulama_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       int arama ;//dizide arama yapmak için değişken tanımladık
       int numaralar []={12,16,20,98,76};
       arama=Arrays.binarySearch(numaralar,98);
        System.out.println("98 sayısının indexi"+arama);
    }
    //Videoda bu örneğin bu şekli ve  değiştirilerek  anlatılmış hali mevcuttur.
}
