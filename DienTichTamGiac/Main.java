package DienTichTamGiac;

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
            double ca = a.distance(c);
            double bc = b.distance(c);

            if (ab + ca > bc && ab + bc > ca && ca + bc > ab) {
                double dt = (Math.sqrt((ab + bc + ca) * (ab + bc - ca) * (ab - bc + ca) * (-ab + bc + ca))) / 4;
                System.out.println(String.format("%.2f", dt));
            } else System.out.println("INVALID");
        }
    }
}
