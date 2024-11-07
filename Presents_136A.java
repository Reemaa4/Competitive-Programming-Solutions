import java.util.*;

public class Presents_136A{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for (int i = 1; i <= n; i++) {
            arr[input.nextInt()-1]=i;
        }
        for(int b:arr){
            System.out.print(b+" ");
        }
    }
}
