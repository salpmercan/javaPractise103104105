package day03_ifStatement;

public class C02_AsciiDegerleri {
    public static void main(String[] args) {

        char harf='a';
        char space = ' ';
        System.out.println("Space tusunun Ascii degeri :"+(space+0));
        char dolar = '$';
        System.out.println("Dolar sembolunun Ascii degeri :"+(dolar+0));

        int harf3='m';
        System.out.println("m nin Ascii degeri:"+harf3);
        // Char larda Java Char karaktere Int de atayabiliriz
        // Cunku Char larin bir resim degeri birda Ascii degeri vardir
        //Bu nedenle Charlarin Ascii degerlerini bu sekilde yazdirabiliriz


        byte b1= 12;
        byte b2=-125;

        System.out.println("b1>b2 ==> "+(b1>b2));


        float f1 =2.45645f;
        float f2 =5.86786F;
        System.out.println("f1>f2 ==> "+(f1>f2));

        long lng1= 11111111111111L;
        System.out.println("b1<lng1==>"+(b1<lng1));

    }
}
