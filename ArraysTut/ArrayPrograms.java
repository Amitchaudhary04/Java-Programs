package ArraysTut;

public class ArrayPrograms {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int count = 0, i = 0, n;
        try {
            while (array[i] != 'a') {
                count++;
                i++;
            }
        } catch (Exception e) {
            System.out.println("Number of elements in array : " + count);
        }
        n= array.length;
        System.out.println("Number of elements(using inbuilt method named length): " +n);
    }
}
