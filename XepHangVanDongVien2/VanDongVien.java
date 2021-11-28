package XepHangVanDongVien2;

public class VanDongVien implements Comparable<VanDongVien>{
    private String ma, ten, ns, uuTien;
    private String[] xp, dich;
    private int thucTe, ketQua;
    private int tuoi, xepHang;

    public VanDongVien(int ma, String ten, String ns, String xp, String dich) {
        this.ma = String.format("VDV%02d", ma);
        this.ten = ten;
        this.ns = ns.substring(6);
        this.xp = xp.split(":");
        this.dich = dich.split(":");
        this.tuoi = 2021 - Integer.parseInt(this.ns);
        this.uuTien = "00:00:0" + uuTien();
        this.thucTe = getGiay(this.dich) - getGiay(this.xp);
        this.ketQua = thucTe - uuTien();
    }

    public int getKetQua() {
        return ketQua;
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }

    private int uuTien(){
        if(tuoi < 18) return 0;
        if(tuoi < 25) return 1;
        if(tuoi < 32) return 2;
        return 3;
    }

    private int getGiay(String[] a){
        return Integer.parseInt(a[0]) * 3600 + Integer.parseInt(a[1]) * 60 + Integer.parseInt(a[2]);
    }


    private String fomat(int a){
        int gio, phut, giay;
        gio = a / 3600;
        phut = (a % 3600) / 60;
        giay = a % 3600 % 60;
        return String.format("%02d:%02d:%02d", gio, phut, giay);
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + fomat(thucTe) + " " + uuTien + " " + fomat(ketQua) + " " + xepHang;
    }

    @Override
    public int compareTo(VanDongVien o) {
        if(ketQua > o.ketQua) return 1;
        if(ketQua < o.ketQua) return -1;
        return 0;
    }
}
