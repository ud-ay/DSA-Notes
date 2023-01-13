import javax.xml.transform.stream.StreamSource;
import java.util.*;
public class Ar1 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int[] rnos=new int[5];
        System.out.println("Enter values into array:");
        //insert into array
        for(int i=0;i< rnos.length;i++){
            rnos[i]=in.nextInt();
        }
        //display from the array
        for(int a=0;a<rnos.length;a++){
            System.out.println(rnos[a]);

        }
        //to string method
        System.out.println(Arrays.toString(rnos));


    }
}
