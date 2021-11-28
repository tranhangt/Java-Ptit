package BangKeTienLuong;

import java.util.ArrayList;
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
        int sum = 0;
        for(NhanVien nv: ds){
            sum += nv.getTong();
            System.out.println(nv);
        }
        System.out.println("Tong chi phi tien luong: " + sum);
    }
}
