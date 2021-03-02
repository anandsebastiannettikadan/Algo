class Solution {
    public ListNode swapNodes(ListNode head, int k) {
     int length =0;
        ListNode startNode = null;
        ListNode endNode = null;
        ListNode currentNode = head;
        while(currentNode != null){
            length++;
          
             if(endNode != null){
                endNode = endNode.next;
            }
             
            if(length == k){
                startNode = currentNode;
                endNode = head;
            }
            
           
            currentNode = currentNode.next;
            
        }
        int temp = startNode.val;
        startNode.val = endNode.val;
        endNode.val = temp;
        return head;
    }
}