import java.util.Scanner;

public class LietKeToHop2 {
    private int n, k, a[], count = 1;
    private boolean check = false;

    private void init(){
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.next());
        k = Integer.parseInt(sc.next());
        a = new int[k + 1];
        for(int i = 1; i <= k; i++){
            a[i] = i;
        }
    }

    private void res(){
        for(int i = 1; i <= k; i++){
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }

    private void sinh(){
        res();
        int i = k;
        while(i > 0 && a[i] == n - k + i) --i;
        if (i <= 0) check = true;
        if(i > 0){
            a[i] += 1;
            for(int j = i + 1; j <= k; j++){
                a[j] = a[j - 1] + 1;
            }
            count += 1;
        }
    }

    public static void main(String[] args) {
        LietKeToHop2 th = new LietKeToHop2();
        th.init();
        while(!th.check){
            th.sinh();
        }
        System.out.println();
        System.out.println("Tong cong co " + th.count + " to hop");
    }
}
