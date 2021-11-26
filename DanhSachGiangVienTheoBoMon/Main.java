package DanhSachGiangVienTheoBoMon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<GiangVien> ds = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            ds.add(new GiangVien(i, sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        String boMon;
        while(q-- > 0){
            boMon = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN BO MON " + tat(boMon) + ":");
            for(GiangVien gv: ds){
                if(gv.getBoMon().equals(boMon)){
                    System.out.println(gv);
                }
            }
        }
    }
    public static String tat(String s){
        String tmp[] = s.split(" ");
        String res = "";
        for(int i = 0; i < tmp.length; i++){
            res += tmp[i].toUpperCase().charAt(0);
        }
        return res;
    }
}
