/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javada._ıki_matris_eklenmesi_ve_toplanması_uygulama_orneği;

/**
 *
 * @author Sena Özkara
 */
public class Javada_Iki_matris_eklenmesi_ve_toplanması_Uygulama_Orneği {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        int a[][]={{1,3,4},{3,4,5}};  
        int b[][]={{1,3,4},{3,4,5}};  

        
        int c[][]=new int[2][3];  

      
        for(int i=0;i<2;i++)
        {  
        for(int j=0;j<3;j++)
        {  
        c[i][j]=a[i][j]+b[i][j];  
        System.out.print(c[i][j]+" ");  
        }  
        System.out.println(); 
     
        
    }
}
}