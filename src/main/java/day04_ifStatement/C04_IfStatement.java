package day04_ifStatement;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {

        /*
 Print "Lutfen is unvaninizi girin
 jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
 Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
 Eger jobTitle  qa ise print is unvaniniz Quality Analyst
 test data: qa ise print Quality Analyst
 dev ise print Developer
 ba ise print Business Analyst
 pm ise print Project Manager
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen is unvaninizi giriniz");
        String jobTitle = input.nextLine().toLowerCase();

        if (jobTitle.equals("qa")){
            System.out.println("Is unvanvani Quality Analyst");
        } else if (jobTitle.equals("dev")) {
            System.out.println("Is unvanvani developer");
        } else if (jobTitle.equals("ba")) {
            System.out.println("Is unvanvani Business Analyst");
        } else if (jobTitle.equals("pm")) {
            System.out.println("Is unvanvani Project Manager");
        }
    }
}
