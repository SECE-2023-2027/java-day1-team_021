import java.util.*;

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bin1 = sc.nextLine();
        String bin2 = sc.nextLine();
        int n1 = Integer.parseInt(bin1, 2);
        int n2 = Integer.parseInt(bin2, 2);
        int sum = n1 + n2;

        String res = Integer.toBinaryString(sum);
        System.out.print(res);
        sc.close();
    }
}
