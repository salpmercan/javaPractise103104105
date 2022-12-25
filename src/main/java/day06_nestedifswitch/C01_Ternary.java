package day06_nestedifswitch;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi =input.nextInt();

//        //Ternary ile cozum
//        String sonuc =  (sayi>0) ? (sayi>99 && sayi<1000)  ?  ("3 basamakli 0 dan buyuk sayi") :
//                        (sayi%2==0) ? ("3 basamakli olmayan cift sayi") : ("3 basamakli olmayan tek sayi") :
//                        "Lutfen sifirdan buyuk bir sayi giriniz";
//
//        System.out.println(sonuc);
//
//        //If Else ile cozumu

        if(sayi>0){
            if(sayi<1000 && sayi>99){
                System.out.println("3 basamakli pozitif sayi");
            } else if (sayi%2==0) {
                System.out.println("3 Basamakli olmayan cift sayi");
            }else System.out.println("3 Basamakli olmayan tek sayi");

        }else System.out.println("lutfen sifirdan buyuk pozitif bir tam sayi giriniz");
    }
}
