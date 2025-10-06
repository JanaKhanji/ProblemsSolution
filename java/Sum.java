// https://www.hackerrank.com/challenges/solve-me-first/problem

import java.util.*;

class Sum {

    static int solveMeFirst(int a, int b) {
      return a + b;
	}

  
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("Enter the first number: ");
        a = in.nextInt();
        int b;
        System.out.println("Enter the second number: ");
        b = in.nextInt();
        in.close();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println("The sum of the two numbers is: " + sum);
	}
}