public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> hs = new HashSet<>();
        while(head != null){
            if(!hs.contains(head)){
            hs.add(head);
            }
            else{
                return true;
            }
         head = head.next;  
        }
        return false;
    }
}