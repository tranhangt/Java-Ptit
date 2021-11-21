import java.math.BigInteger;
import java.util.Scanner;

public class ChiaHet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a, b;
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            a = sc.nextBigInteger();
            b = sc.nextBigInteger();
            if(a.mod(b).compareTo(new BigInteger("0")) == 0 || b.mod(a).compareTo(new BigInteger("0")) == 0){
                System.out.println("YES");
            }
            else System.out.println("NO");

        }
    }
}
