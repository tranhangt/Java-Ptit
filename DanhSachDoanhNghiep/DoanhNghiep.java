package DanhSachDoanhNghiep;

public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String ma, ten;
    private int slg;

    public DoanhNghiep(String ma, String ten, int slg) {
        this.ma = ma;
        this.ten = ten;
        this.slg = slg;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + slg;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        return ma.compareTo(o.ma);
    }
}
