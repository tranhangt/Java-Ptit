package SapXepThoiGian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Time> ds = new ArrayList<>();
        for(int i = 0; i < t; i++){
            ds.add(new Time(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()), Integer.parseInt(sc.next())));
        }
        Collections.sort(ds);
        for(Time time: ds){
            System.out.println(time);
        }
    }
}
