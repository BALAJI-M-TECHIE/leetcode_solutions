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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null || (head.next == null && n>0))
        {
            return null;
        }

        int count = nodeCount(head);

        int pos = count - n +1;
        
        ListNode temp = head;
        while(temp!=null)
        {
            pos--;
            if(pos == 1)
            {
                temp.next = temp.next.next;
                break;
            }
            if(pos == 0) // only for the len 2 and n =2 4
            {
                head = head.next;
            }
           temp = temp.next;
        }


     return head;   
    }

    int nodeCount(ListNode head)
    {
        int count = 0;

        while(head!=null)
        {
            count++;
            head = head.next;
        }
        return count;
    }
}