package Unit_02.Chapter_02.Q_02_02_05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scannerObj = new Scanner(System.in);
    int userNum = Integer.parseInt(scannerObj.nextLine());

    if (userNum == 1){
        System.out.println("Sunday");

    } else if (userNum == 2){
        System.out.println("Monday");

    } else if (userNum == 3){
        System.out.println("Tuesday");

    } else if (userNum == 4){
        System.out.println("Wednesday");

    } else if (userNum == 5){
        System.out.println("Thursday");

    } else if (userNum == 6){
        System.out.println("Friday");

    } else if (userNum == 7){
        System.out.println("Saturday");
    
    } else {
        System.out.println("invalid argument");
    }
    scannerObj.close();  
    }
}