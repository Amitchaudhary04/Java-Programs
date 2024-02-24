package Stacks;

public class UsingArray {
    public static void main(String[] args) {

    }
    static class stacks{
        int[] arr;
        int top;
        int size;

        stacks(int size){
            this.arr = new int[size];
            this.top =-1;
            this.size = size;
        }
        public void push(int element){
            if(top<=size-1){
                top++;
                arr[top] = element;
            }
            else{
                throw new IllegalStateException("Stack OverFlow");
            }
        }
    }
}
