package Unit_02.Chapter_02.Q_02_02_08;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the three side lengths
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();

        if (s1 + s2 <= s3 || s1 + s3 <= s2 || s2 + s3 <= s1) {
            System.out.println("not a triangle");

        } else if (s1 == s2 && s2 == s3) {
            System.out.println("equilateral");

        } else if (s1 == s2 || s1 == s3 || s2 == s3) {
            System.out.println("isosceles");
            
        } else {
            System.out.println("scalene");
        }

        scanner.close();
    }
}