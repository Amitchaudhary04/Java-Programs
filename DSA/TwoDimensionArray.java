package DSA;

import java.util.Arrays;

public class TwoDimensionArray {
    int[][] arr2 = null;
    public TwoDimensionArray(int row, int col) {
        this.arr2 = new int[row][col];
        for ( row = 0; row < arr2.length; row++) {
            for (col = 0; col < arr2[0].length; col++) {
                arr2[row][col] = Integer.MIN_VALUE;
            }

        }

    }
    public void insert(int row,int col,int value) {
        try {
            if(arr2[row][col]==Integer.MIN_VALUE){
                arr2[row][col]=value;
                System.out.println("Successfully inserted");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index to array!");
        }

    }
    //Accessing all value from given array
    public void accessCell(int row,int col){
        System.out.println("\nAccessing Row# " + row +", Col# " +col);
        try{
            System.out.println("Cell value is : "+ arr2[row][col]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");

        }
    }
    public void traverseArray(){
        try{
            for (int row = 0; row < arr2.length; row++) {
                for (int col = 0; col < arr2.length; col++) {
                    System.out.print(+arr2[row][col]+" ");
                }
                System.out.println();
            }
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("No longer exists");
        }
    }
    //Searching Value
    public void searchElement(int value) {
        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2.length; col++) {
                if (arr2[row][col] == value) {
                    System.out.println("Value is present in array " + "Row " + row + " Col " + col);
                    return;
                }
            }
        }
        System.out.println("Value is not present");
    }
    public void deleteElement(int row,int col){
        try{
            System.out.println("Successfully Deleted : "+arr2[row][col]);
            arr2[row][col]=Integer.MIN_VALUE;

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index is not valid for array");
        }

    }
}
