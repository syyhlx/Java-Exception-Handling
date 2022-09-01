import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class DividingByZero {

    public static void main(String[] args) {
        //write your code here
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
    }
}


/*
 //write your code here
        try {
            HashMap<String, String> map = new HashMap<>(null);
            System.out.println(map);
        }
       catch (NullPointerException e){
            System.out.println(e);
       }
 */

/*
public static void main(String[] args) {
        //write your code here
        try{
        ArrayList<String> list = new ArrayList<>();
        String s = list.get(18);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        //write your code here
    }
 */

   /* public static void main(String[] args) {

        try {
            int[] array = new int[2];
            array[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }*/



        /*try{
            String s = null;
            String m = s.toLowerCase();
        }
        catch(NullPointerException e){
            System.out.println(e);
            //write your code here
        }*/
   /* try {
        int a = 42 / 0;
    }
    catch (ArithmeticException e){

        System.out.println(e);
    }

    }*/


