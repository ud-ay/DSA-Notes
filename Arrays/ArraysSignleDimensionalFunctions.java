import java.util.Arrays;
import java.util.Scanner;

public class ArraysSignleDimensionalFunctions {
    public static void main(String args[]){
        int[] arr=new int[10];

        //inserting elements into array arr.
        System.out.println("Enter elements into array:");
        try (Scanner s = new Scanner(System.in)) {
            for(int i=0;i<arr.length;i++){
                int a=s.nextInt();
                arr[i]=a;
            }
        }
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println("The for-each loop\n");
        for(int num:arr){
            System.out.println(num);
        }

    }
    static void change(int[]chArr){
        chArr[0]=12234; //arr-->chArr, then adding value at 0th index(mutability).
        System.out.println(Arrays.toString(chArr));
        
    }

    
}
