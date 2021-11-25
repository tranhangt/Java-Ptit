package DanhSachSinhVien3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class SinhVien implements Comparable<SinhVien> {
    private String ma, ten, lop;
    private Date ns;
    private float gpa;

    public SinhVien(int ma, String ten, String lop, String ns, float gpa) throws ParseException {
        this.ma = "B20DCCN" + String.format("%03d", ma);
        this.ten = ten;
        this.lop = lop;
        this.ns = new SimpleDateFormat("dd/mm/yyyy").parse(ns);
        this.gpa = gpa;
    }
    private String chuanHoa(){
        StringBuilder ans = new StringBuilder();
        StringTokenizer tmp = new StringTokenizer(ten);
        while(tmp.hasMoreTokens()){
            String a = tmp.nextToken();
            ans.append(a.toUpperCase().charAt(0) + a.toLowerCase().substring(1) + " ");
        }
        return ans.toString().trim();
    }

    @Override
    public String toString(){
        return ma + " " + chuanHoa() + " " + lop + " " + new SimpleDateFormat("dd/mm/yyyy").format(ns) + " " + String.format("%.2f", gpa);
    }

    @Override
    public int compareTo(SinhVien o) {
        if(o.gpa > gpa)
            return 1;
        if(o.gpa < gpa)
            return -1;
        return 0;
    }
}
