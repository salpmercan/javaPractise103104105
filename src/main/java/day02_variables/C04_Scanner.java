package day02_variables;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
/*
        Scanner scan =new Scanner(System.in);
        System.out.println("4 basamakli bir sayi girin");
        int sayi = scan.nextInt();
        int sonRakam = sayi%10;
        int ilkRakam = sayi/1000;
        System.out.println("Toplam=" +(sonRakam+ilkRakam));
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();
        int birler = sayi%10;
        System.out.println("birler basamagi"+ birler);


    }
}
