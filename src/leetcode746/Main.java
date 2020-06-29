package leetcode746;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] cost = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		
		System.out.println("Cost: " + Arrays.toString(cost));
		
		FindMinCostClimbingStairs solution = new FindMinCostClimbingStairs();
		
		System.out.println("Solution: " + solution.minCostClimbingStairs(cost));
	}
}
