import java.util.*;
public class productExceptSelf {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int pre=1,post=1;
        int[] res=new int[n];
        Arrays.fill(res,1);
        for(int i=0;i<n;i++){
            res[i]=pre;
            pre*=arr[i];

        }
        for(int i=n-1;i>=0;i--){
            res[i]=res[i]*post;
            post*=arr[i];
        }

        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}
