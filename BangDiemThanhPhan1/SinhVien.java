package BangDiemThanhPhan1;

public class SinhVien implements Comparable<SinhVien>{
    private String ma, ten, lop;
    private float d1, d2, d3;

    public SinhVien(String ma, String ten, String lop, float d1, float d2, float d3) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + lop + " " + d1 + " " + d2 + " " + d3;
    }

    @Override
    public int compareTo(SinhVien o) {
        return ma.compareTo(o.ma);
    }
}
