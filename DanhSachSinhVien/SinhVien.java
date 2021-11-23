package DanhSachSinhVien;

import java.util.StringTokenizer;

public class SinhVien implements Comparable<SinhVien>{
    private String id, ten, lop, email;

    public SinhVien(String id, String ten, String lop, String email) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    private String chuanHoa(){
        StringBuilder ans = new StringBuilder();
        StringTokenizer tmp = new StringTokenizer(ten);
        while(tmp.hasMoreTokens()){
            String a = tmp.nextToken();
            ans.append(a.toUpperCase().charAt(0));
            ans.append(a.substring(1).toLowerCase());
            ans.append(" ");
        }
        return ans.toString().trim();
    }

    @Override
    public String toString(){
        return id + " " + chuanHoa() + " " + lop + " " + email;
    }

    @Override
    public int compareTo(SinhVien o) {
        return id.compareTo(o.id);
    }
}
