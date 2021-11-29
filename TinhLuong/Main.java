package TinhLuong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = Integer.parseInt(sc.nextLine());
        List<PhongBan> phongBanList = new ArrayList<>();
        for(int i = 0; i < p; i++){
            phongBanList.add(new PhongBan(sc.next(), sc.nextLine().trim()));
        }
        int n = Integer.parseInt(sc.nextLine());
        List<NhanVien> nhanVienList = new ArrayList<>();
        NhanVien nv;
        for(int i = 0; i < n; i++){
            nv = new NhanVien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            for(PhongBan phongBan: phongBanList){
                if(nv.getMaPhong().equals(phongBan.getMa())){
                    nv.setTenPhong(phongBan);
                }
            }
            nhanVienList.add(nv);
        }
        for(NhanVien nhanVien: nhanVienList){
            System.out.println(nhanVien);
        }
    }
}
//2
//HC Hanh chinh
//KH Ke hoach Dau tu
//2
//C06HC
//Tran Binh Minh
//65
//25
//D03KH
//Le Hoa Binh
//59
//24