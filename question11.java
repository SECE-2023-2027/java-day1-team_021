import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int letters = 0, spaces = 0, numbers = 0, others = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                letters++;
            } else if (Character.isSpace(c)) {
                spaces++;
            } else if (Character.isDigit(c)) {
                numbers++;
            } else {
                others++;
            }
        }

        System.out.println("The string is : " + str);
        System.out.println("letter: " + letters);
        System.out.println("space: " + spaces);
        System.out.println("number: " + numbers);
        System.out.println("other: " + others);
    }
}
