package unit.pkg1;
import java.util.Scanner;

public class Unit1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();
        
        System.out.println("Natural numbers up to " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}
