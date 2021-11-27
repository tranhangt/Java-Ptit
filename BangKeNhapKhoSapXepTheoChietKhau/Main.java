package BangKeNhapKhoSapXepTheoChietKhau;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<LoHang> ds = new ArrayList<>();
        LoHang lh = new LoHang(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
        lh.setMa(1);
        ds.add(lh);
        while (t-- > 1){
            lh = new LoHang(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            int a = 1;
            for(int i = 0; i < ds.size(); i++){
                if(lh.getMaH().equals(ds.get(i).getMaH())){
                    a++;
                }
            }
            lh.setMa(a);
            ds.add(lh);
        }
        Collections.sort(ds);
        for(LoHang l: ds){
            System.out.println(l);
        }
    }
}
