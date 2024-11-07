import java.util.*;

public class Triple_1669B{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        while(t--!=0){
            int n=input.nextInt();
            int arr[]=new int[n+1];
            for (int i = 0; i < n ; i++) {
                arr[input.nextInt()]++;
            }

            int ans=-1;

            for (int i = 0; i <= n; i++) {
                if(arr[i]>2){
                    ans= i;
                }
            }

            System.out.println(ans);
        }
    }
}
