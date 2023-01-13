
import java.util.*;
public class MultidimensionalArray {
    static void insertInto(int[][] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter into the array:");
        for (int row = 0; row < arr.length; row++) {
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=in.nextInt();
            }
        }

        }
        static void display(int[][]arr){
        System.out.println("Element in the array are:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
        //by for-each loop
        for(int[] num:arr){
            System.out.println(Arrays.toString(arr));

        }
        }
        public static void main (String args[]){
            int [][]mrr = new int[3][3];
            int[][] prr={{0,9,8},{7,6,5},{4,3,2}};
            System.out.println("The length of array is:" + mrr.length);
            System.out.println(Arrays.toString(prr));

            insertInto(mrr);
            display(mrr);
        }
    }
