import java.util.*;
public class topkFrequent {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=list.get(i).getKey();
        }
       for(int i=0;i<k;i++){
        System.out.println(res[i]+" ");
       }
    }
}
