// https://www.hackerrank.com/challenges/picking-numbers.java/problem

import java.util.*;

public class PickingNumbers {
     
    public static int pickingNumbers(List<Integer> a) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        for (Integer num: a) {
            frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
        }

        int maxLength = 0;
        for (Integer num: frequencies.keySet()) {
            int currentLength = frequencies.get(num) + frequencies.getOrDefault(num + 1, 0);
            maxLength = Math.max(maxLength, currentLength);
            
        }
        return maxLength;
    }



   public static void main(String[] args) {
        List<Integer> array = List.of(4,5,6,3,3,1);
        //List<Integer> array = List.of(1,2,2,3,1,2);
        System.out.println(pickingNumbers(array));
	}
}
