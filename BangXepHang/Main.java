package BangXepHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> ds = new ArrayList<>();
        while (t-- > 0){
            ds.add(new SinhVien(sc.nextLine(), Integer.parseInt(sc.next()), Integer.parseInt(sc.next())));
            sc.nextLine();
        }
        Collections.sort(ds);
        for(SinhVien sv: ds){
            System.out.println(sv);
        }
    }
}
