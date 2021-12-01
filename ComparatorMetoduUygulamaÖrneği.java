/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparatormetoduuygulamaörneği;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Sena Özkara
 */
public class ComparatorMetoduUygulamaÖrneği {

    /**
     * @param args the command line arguments
     */
    //static <T> void sort(T[] a, Comparator< super T> c); Metodu Uygulama Örneği -1
    class Student {

        int rollno;
        String name, address;

        // Constructor
        public Student(int rollno, String name,
                String address) {
            this.rollno = rollno;
            this.name = name;
            this.address = address;
        }

        // Used to print student details in main()
        public String toString() {
            return this.rollno + " "
                    + this.name + " "
                    + this.address;
        }
    }

    class Sortbyroll implements Comparator<Student> {
        // Used for sorting in ascending order of
        // roll number

        public int compare(Student a, Student b) {
            return a.rollno - b.rollno;
        }
    }

    //static <T> void sort(T[] a, Comparator< super T> c); Metodu Uygulama Örneği -1
    public static void main(String[] args) {

        //static <T> void sort(T[] a, Comparator< super T> c); Metodu Uygulama Örneği -1
        System.out.println("\n ********************** static <T> void sort(T[] a, Comparator< super T> c); Metodu Uygulama Örneği -1 ****************************** \n");

        Student[] arr = {new Student(111, "bbbb", "london"),
            new Student(131, "aaaa", "nyc"),
            new Student(121, "cccc", "jaipur")};

        System.out.println("Sırasız");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Arrays.sort(arr, 1, 2, new Sortbyroll());

        System.out.println("\nRollere göre sıralandı");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("\n ********************** static <T> void sort(T[] a, Comparator< super T> c); Metodu Uygulama Örneği -1 ****************************** \n");

    }
}

}
