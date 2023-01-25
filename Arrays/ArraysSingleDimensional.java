import java.util.Arrays;

public class ArraysSingleDimensional {    
    public static void main(String args[]){
        /*Syntax: int[] arrName=new int[size];*/

        int[] rnos=new int[5]; //Total m/m allocated-10 
        //or
        int[]rows={10,20,30,40,50,60,70,80,90,10};
        String[] arr=new String[5];
        System.out.println(rnos+"\n"+rows);
        System.out.println(arr);
        System.out.println("\n"+Arrays.toString(rnos)); //Arrays.toString() is used to dislay all the content in the arrays without any change.
        System.out.println(Arrays.toString(rows));
    }
}






/*Points to remember.
 * 
 * 1. Decleration of the array happens at compile time where as m/m allocation happens at runtime this is called dynamic m/m allocation.
 * 2. In C, C++ arrays are continuously stored in m/m, but in java JVM decides because of no pointers in java.
 * 3. By JLS(Java Language Specification) heap objects are not continuous& array objects are stored in heap therefore, array objects may/may not be continuos.
 * 4. The default values in arrays is 0, and for string arrays its null. 
 * 5. In Java the primitives are stored in stack m/m but in python there is no primitives there is only objects.
 * 6. Primitives are those which can't be broken down. eg: int,char,boolean,float. Non-primitives are complex datatypes which can be broken down. eg: String-->char.
 * 7. Obj. are stored in heap m/m, refference var are stored in stack.
 * 8. If each element of the array are obj. it will be located to some other m/m and the refference var will be pointing to it.
*/
