package BangTheoDoiNhapXuatHang;

public class SanPham {
    private String ma;
    private int nhap, xuat;
    private long donGia, thue, tien;
    private char dau, cuoi;

    public SanPham(String ma, int nhap) {
        this.ma = ma;
        this.nhap = nhap;
        this.dau = ma.charAt(0);
        this.cuoi = ma.charAt(4);
        this.donGia = donGia();
        this.xuat = xuat();
        this.tien = donGia * xuat;
        this.thue = thue();
    }
    private int xuat(){
        if(dau == 'A') return Math.round((float) nhap / 10 * 6);
        return Math.round((float) nhap / 10 * 7);
    }

    private long donGia(){
        if(cuoi == 'Y') return 110000;
        return 135000;
    }

    private long thue(){
        if(dau == 'A' && cuoi == 'Y') return tien / 100 * 8;
        if(dau == 'A' && cuoi == 'N') return tien / 100 * 11;
        if(dau == 'B' && cuoi == 'Y') return tien / 100 * 17;
        return tien / 100 * 22;
    }
    @Override
    public String toString(){
        return ma + " " + nhap + " " + xuat + " " + donGia + " " + tien + " " + thue;
    }
}
