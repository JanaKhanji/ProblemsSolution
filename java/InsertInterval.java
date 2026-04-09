// https://leetcode.com/problems/insert-interval/


// TODO: Finish solving problem

import java.util.Arrays;

class InsertInterval {
    public static int[][] insertInterval(int[][] intervals, int[] newInterval) {
        int[][] results = intervals;
        if (intervals[0][0] > newInterval[1]) {
            // case where new interval is before the first interval
           results = new int[intervals.length + 1][2];
           results[0] = newInterval;
           for(int i=0; i < intervals.length; i++) {
            results[i+1]=intervals[i];
           }
        }  else if (intervals[intervals.length-1][1] < newInterval[0]) {
            // case where new interval is after the last interval
            results = new int[intervals.length + 1][2];
            for(int i=0; i < intervals.length; i++) {
                results[i]=intervals[i];
            }
            results[intervals.length] = newInterval;
        } else {
            // case where new interval is inside the intervals
            for(int i=0; i < intervals.length; i++) {
              
            }
        }

        // case where new interval is inside the intervals
        // int[] flatArray = flat2DArrayOfInt(intervals);
        // for (int i = 0; i < flatArray.length; i = i+2) {
        //     if (flatArray[i] > newInterval[0]) {
        //         if (flatArray[i+1] )
        //     }
        // }

        return results;
    }

    public static int[] flat2DArrayOfInt(int[][] intervals) {
    int[] results = Arrays.stream(intervals)
        .flatMapToInt(Arrays::stream)
        .toArray();
    
    return results;
    }

    public static int[][] buildIntervals(int[] flatArray) {
        int[][] result = new int[flatArray.length / 2][2];
        for (int i = 0; i < flatArray.length; i =i+2) {
            int[] interval = new int[] {flatArray[i], flatArray[i+1]};
            result[i/2] = interval;
        }
        return result;
    }

    public static void main(String[] args) {
        // int[][] intervals = new int[][] { {1, 3}, {6, 9} };
        // int[] newInterval = new int[] {2, 5};
    
        // int[][] intervals = new int[][] { {1,2},{3,5},{6,7},{8,10},{12,16} };
        // int[] newInterval = new int[] {4,8};

        int[][] intervals = new int[][] { {3, 5}, {6, 9} };
        int[] newInterval = new int[] {1, 4};
    
        int[][] result = insertInterval(intervals, newInterval);
        for (int[] interval : result) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}