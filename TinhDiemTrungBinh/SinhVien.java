package TinhDiemTrungBinh;

import java.util.StringTokenizer;

public class SinhVien implements Comparable<SinhVien>{
    private String ten, ma, tb;
    private int xepHang;

    public SinhVien(int ma, String ten, float d1, float d2, float d3) {
        this.ma = String.format("SV%02d", ma);
        this.ten = chuanHoa(ten);
        this.tb = String.format("%.2f", (d1 * 3 + d2 * 3 + d3 * 2) / 8);
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }

    public String getTb() {
        return tb;
    }

    private String chuanHoa(String a){
        StringBuilder ans = new StringBuilder();
        StringTokenizer tmp = new StringTokenizer(a);
        while (tmp.hasMoreTokens()){
            String s = tmp.nextToken();
            ans.append(s.toUpperCase().charAt(0) + s.toLowerCase().substring(1) + " ");
        }
        return ans.toString().trim();
    }


    @Override
    public int compareTo(SinhVien o) {
        if(Float.parseFloat(tb) < Float.parseFloat(o.tb)) return 1;
        if(Float.parseFloat(tb) > Float.parseFloat(o.tb)) return -1;
        return ma.compareTo(o.ma);
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + tb + " " + xepHang;
    }
}
