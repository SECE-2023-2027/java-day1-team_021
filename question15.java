import java.util.Scanner;

public class question15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input the third number : ");
        int num3 = scanner.nextInt();

        int rightmost1 = num1 % 10;
        int rightmost2 = num2 % 10;
        int rightmost3 = num3 % 10;

        boolean result = (rightmost1 == rightmost2) || (rightmost2 == rightmost3) || (rightmost1 == rightmost3);

        System.out.println("The result is: " + result);
    }
}
