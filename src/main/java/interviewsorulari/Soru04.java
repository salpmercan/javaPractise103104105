package interviewsorulari;

import java.util.Scanner;

public class Soru04 {
    //Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari toplayip, sonucu yazdiran bir program yaziniz
    //(Mrthod olusturarak yapiniz

    public static void main(String[] args) {

        System.out.println(toplama());
    }

    public static int toplama (){
        Scanner input= new Scanner(System.in);
        System.out.println("Ilk sayiyi giriniz");
        int a= input.nextInt();

        System.out.println("Ikinci sayiyi giriniz");
        int b= input.nextInt();

            int min =Math.min(a,b);
            int max= Math.max(a,b);
            int sum=0;

            for (int i=min; i<=max; i++){
                sum+=i;
            }
            return sum;
        }

        }






