import java.util.*;

public class question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin = sc.nextLine();
        int st = 0;
        int sum = 0;
        for (int i = bin.length() - 1; i >= 0; i--) {
            int pwr = 1 << st;
            int d = bin.charAt(i) - '0';
            sum += (d * pwr);
            st++;
        }
        System.out.print(sum);
        sc.close();
    }
}
