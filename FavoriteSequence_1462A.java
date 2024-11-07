import java.util.*;
public class FavoriteSequence_1462A{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int arr[]=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=input.nextInt();
            }
            int j=n-1;
            for (int i = 0; i < Math.ceil((double)n/2); i++) {
                if(i!=j){
                    System.out.print(arr[i]+" "+arr[j]+" ");
                    j--;
                }else{
                    System.out.print(arr[j]);
                    break;
                }
            }
            System.out.println();
        }
    }
}
