import java.util.Scanner;

public class SoUuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        String s;
        boolean check;
        int chan, le;
        while(t-- > 0){
            s = sc.nextLine();
            check = false;
            chan = 0; le = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                    check = true;
                    System.out.println("INVALID");
                    break;
                }
                if(Integer.parseInt(String.valueOf(s.charAt(i))) % 2 == 0){
                    chan++;
                }
                else {
                    le++;
                }
            }
            if(!check){
                if (le == chan) {
                    System.out.println("NO");
                    continue;
                }
                else if (le > chan && s.length() % 2 != 0) {
                    System.out.println("YES");
                } else if (chan > le && s.length() % 2 == 0) {
                    System.out.println("YES");
                } else System.out.println("NO");
            }
        }
    }
}
