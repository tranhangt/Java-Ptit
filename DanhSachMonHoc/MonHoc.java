package DanhSachMonHoc;

public class MonHoc implements Comparable<MonHoc> {
    private String id, ten;
    private int tinChi;

    public MonHoc(String id, String ten, int tinChi) {
        this.id = id;
        this.ten = ten;
        this.tinChi = tinChi;
    }



    @Override
    public String toString(){
        return id + " " + ten + " " + tinChi;
    }

    @Override
    public int compareTo(MonHoc o) {
        return ten.compareTo(o.ten);
    }
}
