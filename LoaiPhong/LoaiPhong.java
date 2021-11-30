package LoaiPhong;

public class LoaiPhong implements Comparable<LoaiPhong> {
    private String kyHieu, ten;
    private int gia;
    private float phiPhucVu;

    public LoaiPhong(String line) {
        String tmp[] = line.split(" ");
        this.kyHieu = tmp[0];
        this.ten = tmp[1];
        this.gia = Integer.parseInt(tmp[2]);
        this.phiPhucVu = Float.parseFloat(tmp[3]);
    }

    @Override
    public String toString(){
        return kyHieu + " " + ten + " " + gia + " " + phiPhucVu;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return ten.compareTo(o.ten);
    }
}
