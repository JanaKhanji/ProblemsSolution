// https://leetcode.com/problems/insert-interval/


// TODO
public class InsertInterval {
    public static int[][] insertInterval(int[][] intervals, int[] newInterval) {
        int[][] results = new int
        for (int i = 0; i < intervals.length; i++) {
           
        }
        return intervals;
    }

    public static void main(String[] args) {
        // int[][] intervals = new int[][] { {1, 3}, {6, 9} };
        // int[] newInterval = new int[] {2, 5};
    
        int[][] intervals = new int[][] { {1,2},{3,5},{6,7},{8,10},{12,16} };
        int[] newInterval = new int[] {4,8};

        int[][] result = insertInterval(intervals, newInterval);
        for (int[] interval : result) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}