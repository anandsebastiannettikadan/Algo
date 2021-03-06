class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }
        ListNode firstHalfEnd = endOfFirstHalf(head);
        ListNode secondHalfStart = reverseList(firstHalfEnd.next);
        
        //check for palindrome
        ListNode p1 = head;
        ListNode p2 = secondHalfStart;
        boolean result = true;
        
        while(result && p2!= null){
            if(p1.val != p2.val){
                result = false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        
        // restore list and return the result
        firstHalfEnd.next = reverseList(secondHalfStart);
        return result;
    }

        
        private ListNode reverseList(ListNode head){
            ListNode prev = null;
            ListNode curr = head;
            while(curr != null){
                ListNode nexttemp = curr.next;
                curr.next = prev;
                prev = curr;       
                curr = nexttemp;
            }
            return prev;
        }
    
        private ListNode endOfFirstHalf(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while( fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
        }

        
    }