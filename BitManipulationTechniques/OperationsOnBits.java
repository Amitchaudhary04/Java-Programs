package BitManipulationTechniques;

public class OperationsOnBits {
    public static void main(String[] args) {
        System.out.println(getIthBit(8,1));
        System.out.println(setIthBit(8,1));
        System.out.println(clearIthBit(8,1));
    }
    // 1. Get the ith bit
    public static int getIthBit(int n , int i){
        int bitMask = (1<<i);
        if((n & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    // 2. set the ith Bit
    public static int setIthBit(int n , int i){
        int bitMask = (1<<i);
        return n|bitMask;
    }
    public static int clearIthBit(int n , int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
}
