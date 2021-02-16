class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = head;
        ListNode curr = head;
        while(curr!=null){
            prev = curr;
        curr.next = prev;
        }
    }
}