package SapXepKetQuaTuyenSinh;

public class ThiSinh implements Comparable<ThiSinh>{
    private String ma, ten, trangThai;
    private float toan, ly, hoa, tong, uuTien, xetTuyen;

    public ThiSinh(String ma, String ten, float toan, float ly, float hoa) {
        this.ma = ma;
        this.ten = ten;
        this.toan = toan * 2;
        this.ly = ly;
        this.hoa = hoa;
        this.tong = this.toan + ly + hoa;
        this.uuTien = uuTien(ma);
        this.trangThai = tt();
        this.xetTuyen = tong + uuTien;
    }

    private float uuTien(String s){
        String tmp = s.substring(0, 3);
        if(tmp.equals("KV1")) return 0.5F;
        if(tmp.equals("KV2")) return 1;
        return 2.5F;
    }

    private String format(float a){
        if(a == (int) a){
            return String.format("%.0f", a);
        }
        return String.format("%.1f", a);
    }
    private String tt(){
        if(tong + uuTien >= 24) return "TRUNG TUYEN";
        return "TRUOT";
    }

    @Override
    public String toString(){
        return ma + " " + ten + " " + format(uuTien) + " " + format(xetTuyen) + " " + trangThai;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(xetTuyen < o.xetTuyen) return 1;
        if(xetTuyen > o.xetTuyen) return -1;
        return ma.compareTo(o.ma);
    }
}
