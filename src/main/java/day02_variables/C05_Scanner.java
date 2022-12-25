package day02_variables;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("5 basamakli bir sayi giriniz");
        int num= input.nextInt();
        int ilkIkirkm = num/1000;
        int ilkIkiTop = (ilkIkirkm%10)+ (ilkIkirkm/10);
        System.out.println("ilkIkiTop=" + ilkIkiTop);
        int sonIki = num%100;
        int sonIkiTop= (sonIki%10) + (sonIki/10);
        System.out.println("Genel Toplam= " + (ilkIkiTop+sonIkiTop));

    }
}
