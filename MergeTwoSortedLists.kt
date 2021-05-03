/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var head = ListNode(0)
        var p = head
        
        var p1 = l1
        var p2 = l2
        while(p1 != null && p2 != null){
            if(p1?.`val` < p2?.`val`){
                p.next = p1
                p1 = p1.next
            } else {
                p.next = p2
                p2 = p2.next
            }
            p = p.next
        }
        
        if(p1 != null) p.next = p1
        if(p2 != null) p.next = p2
        
        return head.next
    }
}
    
