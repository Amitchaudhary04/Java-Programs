package JovacInternship;

public class StringPermutation {
    public static void main(String[] args) {
        String ques = "abc";
        permutation(ques," ");
    }
    public static void permutation(String ques,String ans){
        if(ques.length()==0){
            System.out.print(ans+" ");
            return;
        }
        for (int i = 0; i < ques.length() ; i++) {
            char ch = ques.charAt(i);
            String lp = ques.substring(0,i);
            String rp = ques.substring(i+1);
            String ros = lp + rp ;
            permutation(ros,ans+ch);
        }
    }
}
