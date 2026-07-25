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
    public ListNode reverseList(ListNode head) {

        if( head == null || head.next == null )
        {
            return head;
        }

        // two pointer approach , wont works , we dont back iterative since it is not double linked list : 

        // navie approach : store in the arraylist or stack : replace the element in node with last element in the arraylist : 

        // NAIVE : 

        // storing in stack : 

        Stack<Integer> s = new Stack<>();

        ListNode temp = head;
        while(temp!=null)
        {
            s.push(temp.val);
            temp = temp.next;
        }

        // updates the values : 
         ListNode ite = head;
        while(ite!=null)
        {
           ite.val =  s.pop();
            ite = ite.next;
        }
       
       return head; // returing the tail as head
       
       
       
        // optimal : change the memory address : 1 -> 2 address  to 2 -> 1 address  and change the head to tail:



        
    }
}