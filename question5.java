import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuffer stbuff = new StringBuffer();
        while (num > 0) {
            stbuff.append(num % 2);
            num >>= 1;
        }
        stbuff.reverse();
        System.out.print(stbuff.toString());
        sc.close();
    }
}
