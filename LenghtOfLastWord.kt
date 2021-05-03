class Solution {
    fun lengthOfLastWord(s: String): Int {
        val trimmed = s.trim()
        if(trimmed.isEmpty()) return 0
        var words = trimmed.split(" ")
        return words.last().length
    }
}
