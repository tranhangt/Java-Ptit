package DanhSachDoanhNghiepNhanSinhVienThucTap2;

public class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String ma, ten;
    private int slg;

    public DoanhNghiep(String ma, String ten, int slg) {
        this.ma = ma;
        this.ten = ten;
        this.slg = slg;
    }

    public int getSlg() {
        return slg;
    }

    @Override
    public String toString(){
        return ma + " " + ten + " " + slg;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        if(slg < o.slg) return 1;
        if(slg == o.slg){
            return ma.compareTo(o.ma);
        }
        if(slg > o.slg) return -1;
        return 0;
    }
}
