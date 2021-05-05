//Runtime: 2 ms, faster than 99.81% of Java online submissions for Median of Two Sorted Arrays.
//Memory Usage: 40.1 MB, less than 68.78% of Java online submissions for Median of Two Sorted Arrays.

/** 
 Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
Example 3:

Input: nums1 = [0,0], nums2 = [0,0]
Output: 0.00000
Example 4:

Input: nums1 = [], nums2 = [1]
Output: 1.00000
Example 5:

Input: nums1 = [2], nums2 = []
Output: 2.00000
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0.0;
        if(nums1.length == 0 && nums2.length == 0) return result;
        int[] mergedArray = new int[nums1.length + nums2.length];
        int position = 0;
        for(int num : nums1){
            mergedArray[position]=num;
            position++;
        }
        
        for(int num : nums2){
            mergedArray[position]=num;
            position++;
        }
        
        Arrays.sort(mergedArray);
        if (mergedArray.length >= 2 && mergedArray.length % 2 == 0) {
           return (mergedArray[mergedArray.length / 2] + mergedArray[mergedArray.length / 2 - 1]) / 2.0;
        } else {
            return (double) mergedArray[(mergedArray.length) / 2];
        }
    }
}
