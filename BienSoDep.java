import java.util.Scanner;

public class BienSoDep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        String s;
        while(t-- > 0){
            s = sc.nextLine();
            s = s.substring(5, 8) + s.substring(9);
            if(!tang(s) && !bang(s) && !banghalp(s) && !so68(s)){
                System.out.println("NO");
            }
            else System.out.println("YES");
        }
    }
    private static boolean tang(String s){
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) <= s.charAt(i - 1))
                return false;
        }
        return true;
    }

    private static boolean bang(String s){
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(i - 1))
                return false;
        }
        return true;
    }

    private static boolean banghalp(String s){
        for(int i = 1; i < 3; i++){
            if(s.charAt(i) != s.charAt(i - 1))
                return false;
        }
        if(s.charAt(3) != s.charAt(4))
            return false;
        return true;
    }

    private static boolean so68(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '6' && s.charAt(i) != '8')
                return false;
        }
        return true;
    }
}
