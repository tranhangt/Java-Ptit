package BangXepHang;

public class SinhVien implements Comparable<SinhVien> {
    private String ten;
    private int done, submited;

    public SinhVien(String ten, int done, int submited) {
        this.ten = ten;
        this.done = done;
        this.submited = submited;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(done < o.done) return 1;
        if(done == o.done){
            if(submited > o.submited) return 1;
            if(submited < o.submited) return -1;
            return ten.compareTo(o.ten);
        }
        return -1;
    }
    @Override
    public String toString(){
        return ten + " " + done + " " + submited;
    }
}
