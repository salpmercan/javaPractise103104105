package day07_stringmanipulations;

import java.util.Scanner;

public class C05_StringManipulationsIsEmpty {
    public static void main(String[] args) {

        String str1="Hi";
        System.out.println(str1.isEmpty());//Dolu oldugu icin false doner

        String str2= "";
        System.out.println(str2.isEmpty());//true doner

        String str3=" ";
        System.out.println(str3.isEmpty());//false space her zaman Java icin bir karakterdir

        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        String str4= "Kelime";
        if (str4.isEmpty()) {
            System.out.println("Bosluk var");
        }else System.out.println("Bosluk yok");

    }
}
