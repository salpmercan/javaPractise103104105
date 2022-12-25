package interviewsorulari;

import java.util.Scanner;

public class Soru03 {
    public static void main(String[] args) {

        // soru 4)    Kullanicidan baslangic , bitis ve artis miktarini alarak
        //                aradaki tum sayilari aralarina virgul koyarak yazdirin


        Scanner input=new Scanner(System.in);
        System.out.println("baslangic sayisini girin");
        int bas=input.nextInt();
        System.out.println("bitis sayisini girin");
        int bit=input.nextInt();
        System.out.println("artis miktarini girin");
        int art=input.nextInt();

        if(bas>bit){
            System.out.println("Lutfen once kucuk sayi giriniz");
        }else {
            for (int i=bas; i<=bit; i+=art){
                if (i==bit){
                    System.out.println(i+ " ");
                }else

                System.out.print(i+ ", ");

            }
        }

    }
}
