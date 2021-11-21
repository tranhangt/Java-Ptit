import java.util.Scanner;

public class DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String str[] = sc.nextLine().split(" ");
            String ans = "";
            for(String a: str){
                ans = ans + reverse(a) + " ";
            }
            System.out.println(ans);
        }
    }
    private static String reverse(String s){
        String res = "";
        for(int i = 0; i < s.length(); i++){
            res = s.charAt(i) + res;
        }
        return res;
    }

}
