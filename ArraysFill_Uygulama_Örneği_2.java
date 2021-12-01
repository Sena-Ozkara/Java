/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.fill_uygulama_örneği_2;

import java.util.Arrays;

/**
 *
 * @author Sena Özkara
 */
public class ArraysFill_Uygulama_Örneği_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       System.out.println("\n ********************** Arrays.fill() Uygulama Örneği-2 ****************************** \n" );
        
        String şehirler[]={"Ankara","İstanbul","Bursa","Eskişehir","İzmir","Antalya"};
        String StringKey="Afyonkarahsar";
        Arrays.fill(şehirler,StringKey);
        System.out.println("dizinin anahtar ile doldurulmuş hali"+ Arrays.toString(şehirler));
        
        System.out.println("\n ********************** Arrays.fill() Uygulama Örneği-2 ****************************** \n" );
        
    }
    
}
