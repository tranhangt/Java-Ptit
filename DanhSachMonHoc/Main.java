package DanhSachMonHoc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<MonHoc> ds = new ArrayList<>();
        for(int i = 0; i < t; i++){
            ds.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(ds);
        for(MonHoc mh: ds){
            System.out.println(mh);
        }
    }
}
