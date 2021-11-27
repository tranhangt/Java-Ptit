package LietKeNhanVienTheoChucVu;

public class NhanVien {
    private String ma, ten, chucVu;
    private int luongCB, cong, thuong, luongChinh, ung, conLai;

    public NhanVien(int ma, String ten, String chucVu, int luongCB, int cong) {
        this.ma = "NV" + String.format("%02d", ma);
        this.ten = ten;
        this.chucVu = chucVu;
        this.luongCB = luongCB;
        this.cong = cong;
        this.thuong = thuong(chucVu);
        this.luongChinh = luongCB * cong;
        this.ung = ung();
        this.conLai = thuNhap() - ung;
    }

    public String getChucVu() {
        return chucVu;
    }

    private int thuong(String s){
        if(s.equals("GD")) return 500;
        if(s.equals("PGD")) return 400;
        if(s.equals("TP")) return 300;
        if(s.equals("KT")) return 250;
        return 100;
    }

    private int thuNhap(){
        return luongCB * cong + thuong;
    }
    private int ung(){
        float tmp = thuNhap() * 2 / 3;
        if(tmp < 25000){
            return Math.round(tmp / 1000) * 1000;
        }
        return 25000;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + thuong + " " + luongChinh + " " + ung + " " + conLai;
    }
}
