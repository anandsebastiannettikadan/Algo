class Solution {
    public Node flatten(Node head) {
        Node travel = head;
        Stack<Node> s = new Stack<>();
        while(travel !=null){
            //child
            if(travel.child !=null){
                if(travel.next !=null)
                 s.push(travel.next);    
                 travel.next = travel.child;
                 travel.next.prev = travel;
                 travel.child = null;
            }
            else{
            //reached end of line and attach the end of stack
            if(!s.isEmpty() &&  travel.next == null){
                travel.next = s.pop();
                travel.next.prev = travel;
            }
            }
            // normal case
            travel = travel.next;
            
        }
        return head;
    }
}