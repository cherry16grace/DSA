import java.util.*;

public class longestConsecutive{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int longest=1;

        Set<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
       for(int num:set){
         if(set.contains(num-1)){
            continue;
         }
         else{
            int cur=num;
            int lon=1;
            while(set.contains(cur+1)){
                cur++;
                lon++;
            }
            longest=Math.max(lon,longest);
         }
       }
       System.out.print(longest);
    }
}
