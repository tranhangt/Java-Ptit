package SapXepDanhSachMatHang;

public class MatHang implements Comparable<MatHang>{
    private int ma;
    private String ten, loai;
    private float loiNhuan, ban, mua;

    public MatHang(int ma, String ten, String loai, float mua, float ban) {
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
        this.loiNhuan = ban - mua;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + loai + " " + String.format("%.2f", loiNhuan);
    }

    @Override
    public int compareTo(MatHang o) {
        if(loiNhuan < o.loiNhuan) return 1;
        if(loiNhuan > o.loiNhuan) return -1;
        return 0;
    }
}
