import java.util.*;

public class GoodKid_1873B{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        for (int i = 0; i < t; i++) {
            int n=input.nextInt();
            int arr[]=new int[n];
            for (int j = 0; j < n; j++) {
                arr[j]=input.nextInt();
            }

            Arrays.sort(arr);
            arr[0]=arr[0]+1;
            double res=arr[0];

            for (int j = 1; j < n; j++) {
                res*=arr[j];
            }
            System.out.println((int)res);
        }
    }
}
