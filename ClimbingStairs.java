// Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
// Memory Usage: 36 MB, less than 9.91% of Java online submissions for Climbing Stairs.

/**
  You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 

Constraints:

1 <= n <= 45
*/

class Solution {
  // Using the recursive formula
  // f(n) = f(n-1) + f(n-2)
  // f(0) = f(1) = 1
    public int climbStairs(int n) {
        if(n < 2) return 1;
        int a =1, b = 1, c = 1;
        for(int i = 2; i <= n; i++){
            c = b;
            b = a + b;
            a = c;
        }
        return b;
    }
}
