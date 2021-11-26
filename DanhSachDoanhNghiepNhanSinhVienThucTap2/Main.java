package DanhSachDoanhNghiepNhanSinhVienThucTap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<DoanhNghiep> ds = new ArrayList<>();
        while(t-- >0){
            ds.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(ds);
        int q = Integer.parseInt(sc.nextLine());
        int a, b;
        while(q-- > 0){
            a = Integer.parseInt(sc.next());
            b = Integer.parseInt(sc.next());
            sc.nextLine();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a +" DEN " + b +" SINH VIEN:");
            for(DoanhNghiep dn: ds){
                if(dn.getSlg() <= b && dn.getSlg() >= a){
                    System.out.println(dn);
                }
            }
        }

    }
}
