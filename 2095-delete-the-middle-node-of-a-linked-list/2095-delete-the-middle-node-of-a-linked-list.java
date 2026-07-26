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
    public ListNode deleteMiddle(ListNode head) {

        int count = countNode(head);
        int mid  = count/2+1;

        ListNode temp = head;

        if(head == null || head.next == null)
        {
            return null;
        }

        while(temp!=null)
        {
            mid--;
            if(mid == 1)
            {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }

        return head;
        
    }

    int countNode(ListNode head)
    {
        int count = 0;
        while(head!=null)
        {count++;
        head = head.next;
        }
        return count;
    }
}