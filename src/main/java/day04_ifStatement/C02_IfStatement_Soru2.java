package day04_ifStatement;

import java.util.Scanner;

public class C02_IfStatement_Soru2 {
    public static void main(String[] args) {

         /*
    Ogrenci asagidaki gibi notlar aldiginda karsisindaki degerleri yazdiran bir kod yaziniz
                 not hesaplayici
              90 ~100 => A  Cok Iyi
              80 ~ 89 => B  Iyi
              70 ~ 79 => C  Orta
              60 ~ 69 => D  Gecer
              0 ~ 59  => F  Zayif
   */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen aldiginiz notu giriniz");
        int not =80;
        if (not>=90 && not<=100){
            System.out.println("Notunuz A cok iyi");
        } else if (not<90 && not>=80) {
            System.out.println("Notunuz B iyi");

        } else if (not<80 && not>=70) {
            System.out.println("Notunuz C Orta");

        } else if (not<70 && not>=60) {
            System.out.println("Notunuz D Gecer");

        } else{
            System.out.println("Notunuz F Zayif");

        }
    }
}
