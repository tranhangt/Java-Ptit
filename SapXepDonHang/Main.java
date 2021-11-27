package SapXepDonHang;

import java.util.ArrayList;
import java.util.Collections;
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
        Collections.sort(ds);
        for(DonHang dh: ds){
            System.out.println(dh);
        }
    }
}
