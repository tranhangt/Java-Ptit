import java.util.Scanner;
import java.util.Stack;

public class ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Stack<Integer> stk = new Stack<>();
        int a;
        for(int i = 0; i < t; i++){
            a = sc.nextInt();
            if(!stk.empty()){
                if ((a + stk.peek()) % 2 == 0) {
                    stk.pop();
                }else stk.push(a);
            }
            else stk.push(a);
        }
        System.out.println(stk.size());
    }
}
