package LietKeNhanVienTheoChucVu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<NhanVien> ds = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            ds.add(new NhanVien(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        String cv = sc.nextLine();
        for(NhanVien nv: ds){
            if(nv.getChucVu().equals(cv)){
                System.out.println(nv);
            }
        }
    }
}