import java.util.Scanner;

public class TongGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0, res = 1;
        for(int i = 1; i <= n; i++){
            res *= i;
            sum += res;
        }
        System.out.print(sum);
    }
}
