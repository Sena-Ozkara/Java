/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.fill_.uygulama_örneği_1;

import java.util.Arrays;

/**
 *
 * @author Sena Özkara
 */
public class ArraysFill_Uygulama_Örneğİ_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

        // 
        byte dizi[] = new byte[]{1, 6, 3, 2, 9};

        System.out.println("Gerçek dizi: ");
        for (byte value : dizi) {
            System.out.println("Değerler = " + value);
        }

        Arrays.fill(dizi, 2, 4, (byte) 64);

        System.out.println(" fill() yöntemini kullandıktan sonra yeni değerler: ");
        for (byte value : dizi) {
            System.out.println("Değerler = " + value);

            

        }

    }
}