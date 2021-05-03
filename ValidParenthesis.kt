class Solution {
    fun isValid(s: String): Boolean {
        var stacky = Stack<Char>()
        if (s.isEmpty()) return false
        if (s.length % 2 != 0) return false
        
        for(paren in s){
            if(paren =='(' || paren == '[' || paren == '{'){
                stacky.push(paren)
            } else {
                if(stacky.isEmpty()) {
                    return false 
                } else {
                    var top = stacky.peek()
                    if(paren == ')' && top == '(' || paren == ']' && top == '[' || paren == '}' && top == '{'){
                        stacky.pop()
                    } else {
                        return false
                    }
                }
            }
        }
        
        return stacky.isEmpty()
    }
}
