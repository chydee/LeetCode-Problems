//Runtime: 1 ms, faster than 99.97% of Java online submissions for Sqrt(x).
//Memory Usage: 35.9 MB, less than 79.79% of Java online submissions for Sqrt(x).
/**
* Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

 

Example 1:

Input: x = 4
Output: 2
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
 

Constraints:

0 <= x <= 231 - 1 
*/

class Solution {
    public int mySqrt(int x) {
        double num =(double) x;
        double ans = Math.sqrt(num);
        return (int) ans;
    }
}
