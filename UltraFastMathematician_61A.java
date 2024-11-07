import java.util.*;

public class UltraFastMathematician_61A{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s=input.next();
        String x=input.next();
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i)!=x.charAt(i)?1:0);
        }
    }
}
