//Question : Reverse a stack
package StacksQuestions;
import java.util.*;

import static StacksQuestions.Q1.pushAtBottom;

public class Q3 {
    public static void main(String[] args) {
          Stack<Integer> s = new Stack<>();
          s.push(1);
          s.push(2);
          s.push(3);
         //  3,2,1
          reverseStack(s);
          printStack(s);
          // 1,2,3
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

                int top = s.pop();
                reverseStack(s);
                pushAtBottom(s,top);
            }
            public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
            }
        }


