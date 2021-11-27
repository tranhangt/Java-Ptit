package TinhTienDien;

public class KhachHang {
    private String loaiSD, id;
    private int heSo, cu, moi, phuTroi, thanhTien, phaiTra;

    public KhachHang(int i, String loaiSD, int cu, int moi) {
        this.id = "KH" + String.format("%02d", i);
        this.loaiSD = loaiSD;
        this.cu = cu;
        this.moi = moi;
        this.heSo = heSo();
        this.thanhTien = thanhTien();
        this.phuTroi = phuTroi();
        this.phaiTra = thanhTien + phuTroi;
    }

    private int heSo(){
        if(loaiSD.equals("KD")) return 3;
        if(loaiSD.equals("NN")) return 5;
        if(loaiSD.equals("TT")) return 4;
        return 2;
    }

    private int thanhTien(){
        return (moi - cu) * heSo * 550;
    }
    private int phuTroi(){
        int dung = moi - cu;
        if(dung > 100) return thanhTien;
        if(dung >= 50 && dung <= 100) return Math.round((float) thanhTien / 100 * 35);
        return 0;
    }

    @Override
    public String toString(){
        return id + " " + heSo + " " + thanhTien + " " + phuTroi + " " + phaiTra;
    }
}
