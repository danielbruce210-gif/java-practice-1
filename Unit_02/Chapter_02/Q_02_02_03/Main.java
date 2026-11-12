package Unit_02.Chapter_02.Q_02_02_03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scannerObj = new Scanner(System.in);
    int userNum = Integer.parseInt(scannerObj.nextLine());

    if (userNum >= 80 && userNum <= 300){
        System.out.println("healthy");

    } else if (userNum >= 60 && userNum <= 79){
        System.out.println("bloody nose");

    } else if (userNum >= 40 && userNum <= 59){
        System.out.println("face swollen");

    } else if (userNum >= 20 && userNum <= 39){
        System.out.println("eyes bloodshot, face bleeding");

    } else if (userNum >= 1 && userNum <= 19){
        System.out.println("even more blood");

    } else if (userNum == 0){
        System.out.println("eyes closed. Game Over");
    }
    
    scannerObj.close();
    }
}