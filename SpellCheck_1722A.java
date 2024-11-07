import java.util.*;

public class SpellCheck_1722A{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        for (int i = 0; i < t; i++) {
            int n=input.nextInt();
            String s=input.next();
            s=s.replaceFirst("T", "");
            s=s.replaceFirst("i", "");
            s=s.replaceFirst("m", "");
            s=s.replaceFirst("u", "");
            s=s.replaceFirst("r", "");
            System.out.println(s.length()==0&&n>4?"YES":"NO");
        }
    }
}
