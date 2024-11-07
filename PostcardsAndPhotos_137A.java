import java.util.*;

public class PostcardsAndPhotos_137A{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s=input.next();
        int count=0,ans=0;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)==s.charAt(i+1)&&count<4){
                count++;
            }else{
                ans++;
                count=0;
            }
        }
        System.out.println(ans+1);
    }
}
