import java.util.Scanner;

public class SoChinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int so, a;
        while (t-- > 0){
            so = Integer.parseInt(sc.nextLine());
            a = (int) Math.sqrt(so);
            if(a * a == so){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
