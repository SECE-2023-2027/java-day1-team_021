import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String digits = "0123456789ABCDEF";
        StringBuffer stbuff = new StringBuffer();
        while (num > 0) {
            stbuff.append(digits.charAt(num % 16));
            num /= 16;
        }
        stbuff.reverse();
        System.out.print(stbuff.toString());
        sc.close();
    }
}
