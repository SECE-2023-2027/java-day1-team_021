import java.util.Scanner;

public class question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
