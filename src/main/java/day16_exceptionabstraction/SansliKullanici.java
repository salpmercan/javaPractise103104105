package day16_exceptionabstraction;

import java.util.ArrayList;
import java.util.List;

public class SansliKullanici {
    public void sansliKullaniciYazdir(List<String> listKullaniciId, List<Integer> listKullaniciSaniye) {
        
        List<String> sansliKullaniciIndexes =new ArrayList<>();

        for (int i = 0; i <listKullaniciSaniye.size() ; i++) {

            if (listKullaniciSaniye.get(i) < 10) {

                sansliKullaniciIndexes.add(listKullaniciId.get(i));

            }

        }
        System.out.println("Sansli kullanicilar");
        System.out.println(sansliKullaniciIndexes);
    }
}
