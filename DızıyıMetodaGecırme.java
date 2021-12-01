/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dızıyımetodagecırme;

import static dızıyımetodagecırme.Testarray.min;

/**
 *
 * @author Sena Özkara
 */
class Testarray
{
    static void min (int array[])
    {
        int min=array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (min>array[i])
            {
              min=array[i];  
            }
   
        }
        System.out.println(min); 
}
    }
   
public class DızıyıMetodaGecırme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
      int a[]={33,3,4,5};
      min(a);
    }
    
}
