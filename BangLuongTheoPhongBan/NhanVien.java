package BangLuongTheoPhongBan;

public class NhanVien {
    private PhongBan tenPhong;
    private String ma, ten, maPhong;
    private int luongCB, cong, heSo, soNam, luong;

    public NhanVien(String ma, String ten, int luongCB, int cong) {
        this.ma = ma;
        this.ten = ten;
        this.luongCB = luongCB;
        this.cong = cong;
        this.maPhong = ma.substring(3);
        this.soNam = Integer.parseInt(ma.substring(1, 3));
        this.heSo = heSo(String.valueOf(ma.charAt(0)));
        this.luong = luongCB * cong * heSo * 1000;
    }

    public void setTenPhong(PhongBan tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getMaPhong() {
        return maPhong;
    }

    private int heSo(String s){
        if(s.equals("A")){
            if(soNam >= 1 && soNam <= 3) return 10;
            if(soNam >= 4 && soNam <= 8) return 12;
            if(soNam >= 9 && soNam <= 15) return 14;
            return 20;
        }
        if(s.equals("B")){
            if(soNam >= 1 && soNam <= 3) return 10;
            if(soNam >= 4 && soNam <= 8) return 11;
            if(soNam >= 9 && soNam <= 15) return 13;
            return 16;
        }
        if(s.equals("C")){
            if(soNam >= 1 && soNam <= 3) return 9;
            if(soNam >= 4 && soNam <= 8) return 10;
            if(soNam >= 9 && soNam <= 15) return 12;
            return 14;
        }
        if(soNam >= 1 && soNam <= 3) return 8;
        if(soNam >= 4 && soNam <= 8) return 9;
        if(soNam >= 9 && soNam <= 15) return 11;
        return 13;
    }

    @Override
    public String toString(){
        return ma + " " + ten + " " + luong;
    }

}
