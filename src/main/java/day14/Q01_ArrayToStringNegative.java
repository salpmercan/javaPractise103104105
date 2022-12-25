package day14;

import java.util.Arrays;

public class Q01_ArrayToStringNegative {
    public static void main(String[] args) {

        /*
      Array olarak verilen bir cümleyi String olarak negatif anlamıyla yazdıran bir kod yazınız.
      Input:
      String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
      Output:
      String output ="JavaIsNOTDifficult";
       */

        String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
        String str="";
        for (String i :arr) {
            str+=i;
        }
        System.out.println(Arrays.toString(arr));

        str=str.replace("Is", "IsNOT");
        System.out.println("str = " + str);
    }
}
