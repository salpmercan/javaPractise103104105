package interviewsorulari;

import java.util.Scanner;

public class Soru06 {

    //Fibonacci dizisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.

    //Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    //0-1-1-2-3-5-8-13-21-34....

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi=input.nextInt();

        int a=0;
        int b=1;
        int toplam=0;
        System.out.println(a+ " ");
        System.out.println(b+ " ");

        for (int i =1; i<=sayi; i++){
            toplam=a+b;
            a=b;
            b=toplam;
            if (toplam>sayi){
                break;
            }
            System.out.println(toplam+ " ");
        }






    }





}
