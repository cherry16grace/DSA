
import java.util.*;
public class contiguousArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        
        HashMap<Integer,Integer> map=new HashMap<>();
       map.put(0,-1);
       
       int sum=0,max=0;
       for(int i=0;i<n;i++){
         sum+=(nums[i]==0)?-1:1;
         if(map.containsKey(sum)){
            max=Math.max(max,i-map.get(sum));
         }
         else{
            map.put(sum,i);
         }
       }
       System.out.println(max);
        
    }
}
