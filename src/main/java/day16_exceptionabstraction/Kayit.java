package day16_exceptionabstraction;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit extends Runner{

    static List<String>listKullaniciId=new ArrayList<>();

    static List<Integer>listKullaniciSaniye=new ArrayList<>();

    static Scanner input=new Scanner(System.in);

    static int counter=0;


    public void kayit(){

        String kullaniciId="";
        System.out.println("Lutfen kullanici ID giriniz");
        kullaniciId=input.nextLine();

        int kullaniciSaniye= LocalDateTime.now().getSecond();// 0 ile 60 saniye arasinda bir sure verir

        System.out.println("Kullanici saniye"+ kullaniciSaniye);

        listKullaniciId.add(kullaniciId);
        listKullaniciSaniye.add(kullaniciSaniye);

        tamamMidevamMi();

        }


    //Kayit methodunun body si

    private void tamamMidevamMi() {
        String tamamMidevamMi="";

        do {
            System.out.println("Baska kayit var mi (E/H)");

            tamamMidevamMi =input.next();

            if (tamamMidevamMi.equalsIgnoreCase("e")){

                kayit();
            } else if (tamamMidevamMi.equalsIgnoreCase("h")) {
                System.out.println("Gule gule");
                break;
            }

        }while (!tamamMidevamMi.equalsIgnoreCase("e") && !tamamMidevamMi.equalsIgnoreCase("h"));

            counter++;

            if (counter==1){//Bunu yazdirmazsak array i tekrar tekrar yazdirir

                SansliKullanici snslKlnc =new SansliKullanici();

                snslKlnc.sansliKullaniciYazdir(listKullaniciId,listKullaniciSaniye);

            }

    }


}
