package ChuanHoaDanhSachSinhVien;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<SInhVien> ds = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            ds.add(new SInhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine())));
        }
        for(SInhVien sv: ds){
            System.out.println(sv);
        }
    }
}
//1
//nGuyEn  vaN    biNH
//D20CQCN01-B
//2/12/2002
//3.1
