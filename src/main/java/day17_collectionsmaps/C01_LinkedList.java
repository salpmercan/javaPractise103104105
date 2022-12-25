package day17_collectionsmaps;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class C01_LinkedList {
    /*  TASK:
      Node'larin değereleri; "AYSE" "EMEL" "HARUN" "IREM" olan bir LinkedList olusturun
      Kullanicidan bir isim alin o isim LinkedList'de varsa silin ve kullaniciya
       "Bu isim LinkedList'de vardi ve silindi" diye mesaj verin
      Girilen isim yoksa "Bu isim LinkedList'de yok bu yuzden silinemedi" diye mesaj verin

 */

    public static void main(String[] args) {

        LinkedList<String> ll1=new LinkedList<>(Arrays.asList("AYSE","EMEL","HARUN", "IREM"));

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen isim giriniz");
        String isim=input.nextLine().toUpperCase();

        if (ll1.remove(isim)){
            System.out.println("Bu isim LinkedList'de vardi ve silindi");
            System.out.println("Silinmis hali ile liste"+ ll1);
        }else
            System.out.println("Bu isim LinkedList'de yok bu yuzden silinemedi");
    }
}
