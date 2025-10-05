// https://www.hackerrank.com/challenges/array-left-rotation/problem
import java.util.*;

class LeftRotation {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        /* 
            for (int i = 0; i < d; i++) {
            arr = rotateLeft(arr);
            }
            return arr; 
        */ 

        List<Integer> rotated = new ArrayList<>();
        rotated.addAll(arr.subList(d, arr.size()));
        rotated.addAll(arr.subList(0, d));

        return rotated;
    }
    
    public static List<Integer> rotateLeft(List<Integer> arr) {
        Integer[] array = arr.toArray(new Integer[0]);
        Integer firstElement = array[0];
         for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = firstElement;
        return Arrays.asList(array);
    }

}
