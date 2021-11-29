package TinhLuong;

public class PhongBan {
    private String ma, ten;

    public PhongBan(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString(){
        return ten;
    }
}
