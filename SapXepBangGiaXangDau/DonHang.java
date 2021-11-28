package SapXepBangGiaXangDau;

public class DonHang implements Comparable<DonHang> {
    private String ma, hang, ten;
    private long donGia, thue, slg, tong, thanhTien;

    public DonHang(String ma, long slg) {
        this.ma = ma;
        this.slg = slg;
        this.ten = String.valueOf(ma.charAt(0));
        this.donGia = donGia();
        this.tong = slg * donGia;
        this.hang = hang(ma.substring(ma.length() - 2));
        this.thue = thue();
        this.thanhTien = thue + tong;
    }
    private long donGia(){
        if(ten.equals("X")) return 128000;
        if(ten.equals("D")) return 11200;
        return 9700;
    }
    private long thue(){
        if(hang.equals("Trong Nuoc")) return 0;
        if(ten.equals("X")) return tong * 3 / 100;
        if(ten.equals("D")) return (long) (tong * 3.5 / 100);
        return tong / 50 ;
    }
    private String hang(String s){
        if(s.equals("BP")) return "British Petro";
        if(s.equals("ES")) return "Esso";
        if(s.equals("SH")) return "Shell";
        if(s.equals("CA")) return "Castrol";
        if(s.equals("MO")) return "Mobil";
        return "Trong Nuoc";
    }

    @Override
    public String toString(){
        return ma + " " + hang + " " + donGia + " " + thue + " " + thanhTien;
    }

    @Override
    public int compareTo(DonHang o) {
        if(thanhTien < o.thanhTien) return 1;
        if(thanhTien > o.thanhTien) return -1;
        return 0;
    }
}
