import java.util.*;
public class rotateImage {
    public static void main(String[]  args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] grid=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=grid[i][j];
                grid[i][j]=grid[j][i];
                grid[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int left=0,right=n-1;
            while(left<right){
                int temp=grid[i][left];
                grid[i][left]=grid[i][right];
                grid[i][right]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        
    }    
}
