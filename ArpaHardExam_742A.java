import java.util.*;

public class ArpaHardExam_742A{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int arr[]={6,8,4,2};
        System.out.println(n==0?1:arr[n%4]);
    }
}
