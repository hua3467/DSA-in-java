package chapter3_1;

/**
 *
 * @author aaronyang
 */
import java.util.Arrays;
import java.util.Random;

public class ArrayTest {
    public static void main(String[] args){
        int data[] = new int[10];
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());   //use current time as a seed
        // fill the data array with pseudo-random numbers from 0 to 99, inclusive
        for(int i = 0; i < data.length; i++)
            data[i] = rand.nextInt(100);    // the next pseudo-random number
        int[] orig = Arrays.copyOf(data, data.length);  // make a copy of the data array
        System.out.println("arrays equals before sort: " + Arrays.equals(data, orig));
        Arrays.sort(data);
        System.out.println("arrays equals before sort: " + Arrays.equals(data, orig));
        System.out.println("orig = " + Arrays.toString(orig));
        System.out.println("data = " + Arrays.toString(data));
        
    }
}
