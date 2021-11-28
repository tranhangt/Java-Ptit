package DiemDanh1;

public class SinhVien {
    private String ma, ten, lop;

    public SinhVien(String ma, String ten, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString(){
        return ma + " " + ten + " " + lop;
    }
}
