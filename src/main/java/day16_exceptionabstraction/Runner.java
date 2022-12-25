package day16_exceptionabstraction;

import static day16_exceptionabstraction.Kayit.counter;

public class Runner {
    public static void main(String[] args) {

        Kayit obj =new Kayit();

        obj.kayit();

        System.out.println(counter+ "kez dogru kullanici girisi yapildi");



    }
}
