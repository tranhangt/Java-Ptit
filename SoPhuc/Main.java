package SoPhuc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            SoPhuc a = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc b = new SoPhuc(sc.nextInt(), sc.nextInt());
            System.out.print((a.cong(b)).nhan(a) + ", ");
            System.out.println(a.cong(b).nhan(a.cong(b)));
        }
    }
}
