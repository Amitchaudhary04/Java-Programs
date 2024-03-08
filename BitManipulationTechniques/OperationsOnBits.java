package BitManipulationTechniques;

public class OperationsOnBits {
    public static void main(String[] args) {
        System.out.println(getIthBit(8,1));
        System.out.println(setIthBit(8,1));
        System.out.println(clearIthBit(8,1));
        System.out.println(updateIthBit(10,2,1));
        System.out.println(clearLastIthBit(15,2));
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
    //3. clear the ith bit
    public static int clearIthBit(int n , int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    //4. update the ith bit
    public static int updateIthBit(int n,int i,int newBit){
//        if(newBit==0){
//            return clearIthBit(n,i);
//        }
//        else{
//            return setIthBit(n,i);
//        }
        n = clearIthBit(n,i);
        int bitMask = newBit<<i;
        return n |bitMask;
    }
    //5.clear ith bit
    public static int clearLastIthBit(int n,int i){
        int bitMask = ((-1)<<i);
        return n & bitMask;
    }
}
