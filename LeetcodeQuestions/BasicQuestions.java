package LeetcodeQuestions;

import java.util.Scanner;

public class BasicQuestions {
    public static void main(String[] args) {
      System.out.println( checkPrime(8));
        int[] array = {3,4,5,7,11};
        checkArrayPrime(array,5);

    }
      public static boolean checkPrime(int n){
        if(n<=1){
            return false;
        }
          for (int i = 2; i <=n/2; i++) {
              if(n%i==0){
                  return false;
              }
          }
          return true;
      }

    public static void checkArrayPrime(int[]array,int n){
            for(int i=0; i<array.length; i++){
                boolean isPrime = true;
                for (int j=2; j<array[i]; j++) {
                    if (array[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime)

                    System.out.print(array[i] + " " );
            }
        }
    }

