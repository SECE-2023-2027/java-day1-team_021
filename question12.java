import java.util.Scanner;

public class question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        System.out.println("The ASCII value of " + ch + " is :" + (int) ch);
    }
}
