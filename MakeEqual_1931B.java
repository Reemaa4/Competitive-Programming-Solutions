import java.util.*;

public class MakeEqual_1931B{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t=input.nextInt();

        for (int i = 0; i < t; i++) {

            int sum=0,r=0,l=0;
            boolean flag=true;

            int n=input.nextInt();
            int arr[]=new int[n];
            for (int j = 0; j < n; j++) {
             arr[j]=input.nextInt();
             sum+=arr[j];
            }

            r=sum/n;
            
            for (int j = 0; j < n; j++) {
                if(arr[j]>r){
                    l+=arr[j]-r;
                }else if(arr[j]<r){
                    int m=r-arr[j];
                    if(l>=m){
                        arr[j]+=m;
                        l-=m;
                    }else{
                        flag=false;
                        break;
                    }
                }
            }
            System.out.println(flag?"YES":"NO");
        }
    }
}
