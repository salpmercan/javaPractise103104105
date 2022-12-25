package day13_overridingoverloadingstatickeywords;

public class C01_Varargs {

    public static void main(String[] args) {

        //Verilen sayilardan ilki haric tum sayilari toplayip ilk sayiyla carpan bir method olusturunuz

        int sayi1=5;
        int sayi2=7;
        int sayi3=2;
        int sayi4=4;
        int sayi5=9;

        toplam(sayi1,sayi2,sayi3,sayi4,sayi5);

    }//main methodun altina ekledi

    private static void toplam(int sayi1, int ...toplanacakSayi) {

        int toplam=0;

        for(int w:toplanacakSayi){
            toplam+=w;
        }
        System.out.println("Toplam "+toplam);//22
        System.out.println("Toplam ile ilk sayinin carpimi "+(toplam*sayi1));
    }
}
