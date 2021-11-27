package LietKeNhapXuatHangTheoNhom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<SanPham> ds = new ArrayList<>();
        while(t-- > 0){
            ds.add(new SanPham(sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(ds);
        String nhom = sc.nextLine();
        for(SanPham sp: ds){
            if(String.valueOf(sp.getDau()).equals(nhom)){
                System.out.println(sp);
            }
        }
    }
}
