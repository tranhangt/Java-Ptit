package SapXepDanhSachGiangVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<GiangVien> ds = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            ds.add(new GiangVien(i, sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(ds);
        for(GiangVien gv: ds){
            System.out.println(gv);
        }
    }
}
