package interviewsorulari;

import java.util.Scanner;

public class Soru01 {
    public static void main(String[] args) {
        /*

        Kullanicidan 100'den kucuk bir tamsayi isteyin.
        1'den baslayarak girilen sayiya kadar tum sayilari yazdirin.
        Ancak;
        -Sayi 3'un kati ise sayi yerine "Java" yazdirin.
                -Sayi 5'in kati ise sayi yerine "Guzeldir" yazdirin.
                -Sayi hem 3'un hem 5'in kati ise sayi yerine "Java Guzeldir"yazdirin.
        */

        Scanner input= new Scanner(System.in);
        System.out.println("Yuzden kucuk sayi giriniz");
        int sayi =input.nextInt();

        for (int i=1; i<=sayi; i++){
            if (i%3==0 && i%5==0){
                System.out.print("Java guzeldir");
            } else if (i%3==0) {
                System.out.print("Java");
            } else if (i%5==0) {
                System.out.print("Guzeldir");
            }else {
                System.out.print(i+ " ");
            }


        }

        System.out.println();

        //// Kullanicidan bir String isteyin ve Stringi tersten yazin

        Scanner input1= new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String str= input1.nextLine();
        String ters="";

        int i= str.length()-1;

        while (i>=0){

            ters +=str.charAt(i);
            i--;
        }
        System.out.println(ters);

      // 2.Yol
        StringBuilder strb=new StringBuilder(str);
        String ters2= strb.reverse().toString();
        System.out.println(ters2);
    }
}
