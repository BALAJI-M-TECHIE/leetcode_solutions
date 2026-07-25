/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {

        // count the elements and then going the mid : 

        int len = count( head);
        int mid = (len%2 == 1)?len/2+1:len/2+1;

        // finding the mid ListNode ;

        if(mid == 1 || mid == 0)
        {
            return head;
        }

        ListNode temp = head;

        while(temp!=null)
        {
           mid--;
           if(mid == 1)
           {
                return temp.next;
           } 
           temp = temp.next;
        }

        return null;
        
    }

   int count(ListNode head )
   {
        
        ListNode temp = head;
        int count=0;

            while(temp!=null)
            {
                count++;
                temp = temp.next;
            }

        return count;
   }
}