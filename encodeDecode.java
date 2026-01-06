import java.util.*;
public class encodeDecode {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        String encoded=encode(str);
        System.out.print(encoded);
        String[] decoded=decode(encoded);
        for(String s:decoded){
            System.out.print(s+" ");
        }

        
    }
    public static String encode(String[] str){
        StringBuilder sb=new StringBuilder();
       for(String s:str){

           sb.append(s.length()).append("#").append(s);
           
       }
       return sb.toString();
    }
    public static String[] decode(String s){
        List<String> res=new ArrayList<>();
        int i=0;
        while(i<s.length()){
            int j=i;
            while(s.charAt(j)!='#'){
                j++;
                int val=Integer.parseInt(s.substring(i,j));
                String con=s.substring(j+1,j+1+val);
                res.add(con);
                i=j+1+val;

            }
        }
        return res.toArray(new String[0]);
    }
}
