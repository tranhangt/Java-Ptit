package BangKeNhapKhoSapXepTheoChietKhau;

public class LoHang implements Comparable<LoHang>{
    private String ma, ten, maH;
    private long slg, donGia, tongTien, chietKhau, thanhTien;

    public LoHang(String ten, long slg, long donGia) {
        this.ten = ten;
        this.slg = slg;
        this.donGia = donGia;
        this.ma = maLo(ten);
        this.tongTien = slg * donGia;
        this.chietKhau = tienChietKhau();
        this.thanhTien = tongTien - chietKhau;
        this.maH = maLo(ten);
    }

    public String getMaH() {
        return maH;
    }

    public void setMa(int ma) {
        this.ma = this.ma + String.format("%02d", ma);
    }

    private String maLo(String s){
        String tmp[] = s.split(" ");
        String res = "" + tmp[0].toUpperCase().charAt(0) + tmp[1].toUpperCase().charAt(0);
        return res;
    }

    private long tienChietKhau(){
        if(slg > 10) return tongTien / 100 * 5;
        if(slg <= 10 && slg >= 8) return tongTien / 100 * 2;
        if(slg < 8 && slg >= 5) return tongTien / 100 * 1;
        return 0;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + chietKhau + " " + thanhTien;
    }

    @Override
    public int compareTo(LoHang o) {
        if(chietKhau < o.chietKhau) return 1;
        if(chietKhau > o.chietKhau) return -1;
        return 0;
    }
}
