import java.util.*;

public class ThornsAndCoins_1932A{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        for (int i = 0; i < t; i++) {

            int n=input.nextInt(),res=0;
            String s=input.next();

            for (int j = 0; j < n; j++) {
                if(s.charAt(j)=='@'){
                    res++;
                }else if(s.charAt(j)=='*'&&j<n-1){
                    if(s.charAt(j+1)=='*'){
                        break;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
