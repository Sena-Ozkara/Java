/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pürüzlü_dizi_uygulama_örneği;

/**
 *
 * @author Sena Özkara
 */
public class Pürüzlü_dizi_uygulama_örneği {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
         
        //tek sütunla bir diziyi başlatma
        int arr[][]=new int[3][];
        arr[0]=new int[3];
        arr[1]=new int[4];
        arr[2]=new int[2];
        //pürüzlü bir diziyi başlatma
        int count=0;
       for(int i=0;i<arr.length;i++)
         for(int j=0;j<arr[i].length;j++)
          arr[i][j]=count++;
        
        //pürüzlü bir dizinin verilerini yazdırma
        for(int i=0;i<arr.length;i++)
            for(int j=0; j<arr[i].length;j++)
            {
            System.out.print(arr[i][j]+" ");
            }
            System.out.println();
         
        
    }
    
}
