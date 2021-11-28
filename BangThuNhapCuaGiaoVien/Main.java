package BangThuNhapCuaGiaoVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<GiaoVien> ds = new ArrayList<>();
        int ht = 0, hp = 0;
        GiaoVien a;
        while (t-- > 0){
            a = new GiaoVien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            if(a.getChucVu().equals("HT")){
                ht++;
                if(ht <= 1) ds.add(a);
            }
            else if(a.getChucVu().equals("HP")){
                hp++;
                if(hp <= 2) ds.add(a);
            }
            else ds.add(a);
        }
        for(GiaoVien gv: ds){
            System.out.println(gv);
        }
    }
}
//3
//GV01
//Nguyen Kim Loan
//1420000
//HT05
//Hoang Thanh Tuan
//1780000
//GV02
//Tran Binh Nguyen
//1468000