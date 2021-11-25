package KetQuaXetTuyen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<ThiSinh> ds = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            ds.add(new ThiSinh(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        for(ThiSinh ts: ds){
            System.out.println(ts);
        }
    }
}
