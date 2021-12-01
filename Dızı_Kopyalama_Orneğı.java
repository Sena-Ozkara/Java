/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dızı_kopyalama_orneğı;
   
 import java.util.Arrays;
/**
 *
 * @author Sena Özkara
 */
public class Dızı_Kopyalama_Orneğı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       System.out.println("\n **********************  Dizi Kopyalama Uygulama Örneği-1 ****************************** \n" );
        char[]copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
        //Bir hedef dizi bildirme
        char[]copyTo=new char[7];
        //System.arraycopy() yöntemini kullanarak dizi kopyalamak
        System.arraycopy(copyFrom,2,copyTo,0,7);
        //hedef diziyi yazdırmak
        System.out.println(String.valueOf(copyTo));
        System.out.println("\n **********************  Dizi Kopyalama Uygulama Örneği-1 ****************************** \n" );

    }
}
