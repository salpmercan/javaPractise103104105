package interviewsorulari;

public class Soru02 {
    public static void main(String[] args) {

        // Kullanicidan bir String aliniz. palindrom olup olmadigini kontrol eden bir kod yaziniz

        String str= "anna";
        String ters= "";

        for (int i=str.length()-1; i>=0; i--){

            ters+=str.charAt(i);
        }
        if (str.equals(ters)){
            System.out.println("Polindrom");
        }else {
            System.out.println("Polindrom degil");
        }

        //2.YOL

        StringBuilder strb= new StringBuilder(str);
        String tersstrb=strb.reverse().toString();

        if (strb.equals(tersstrb)){
            System.out.println("Polindrom");
        }else {
            System.out.println("Degil");
        }
    }
}
