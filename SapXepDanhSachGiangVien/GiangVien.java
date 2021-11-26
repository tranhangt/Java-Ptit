package SapXepDanhSachGiangVien;

public class GiangVien implements Comparable<GiangVien>{
    private String ma, hoTen, boMon, tat, ten;

    public GiangVien(int ma, String hoTen, String boMon) {
        this.ma = "GV" + String.format("%02d", ma);
        this.hoTen = hoTen;
        this.boMon = boMon;
        this.tat = tat(boMon);
        this.ten = ten(hoTen);
    }

    public String getBoMon() {
        return boMon;
    }

    private String tat(String s){
        String tmp[] = s.split(" ");
        String res = "";
        for(int i = 0; i < tmp.length; i++){
            res += tmp[i].toUpperCase().charAt(0);
        }
        return res;
    }

    private String ten(String s){
        String tmp[] = s.split(" ");
        return tmp[tmp.length - 1];
    }

    @Override
    public String toString(){
        return ma + " " + hoTen + " " + tat;
    }

    @Override
    public int compareTo(GiangVien o) {
        if(ten.equals(o.ten)){
            return ma.compareTo(o.ma);
        }
        return ten.compareTo(o.ten);
    }
}
