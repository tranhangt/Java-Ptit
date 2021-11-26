package DanhSachThucTap1;

public class SinhVien implements Comparable<SinhVien> {
    private int stt;
    private String ma, ten, lop, email, doanhNghiep;

    public SinhVien(int stt, String ma, String ten, String lop, String email, String doanhNghiep) {
        this.stt = stt;
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.doanhNghiep = doanhNghiep;
    }

    @Override
    public String toString(){
        return stt + " " + ma + " " + ten + " " + lop + " " + email + " " + doanhNghiep;
    }

    @Override
    public int compareTo(SinhVien o) {
        return ten.compareTo(o.ten);
    }
}
