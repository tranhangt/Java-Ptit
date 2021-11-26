package DanhSachThucTap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> ds = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            ds.add(new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(ds);
        int q = Integer.parseInt(sc.nextLine());
        String dn;
        while(q-- > 0){
            dn = sc.nextLine();
            for(SinhVien sv: ds){
                if(sv.getDoanhNghiep().equals(dn)){
                    System.out.println(sv);
                }
            }
        }
    }
}
