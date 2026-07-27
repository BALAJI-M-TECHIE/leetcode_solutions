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
    public ListNode oddEvenList(ListNode head) {

        // connect the odd to odd , store the even index and place it to the tail continuoslyy :

       


        if(head == null || head.next == null)
        {
            return head;
        }

       

        int count = countNode(head);
        if(count%2 == 1)
        {
            
        ListNode tail = head ;
        while(tail.next!=null)
        {
            tail = tail.next;
        }

        ListNode temp = head;
        ListNode end = tail;
        while(temp!=end)
        {
            ListNode preserve = temp.next;
           temp.next =  temp.next.next;
           tail.next = preserve;
           tail = tail.next;
           temp = temp.next;
        }

        tail.next = null;

        }
        else
        {
                 ListNode tail = head ;
              while(tail.next.next!=null)
        {
            tail = tail.next;
        }

        ListNode last = tail.next ; // 8 address : 

        ListNode temp = head;
        ListNode end = tail;
        while(temp!=end)
        {
            ListNode preserve = temp.next;
           temp.next =  temp.next.next;
           tail.next = preserve;
           tail = tail.next;
           temp = temp.next;
        }

        tail.next = last;
        tail = tail.next;
        tail.next = null;
        }
        return head;
        
    }

    int countNode(ListNode head)
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