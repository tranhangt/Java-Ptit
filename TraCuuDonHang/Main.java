package TraCuuDonHang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<DonHang> ds = new ArrayList<>();
        while(t-- > 0){
            ds.add(new DonHang(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        for(DonHang dh: ds){
            System.out.println(dh);
        }
    }
}
