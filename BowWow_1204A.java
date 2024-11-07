import java.util.*;

public class BowWow_1204A{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s=input.next();
        String ones=s.replaceAll("0", "");
        int ans=s.length()/2;
        System.out.println(ones.length()>1&&s.length()%2!=0?ans+1:ans);
    }
}
