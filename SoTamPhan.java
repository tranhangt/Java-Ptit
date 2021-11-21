import java.util.Scanner;

public class SoTamPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        String s;
        boolean ok = false;
        while(t-- > 0){
            s = sc.nextLine();
            ok = false;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2'){
                    System.out.println("NO");
                    ok = true;
                    break;
                }
            }
            if(!ok) System.out.println("YES");
        }
    }
}
