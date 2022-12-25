package day16_exceptionabstraction;


public class C01TryCatch {
    public static void main(String[] args) {


        // Verilen iki sayiyi birbirleri ile payda kismi birer azalacak sekilde 10 kez bolen kodu yaziniz
        // Sifir ile bolme sirasinda AritmetikException verecegi icin if else yada try catch blogu ile handle etmemiz gerekir




        int sayi1 = 100;
        int sayi2 = 5;


        int sayac = 1;
     /*   while (sayac<10){
            System.out.println(sayi1/sayi2);
            sayi2--;
            sayac++;
        }*/

        System.out.println("********IF ELSE ILE**********");

        while (sayac < 10) {
            if (sayi2 == 0) {
                System.out.println(" Islem yapillirken payda sifir oldu ");
            } else {
                System.out.println(sayi1 / sayi2);
            }
            sayi2--;
            sayac++;
        }
    }


}
