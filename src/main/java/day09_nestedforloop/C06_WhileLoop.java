package day09_nestedforloop;

import java.util.Scanner;

public class C06_WhileLoop {

    public static void main(String[] args) {

        // Kullanicidn toplanmak uzere sayilar isteyin
        //Sayi adedi 10 u gecerse yada toplami 500 u gecerse
        // "Bu kadar sayi yeter.... adet sayi girdiniz, toplami ...... "yazdirin

        Scanner input =new Scanner(System.in);

        int sayi=0;
        int toplam=0;
        int sayac=0;

        while (sayac<11 && toplam<500){

            System.out.println("Lutfen toplanmak uzere sayi giriniz");
            sayi=input.nextInt();
            toplam+=sayi;
            sayac++;

        }
        if (toplam>500){
            System.out.println(sayac+ " adet sayi girdiniz.Toplami "+ toplam);
        }else System.out.println("Bu kadar sayi yeter. "+ sayac + "adet sayi girdiniz.Toplami "+ toplam);




    }


}
