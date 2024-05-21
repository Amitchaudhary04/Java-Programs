import java.util.*;
public class Anagram {
        public static void main(String[] args) {
            String str1 = "earth";
            String str2 = "heart";
            checkAnagram(str1,str2);
            System.out.println(checkPrime(6));
        }
        public static void checkAnagram(String str1,String str2){
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            if(str1.length() == str2.length()) {
                char[] charArray1 = str1.toCharArray();
                char[] charArray2 = str2.toCharArray();
                Arrays.sort(charArray1);
                Arrays.sort(charArray2);

                boolean result = Arrays.equals(charArray1, charArray2);

                if(result) {
                    System.out.println(str1 + " and " + str2 + " are anagram.");
                }
                else {
                    System.out.println(str1 + " and " + str2 + " are not anagram.");
                }
            }
        }
        public static boolean checkPrime(int n ){
            for (int i = 2; i <n/2 ; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
