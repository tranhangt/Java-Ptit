package BangThuNhapCuaGiaoVien;

public class GiaoVien {
    private String ma, ten, chucVu;
    private int luongCB, heSo, phuCap, thuNhap;

    public GiaoVien(String ma, String ten, int luongCB) {
        this.ma = ma;
        this.ten = ten;
        this.luongCB = luongCB;
        this.heSo = Integer.parseInt(ma.substring(2));
        this.chucVu = ma.substring(0, 2);
        this.phuCap = phuCap(chucVu);
        this.thuNhap = heSo * luongCB + phuCap;
    }

    public String getChucVu() {
        return chucVu;
    }

    private int phuCap(String s){
        if(s.equals("HT")) return 2000000;
        if(s.equals("HP")) return 900000;
        return 500000;
    }

    @Override
    public String toString(){
        return ma + " " + ten + " " + heSo + " " + phuCap + " " + thuNhap;
    }
}
