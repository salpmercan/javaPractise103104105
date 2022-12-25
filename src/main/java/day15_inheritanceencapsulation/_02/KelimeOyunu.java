package day15_inheritanceencapsulation._02;

import java.util.Scanner;

public class KelimeOyunu {

   static int oyuncu=1;
   static int puan1=0;
   static int puan2=0;
   static String kelime="";
   static String ekleme="";
   static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println(oyuncu + ".oyuncu bir kelime giriniz");
        kelime=input.next();//oyuncunun verdigi kelimeyi class level da hiclik olarak atamistik
        oyuncuDegistir();//Oyuncu degistirme methodu
        onaySor();

    }

    public static void onaySor() {
        System.out.println("Girilen kelime"+kelime);
        System.out.println(oyuncu+". oyuncu girilen kelimeyi kabul ediyormusun: \n 1:Evet \n 0 Hayir");
        int kabul=input.nextInt();
        if (kabul==1){//1 tercihi girilen kelimeyi kabul ettigini gosterir
            if(oyuncu==1){
                puan2+=kelime.length();
            }else
                puan1+=kelime.length();

            oyunaDevamEdecekMI();

        }else oyunuBitir(); //girilen kelimeyi kabul etmiyor
    }

    private static void oyunaDevamEdecekMI() {
        System.out.println(" Oyuna devam etmek istiyormusunuz 1: Evet 0: Hayir demek");
        int tercih=input.nextInt();
        if (tercih==1){
            kelimeEkle();
        }else {
            System.out.println("Oyun bitti");
            System.out.println("Havva Hanimin puani :"+ puan1);
            System.out.println("Goksel Beyin puani"+ puan2);

            if (puan1>puan2){
                System.out.println(" Kazanan Havva Hanim");
            }else if (puan2>puan1){
                System.out.println(" Kazanan Goksel Bey");
            }else
                System.out.println(" Oyun berabere");
        }
    }

    private static void kelimeEkle() {

        System.out.println("Eski kelimeye eklenecek oan String ifadeyi giriniz");
        ekleme=input.next();

        System.out.println("Yeni Stringi basami sona mi ekleyelim?\n 1:basa ekle 0: sona ekle");

        int tercih=input.nextInt();
        if (tercih==1){
            kelime=ekleme+kelime;
        }else
            kelime=kelime+ekleme;

        oyuncuDegistir();
        onaySor();


    }

    private static void oyunuBitir() {
        System.out.println("Oyunu "+oyuncu+" . oyuncu kazandi");
    }

    public  static void oyuncuDegistir() {
        if (oyuncu==1){
            oyuncu=2;
        }else
            oyuncu=1;
    }
}
