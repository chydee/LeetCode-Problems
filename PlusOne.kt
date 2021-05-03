class Solution {
    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.size - 1 downTo 0) {
            if (digits[i] !== 9) {
                digits[i]++
                break
            } else {
                digits[i] = 0
            }
        }
        if (digits[0] === 0) {
            val rst = IntArray(digits.size + 1)
            rst[0] = 1
            return rst
        }
        return digits
    }
}
