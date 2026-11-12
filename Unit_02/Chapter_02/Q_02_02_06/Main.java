package Unit_02.Chapter_02.Q_02_02_06;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scannerObj = new Scanner(System.in);
    int userNum = Integer.parseInt(scannerObj.nextLine());

    if (userNum <= 58523){
        System.out.println("1");

    } else if (userNum >= 58523.01 && userNum <= 117045){
        System.out.println("2");

    } else if (userNum >= 117045.01 && userNum <= 181440){
        System.out.println("3");

    } else if (userNum >= 181440.01 && userNum <= 258482){
        System.out.println("4");

    } else if (userNum >= 258482.01 && userNum){
        System.out.println("5");

    scannerObj.close();
        }
    }   
 }
