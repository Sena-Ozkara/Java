/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package çok_boyutlu_dizilerde_iki_dizinin_karşılaştırılması_uygulama_orneği;

import java.util.Arrays;
/**
 *
 * @author Sena Özkara
 */
public class Çok_boyutlu_dizilerde_iki_dizinin_karşılaştırılması_Uygulama_Orneği {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("\n ********************** Çok boyutlu dizilerde iki dizinin karşılaştırılması Uygulama Örneği-1 ****************************** \n" );
        
         int matris1[][] = { { 10, 20 },
                       { 40, 50 },
                       { 60, 70 } };
  
        int matris2[][] = { { 30, 20 },
                       { 10, 0 },
                       { 60, 80 } };
  
        int matris3[][] = { { 10, 20 },
                       { 40, 50 },
                       { 60, 70 } };
        System.out.println("matris1 ve matris2'nin karşılaştırılması  : "
                           + Arrays.deepEquals(matris1, matris2));
  
        System.out.println("matris2 ve matris3'nin karşılaştırılması: "
                           + Arrays.deepEquals(matris2, matris3));
  
        System.out.println("matris1 ve matris3'nin karşılaştırılması : "
                           + Arrays.deepEquals(matris1, matris3));
        System.out.println("\n ********************** Çok boyutlu dizilerde iki dizinin karşılaştırılması Uygulama Örneği-1 ****************************** \n" );
        
    }
    
}
