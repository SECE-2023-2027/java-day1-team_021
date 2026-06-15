import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuffer stbuff = new StringBuffer();
        while (num > 0) {
            stbuff.append(num % 8);
            num /= 8;
        }
        stbuff.reverse();
        System.out.print(stbuff.toString());
        sc.close();
    }
}
