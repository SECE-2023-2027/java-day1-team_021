import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float rad = scanner.nextFloat();
        float area = (float) (3.14 * rad * rad);
        System.out.print("Area of Circle: " + area);
        float perimeter = (float) (2 * 3.14 * rad);
        System.out.print("\nPerimeter of Circle: " + perimeter);
        scanner.close();
    }
}
