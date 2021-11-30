package ChuanHoaDanhSachSinhVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class SInhVien {
    private String ma, ten, lop;
    private Date ns;
    private float gpa;

    public SInhVien(int ma, String ten, String lop, String ns, float gpa) throws ParseException {
        this.ma = String.format("B20DCCN%03d", ma);
        this.ten = chuanHoa(ten);
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.lop = lop;
        this.gpa = gpa;
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
    public String toString(){
        return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ns) + " " + String.format("%.2f",gpa);
    }
}
