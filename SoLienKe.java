import java.util.Scanner;

public class SoLienKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()), a;
        String s;
        boolean ok = false;
        while(t-- > 0){
            s = sc.nextLine();
            ok = false;
            for(int i = 1; i < s.length(); i++){
                a = s.codePointAt(i) - s.codePointAt(i - 1);
                if(a != 1 && a != -1){
                    System.out.println("NO");
                    ok = true;
                    break;
                }
            }
            if(!ok) System.out.println("YES");
        }
    }
}
