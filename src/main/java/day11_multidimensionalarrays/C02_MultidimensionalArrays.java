package day11_multidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class C02_MultidimensionalArrays {

    public static void main(String[] args) {

        //Kullanıcının girdigi bir array'in en buyuk elemani ile
        //en kucuk elemanının  farkını bulan kodu yaziniz

        Scanner input=new Scanner(System.in);
        System.out.println("Array in uzunlugunu giriniz ");
        int uzunluk=input.nextInt();
        int arr[]= new int[uzunluk];
        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("Array in "+(i+1)+"elemanini giriniz");
            arr[i]=input.nextInt();

        }
        Arrays.sort(arr);
        System.out.println("Array in en buyuk elemani :"+arr[uzunluk-1]);//Arrayin en buyuk elemani
        System.out.println("Array in en kucuk elemani :"+arr[0]);//Arrayin en kucuk elemani
        System.out.println(arr[uzunluk-1]-arr[0]);

    }
}
