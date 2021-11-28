package DiemDanh2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> dssv = new ArrayList<>();
        List<DanhSachDiemDanh> dsdd = new ArrayList<>();
        for(int i = 0; i < t; i++){
            dssv.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        DanhSachDiemDanh diemDanh;
        for(int i = 0; i < t; i++){
            diemDanh = new DanhSachDiemDanh(sc.next(), sc.next());
            sc.nextLine();
            for(SinhVien sv: dssv){
                if(sv.getMa().equals(diemDanh.getMa())){
                    diemDanh.setSv(sv);
                }
            }
            dsdd.add(diemDanh);
        }
        String lop = sc.nextLine();
        for(SinhVien sv: dssv){
            if(sv.getLop().equals(lop)){
                for (DanhSachDiemDanh dd : dsdd) {
                    if (dd.getMa().equals(sv.getMa())) {
                        System.out.println(dd);
                        break;
                    }
                }
            }
        }
    }
}
//3
//B19DCCN999
//Le Cong Minh
//D19CQAT02-B
//B19DCCN998
//Tran Truong Giang
//D19CQAT02-B
//B19DCCN997
//Nguyen Tuan Anh
//D19CQCN04-B
//B19DCCN998 xxxmxmmvmx
//B19DCCN997 xmxmxxxvxx
//B19DCCN999 xvxmxmmvvm