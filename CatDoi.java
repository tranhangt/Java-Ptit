import java.util.Scanner;

public class CatDoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        String s;
        boolean ok = false;
        while (t-- > 0){
            s = sc.nextLine();
            for(int i = 0; i < s.length(); i++){
                ok = false;
                if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '8' && s.charAt(i) != '9'){
                    ok = true;
                    System.out.println("INVALID");
                    break;
                }
            }
            if(!ok){
                s = s.replace('8', '0');
                s = s.replace('9', '0');
                while(s.charAt(0) == '0' && s.length() > 1){
                    s = s.substring(1);
                }
                if(s.charAt(0) == '0') System.out.println("INVALID");
                else System.out.println(s);
            }
        }
    }
}
