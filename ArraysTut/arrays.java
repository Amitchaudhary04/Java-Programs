package ArraysTut;

import java.lang.invoke.StringConcatFactory;
import java.util.Arrays;

public class arrays {
        public static void main(String[] args) {
            int[]arr=new int[5];
            arr[1]=2;
            System.out.println(arr[2]);
            int[] arr1={1,2,3,4,5,6,7};
            System.out.println(arr1[arr1.length-1]);
            int[] newarray;
            newarray=new int[5];
            for (int i = 0; i < newarray.length ; i++) {
                newarray[i]= newarray.length-i;
                System.out.print(newarray[i]+" ");
            }
            System.out.println();
            for(int element:newarray){
                System.out.print(element+" ");
            }
            Object[] objectarray=new Object[3];
            objectarray[0]="amit";
            objectarray[1]=new StringBuilder("World");
            objectarray[2]=2;
            System.out.println(Arrays.toString(objectarray));


        }
    }

