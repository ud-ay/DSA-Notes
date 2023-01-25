import java.util.Arrays;
import java.util.Scanner;

public class MultDimensionalArray {
    public static void main(String args[]){
        //Synatx: int[][] arrName=new int[rows][colums]   rows is compulsory

        int [][]arr=new int[3][3];
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter elements:");
            for(int row=0;row<arr.length;row++){
                for(int col=0;col<arr[row].length;col++ ){
                    arr[row][col]=s.nextInt();
                }

            }
        }
        for(int[] num:arr){ //for-each looping
            System.out.println(Arrays.toString(num));

        }
       



    }
    
}
