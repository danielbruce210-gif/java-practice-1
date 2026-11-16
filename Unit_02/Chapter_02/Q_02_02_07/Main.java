package Unit_02.Chapter_02.Q_02_02_07;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int userNum = scannerObj.nextInt();
        
        boolean divby100 = userNum % 100 == 0;
        boolean divby400 = userNum % 400 == 0;
        boolean divby4 = userNum % 4 == 0;
       
        if (divby400 && divby100) {
            System.out.println("leap year");
        } else if (divby4 && divby100) {
            System.out.println("not a leap year");
        } else if (divby4) {
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }

        scannerObj.close();
    }
}
