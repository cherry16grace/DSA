import java.util.*;
public class validSudoku{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[][] board=new char[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                board[i][j]=sc.next().charAt(0);
            }
        }
        boolean[][] rows=new boolean[9][9];
        boolean[][] cols=new boolean[9][9];
        boolean[][] box=new boolean[9][9];

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                else{
                  int ind=board[i][j]-'1';
                  int boxind=(i/3)*3+(j/3);
                  if(rows[i][ind] || cols[j][ind] || box[boxind][ind]){
                    System.out.println("false");

                  }
                  rows[i][ind]=true;
                  cols[j][ind]=true;
                  box[boxind][ind]=true;

                }
            }
        }
        System.out.println("true");

    }
}