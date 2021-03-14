class Solution {
    public Node treeToDoublyList(Node root) {
        if(root == null){
            return null;
        }
        Node cur = root;
        Node start = root;
            while(start.left != null){
                start = start.left;
            }
        Node prev = null;
        Stack<Node> s = new Stack<Node>();
        while(!s.isEmpty() || cur != null){
            while(cur!= null){
                s.push(cur);
                cur = cur.left;
            }
            cur = s.pop();
            if(prev != null){
                prev.right = cur;
                cur.left = prev;
            }
            prev = cur;
            cur = cur.right;
        }
        
        // end condition
        start.left = prev ;
        prev.right = start;
        return start;
        
        
        
    }
}