class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if(nums.size == 0) return 0
        var i = 0
        var j = 0
        while(i < nums.size){
            if(nums[i] != nums[j]){
                j++; println(j)
                nums[j] = nums[i]
            }
            i++
        }
        return j+1
    }
}
