/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.fill_uygulama_örneği_3;

import java.util.Arrays;

/**
 *
 * @author Sena Özkara
 */
public class ArraysFill_Uygulama_Örneği_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("\n ********************** Arrays.fill() Uygulama Örneği-3 ****************************** \n" );
        
        String şehirler[]={"Ankara","İstanbul","Bursa","Eskişehir","İzmir","Antalya"};
        
        Arrays.fill(şehirler,0,3 ,(String)"Afyonkarahisar");
        System.out.println("fill() yontemı kullanılarak oluşturulmuş dizi"+ Arrays.toString(şehirler));
        
        System.out.println("\n ********************** Arrays.fill() Uygulama Örneği-3 ****************************** \n" );
        
    }
    
}
