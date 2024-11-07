import java.util.*;

public class FileName_978B{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        String s=input.next();
        int ans=0,count=0;
        if(s.replaceAll("x", "").length()==0){
            System.out.println(s.length()>2?s.length()-2:0);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='x'){
                count++;
            }
            if(s.charAt(i)!='x'||i==s.length()-1){
                ans+=count>2?count-2:0;
                count=0;
            }
            
        }
        System.out.println(ans);
    }
}
