package DanhSachGiangVienTheoBoMon;

public class GiangVien {
    private String ma, ten, boMon, tat;

    public GiangVien(int ma, String ten, String boMon) {
        this.ma = "GV" + String.format("%02d", ma);
        this.ten = ten;
        this.boMon = boMon;
        this.tat = tat(boMon);
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

    @Override
    public String toString(){
        return ma + " " + ten + " " + tat;
    }
}
