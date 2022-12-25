package day10_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Arrays {

    public static void main(String[] args) {

        /*
                INTERWIEW QUESTIONS
         Kullanicidan bir String aliniz.
         String'de var olan her character'in sayisini ekrana yazdiriniz.
         Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
                abaa   ==> a=3  b=1
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz...");
        String str = input.nextLine();

        //Bu tarz sorularda oncelikle verilen cumle yada kelimeyi split metoduyla parcalayalim
        //split
        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));//[a, l, i, c, a, n]

        //sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[a, a, c, i, l, n]
        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].equals(arr[i])) {
                counter++;//Ayni harflar ise

            } else {
                System.out.println(arr[i - 1] + " karakter sayisi" + (counter + 1));
                counter = 0;// farkli karaktere gectigi icin counteri sifirlamak icin
            }
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "karakterin sayisi " + (counter + 1));
            }


        }
    }
}