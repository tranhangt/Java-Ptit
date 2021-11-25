package ChuViTamGiac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            Point a = new Point(Double.parseDouble(sc.next()), Double.parseDouble(sc.next()));
            Point b = new Point(Double.parseDouble(sc.next()), Double.parseDouble(sc.next()));
            Point c = new Point(Double.parseDouble(sc.next()), Double.parseDouble(sc.next()));

            double ab = a.distance(b);
            double ac = a.distance(c);
            double bc = b.distance(c);

            if (ab + ac > bc && ab + bc > ac && ac + bc > ab) {
                System.out.println(String.format("%.3f", ab + bc + ac));
            } else System.out.println("INVALID");
        }
    }
}
