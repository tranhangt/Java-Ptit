package XepHangVanDongVien1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<VanDongVien> sx = new ArrayList<>();
        VanDongVien vdv;
        for(int i = 1; i <= t; i++){
            vdv = new VanDongVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            sx.add(vdv);
        }
        Collections.sort(sx);
        int xh = 1;
        sx.get(0).setXepHang(xh);
        for(int i = 1; i < t; i++){
            if(sx.get(i).getKetQua() > sx.get(i - 1).getKetQua()){
                xh = i + 1;
            }
            sx.get(i).setXepHang(xh);
        }
        for (VanDongVien v: sx){
            System.out.println(v);
        }
    }
}
//3
//Nguyen Van Thanh
//20/03/1990
//07:00:00
//07:10:01
//Nguyen Hoa Binh
//01/10/1993
//07:02:00
//07:11:20
//Le Thanh Van
//15/03/1998
//07:05:00
//07:15:30