package LietKeSinhVienTheoKhoa;

public class SinhVien{
    private String ma, ten, lop, email, khoa;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.khoa = "20" + lop.substring(1, 3);
    }

    public String getKhoa() {
        return khoa;
    }

    @Override
    public String toString(){
        return ma + " " + ten + " " + lop + " " + email;
    }
}
