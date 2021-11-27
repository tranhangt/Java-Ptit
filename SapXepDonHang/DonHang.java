package SapXepDonHang;

public class DonHang implements Comparable<DonHang>{
    private String ten, ma, stt, loai;
    private int donGia, slg, giamGia, thanhTien;

    public DonHang(String ten, String ma, int donGia, int slg) {
        this.ten = ten;
        this.ma = ma;
        this.donGia = donGia;
        this.slg = slg;
        this.stt = ma.substring(1, 4);
        this.loai = String.valueOf(ma.charAt(4));
        this.giamGia = giamGia();
        this.thanhTien = tien() - giamGia;
    }

    private int tien(){
        return slg * donGia;
    }
    private int giamGia(){
        if(loai.equals("1")) return tien() / 2;
        return tien() / 100 * 30;
    }
    @Override
    public String toString(){
        return ten + " " + ma + " " + stt + " " + giamGia + " " + thanhTien;
    }

    @Override
    public int compareTo(DonHang o) {
        return stt.compareTo(o.stt);
    }
}
