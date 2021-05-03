class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var common = ""
        val prefix = strs[0]
        if(strs.size == 0){return common}
        if(strs.size == 1){return prefix}
        var shortest = prefix
        for(word in strs){
            if(shortest.length > word.length) shortest = word
        }
        
        for(i in 0 until shortest.length){
            var charr = prefix.get(i)
            for(j in 1 until strs.size){
                if(strs[j].get(i) != charr) return common
            }
            common += charr
        }
        return common
        
    }

}
