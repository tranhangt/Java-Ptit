package SapXepBangTinhCong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<NhanVien> ds = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            ds.add(new NhanVien(i, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine()));
        }
        Collections.sort(ds);
        for(NhanVien nv: ds){
            System.out.println(nv);
        }
    }
}
