package DiemDanh1;

public class DanhSachDiemDanh {
    private SinhVien sv;
    private String dd, ma, diem;

    public DanhSachDiemDanh(String ma, String dd) {
        this.ma = ma;
        this.dd = dd;
        this.diem = diem();
    }

    public String getMa() {
        return ma;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    private String diem(){
        int d = 10;
        for(int i = 0; i < 10; i++){
            if(dd.charAt(i) == 'm') d -= 1;
            if(dd.charAt(i) == 'v') d -= 2;
            if(d <= 0){
                return "0 KDDK";
            }
        }
        return String.valueOf(d);
    }

    @Override
    public String toString(){
        return sv + " " + diem;
    }
}
