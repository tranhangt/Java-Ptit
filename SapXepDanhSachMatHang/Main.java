package SapXepDanhSachMatHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<MatHang> ds = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            ds.add(new MatHang(i, sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(ds);
        for(MatHang mh: ds){
            System.out.println(mh);
        }
    }
}
//3
//May tinh SONY VAIO
//Dien tu
//16400
//17699
//Tu lanh Side by Side
//Dien lanh
//18300
//25999
//Banh Chocopie
//Tieu dung
//27.5
//37