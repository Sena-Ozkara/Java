/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dizi_klonlama_uygulama_orneğı;
import java.util.Arrays;
/**
 *
 * @author Sena Özkara
 */
public class Dizi_Klonlama_Uygulama_Orneğı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("\n **********************  Dizi Klonlama Uygulama Örneği-1 ****************************** \n" );
        int arr[]={33,3,4,5};  
        System.out.println("Orjinal dizi yazdırılıyor");  
        for(int i:arr)  
        System.out.println(i);  
  
        System.out.println("Dizinin klonu yazdırılıyor");  
        int carr[]=arr.clone();  
        for(int i:carr)  
        System.out.println(i);  
  
        System.out.println("iki dizi birbirine eşit mi");  
        System.out.println(arr==carr);  

        System.out.println("\n **********************  Dizi Klonlama Uygulama Örneği-1 ****************************** \n" );
        
    }
    
}
