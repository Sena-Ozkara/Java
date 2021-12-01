/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cok_boyutlu_dızıler;

/**
 *
 * @author Sena Özkara
 */
public class Cok_boyutlu_dızıler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("\n ********************** Çok boyutlu Dizi Uygulama Örneği-1 ****************************** \n" ); 

        //Çok boyutlu Dizi Uygulama Örneği-1
        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
        for(int i=0;i<3;i++)
        {
         for(int j=0;j<3;j++)
        {
        System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
        }
         System.out.println("\n ********************** Çok boyutlu Dizi Uygulama Örneği-1 ****************************** \n" ); 

    }
    
}
