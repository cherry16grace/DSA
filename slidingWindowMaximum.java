import java.util.*;
public class slidingWindowMaximum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int [] res=new int[n-k+1];
        int left=0,right=0,index=0;
        while(right<n){
            if(right-left+1<k){
                right++;
            }
            else if(right-left+1==k){
                int max=Integer.MIN_VALUE;
                for(int i=left;i<=right;i++){
                    max=Math.max(max,nums[i]);
                }
                res[index++]=max;
                left++;
                right++;
            }
        }
        for(int num:res){
            System.out.print(num+" ");
        }
    }
}