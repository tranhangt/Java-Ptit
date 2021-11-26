package TreNhatGiaNhat;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Person> ds = new ArrayList<>();
        while (t-- > 0){
            ds.add(new Person(sc.next(), sc.next()));
        }
        Collections.sort(ds);
        System.out.println(ds.get(ds.size() - 1));
        System.out.println(ds.get(0));
    }
}
//5
//        Nam 01/10/1991
//        An 30/12/1990
//        Binh 15/08/1993
//        Tam 18/09/1990
//        Truong 20/09/1990
