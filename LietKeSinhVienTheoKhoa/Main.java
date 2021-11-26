package LietKeSinhVienTheoKhoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> ds = new ArrayList<>();
        while(t-- > 0){
            ds.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        String lop;
        while(q-- > 0){
            lop = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + lop + ":");
            for (SinhVien sv : ds) {
                if (sv.getKhoa().equals(lop)) {
                    System.out.println(sv);
                }
            }
        }
    }
}
