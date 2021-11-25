package KetQuaXetTuyen;

public class ThiSinh {
    private String ma, hoTen, ns;
    private double lyThuyet, thucHanh;

    public ThiSinh(int ma, String hoTen, String ns, double lyThuyet, double thucHanh) {
        this.ma = "PH" + String.format("%02d", ma);
        this.hoTen = hoTen;
        this.ns = ns.substring(ns.length() - 4);
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
    }

//    private String chuanHoa(){
//        StringBuilder res = new StringBuilder();
//        StringTokenizer tmp = new StringTokenizer(hoTen);
//        while(tmp.hasMoreTokens()){
//            String a = tmp.nextToken();
//            res.append(a.toUpperCase().charAt(0));
//            res.append(a.toLowerCase().substring(1) + " ");
//        }
//        return res.toString().trim();
//    }

    private int tuoi(){
        return 2021 - Integer.parseInt(ns);
    }

    private long diem(){
        double tb = (lyThuyet + thucHanh) / 2.0;
        double diem = tb;
        if(lyThuyet >= 8 && thucHanh >= 8){
            diem = tb + 1;
        }
        else if(lyThuyet >= 7.5 && thucHanh >= 7.5) {
            diem = tb + 0.5;
        }
        double tp = diem % 1;
        if(tp >= 0.5){
            diem += (1 - tp);
        }
        else diem -= tp;
        if(diem > 10)
            diem = 10;
        return (int)diem;
    }

    private String xepLoai(){
        if(diem() < 5)
            return "Truot";
        if(diem() == 5 || diem() == 6)
            return "Trung binh";
        if(diem() == 7)
            return "Kha";
        if(diem() == 8)
            return "Gioi";
        return "Xuat sac";
    }

    @Override
    public String toString(){
        return ma + " " + hoTen + " " + tuoi() + " " + diem() + " " + xepLoai();
    }
}
