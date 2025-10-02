// https://www.hackerrank.com/challenges/birthday-cake-candles/problem


import java.util.*;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (Integer candle: candles) {
            counts.put(candle, counts.getOrDefault(candle, 0) + 1);
        }
      return Collections.max(counts.values());
    }



   public static void main(String[] args) {
        // List<Integer> array = List.of(3,2,1,3);
        List<Integer> array = List.of(4,4,1,3);;
        System.out.println(birthdayCakeCandles(array));
	}
}