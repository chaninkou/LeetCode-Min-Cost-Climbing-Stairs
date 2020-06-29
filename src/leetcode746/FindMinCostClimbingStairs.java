package leetcode746;

public class FindMinCostClimbingStairs {
	// dp solution, O(n) time and O(n) space
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        
        // base case
        dp[0] = cost[0];
        dp[1] = cost[1];
        
        for(int i = 2; i < cost.length; i++){
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        
        // Stepping last step or without
        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }
    
    // O(1) space instead
	public int minCostClimbingStairs1(int[] cost) {
		int firstStep = cost[0];
		int secondStep = cost[1];

		for (int i = 2; i < cost.length; i++) {
			int currentStep = cost[i] + Math.min(firstStep, secondStep);

			firstStep = secondStep;

			secondStep = currentStep;
		}

		return Math.min(firstStep, secondStep);
	}
}
