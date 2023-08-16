import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isSafeQueen(boolean chessBoard[][], int row, int col){
        
        // For d1 
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chessBoard[i][j] == true) return false;
        }
        
        // For d2
        for(int i=row-1;i>=0;i--){
            if(chessBoard[i][col] == true) return false;
        }
        
        // For d3
        for(int i=row-1,j=col+1;i>=0 && j<chessBoard.length;i--,j++){
            if(chessBoard[i][j] == true) return false;
        }
        
        return true; // It is the safe position to place queen
    }
    public static void nqueen(boolean chessBoard[][], int row, String ans){
        
        if(row == chessBoard.length){
            System.out.println(ans + ".");
            return;
        }
        
        for(int col = 0;col<chessBoard.length;col++){
            if(isSafeQueen(chessBoard,row,col) == true){
                chessBoard[row][col] = true;
                nqueen(chessBoard, row+1, ans + row +"-"+col+", ");
                chessBoard[row][col] = false;
            }
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean chessBoard [][] = new boolean [n][n];
        nqueen(chessBoard,0,"");
    }
}
