package day15_inheritanceencapsulation;

public class KumandaRunner {

    public static void main(String[] args) {

        Test tv= new Test(102.10,80.00,40.45);

        tv.gucDugmesi();//Kumandayla tv yi actik

        System.out.println(tv.kanalDegistirme(2));//frekans 45.23
        System.out.println(tv.sesAzaltma());//11
        System.out.println(tv.sesArttirma());//12


    }




}
