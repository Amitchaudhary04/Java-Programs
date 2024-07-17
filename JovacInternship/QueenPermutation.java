package JovacInternship;

public class QueenPermutation {
    public static void main(String[] args) {
        boolean[] board = new boolean[4];
        int tq = 2;
        queen(board,tq,0,"",0);
    }
    public static void queen(boolean[] board , int tq,int qpsf,String ans,int si){
        if(qpsf==tq){
            System.out.println(ans);
            return;
        }
        for (int i = si; i < board.length ; i++) {
            if(!board[i]){
                board[i] = true;
                queen(board, tq, qpsf+1, ans + "q" +qpsf+"b"+i,i);
                board[i] = false;
            }
        }
    }
}
