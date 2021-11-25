import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DienThoaiCucGach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<>();
        String P = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0; i < P.length(); i++){
            if(i < 3){
                map.put(P.charAt(i), 2);
            }
            else if(i < 6){
                map.put(P.charAt(i), 3);
            }
            else if(i < 9){
                map.put(P.charAt(i), 4);
            }
            else if(i < 12){
                map.put(P.charAt(i), 5);
            }
            else if(i < 15){
                map.put(P.charAt(i), 6);
            }
            else if(i < 19){
                map.put(P.charAt(i), 7);
            }
            else if(i < 22){
                map.put(P.charAt(i), 8);
            }
            else {
                map.put(P.charAt(i), 9);
            }
        }
        int t = Integer.parseInt(sc.nextLine());
        String s, res;
        while (t-- > 0){
            s = sc.nextLine().toUpperCase();
            res = "";
            for(int i = 0; i < s.length(); i++){
                res += map.get(s.charAt(i));
            }
            if(thuanNghich(res)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }

    }

    public static boolean thuanNghich(String s){
        StringBuilder s1 = new StringBuilder(s);
        String tmpS = s1.reverse().toString();
        if(s.equals(tmpS)){
            return true;
        }
        return false;
    }
}
