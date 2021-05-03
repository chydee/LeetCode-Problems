class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var newArray = IntArray(nums.size + 1)
        if (nums.isEmpty()) return 0
        return if (target in nums) nums.indexOf(target) else {
            newArray = nums + 1
            newArray.set(newArray.lastIndex, target)
            newArray.sorted().indexOf(target)
        }
    }
}
