package JovacInternship;

public class BoardPath {
    public static void main(String[] args) {
        int n = 4;
        board(0,n," ");
    }
    public static void board(int curr,int n,String ans){
        if(curr==n){
            System.out.println(ans);
            return;
        }
        if(curr > n){
            return;
        }
        board(curr+1,n,ans+1);
        board(curr+2,n,ans+2);
        board(curr+3,n,ans+3);
        board(curr+4,n,ans+4);
    }
}
