package day07_stringmanipulations;

import java.util.Scanner;

public class C06_StringManipulationsLenght {
    public static void main(String[] args) {

        /**
         * Length()
         * length() method'u girilen String'in uzunlugunu verir
         * butun karakterlerin adedi (bosluklar da birer karakterdir)
         */
        String cumle="Bugun hava yagmurlu";
        System.out.println(cumle.length());// 19

        String str1=" ";
        System.out.println(str1.length());// 1

        String str2="";
        System.out.println(str1.length());// 0

        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz\n isim:");
        String isim=input.next();
        String soyIsim=input.next();


        if (isim.length()>soyIsim.length()){
            System.out.println("Isminiz soyisminizden uzun");
        } else if (isim.length()==soyIsim.length()) {
            System.out.println("isminiz soyisminizle ayni uzunlukta");

        }else System.out.println("soyisminiz isminizden uzun");

        //Kullanicidan 4 harfli bir kelime isteyin
        //ve girilen kelimeyi tersten yazdirin

        Scanner input2=new Scanner(System.in);
        System.out.println("4 harfli bir kelime girin");
        String kelime =input.next();
        System.out.println(kelime.length());
        if (kelime.length()==4){
            char bir= kelime.charAt(0);
            char iki= kelime.charAt(1);
            char uc= kelime.charAt(2);
            char dort= kelime.charAt(3);
            System.out.println("Tersten yazilmis hali="+ dort+uc+iki+bir);
        } else if (kelime.length()>4) {
            System.out.println("Girdiginiz kelime dort karakterden fazla");
        } else if (kelime.length()<4) {
            System.out.println("Girdiginiz kelime dort karakterden az");
        }


    }
}
