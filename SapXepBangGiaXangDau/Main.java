package SapXepBangGiaXangDau;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<DonHang> ds = new ArrayList<>();
        while (t-- > 0){
            ds.add(new DonHang(sc.next(), Long.parseLong(sc.next())));
            sc.nextLine();
        }
        Collections.sort(ds);
        for(DonHang dh: ds){
            System.out.println(dh);
        }
    }
}
//3
//N89BP 4500
//D00BP 3500
//X92TN 2600