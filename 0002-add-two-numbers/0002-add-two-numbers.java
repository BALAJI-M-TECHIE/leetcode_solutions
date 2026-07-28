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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        // creating new linkedList else we have to handle it based on the larger length of the 2 given node to return if we do replace in order elements:

        
        

        int carry = ((temp1.val + temp2.val)>9)? 1:0;
        ListNode fin =new ListNode((temp1.val+temp2.val)-(carry*10) );
        ListNode head = fin;
        temp1 = temp1.next;
        temp2 = temp2.next;
        

        
        //ListNode temp = result;

        while(temp1!=null && temp2!=null)
        {

        
            int sum = temp1.val + temp2.val+carry;
            if(sum>9)
            {
                carry = 1;
            }
            else
            {
                carry = 0;
            }

            fin.next =new ListNode(sum%10);
            fin = fin.next;
            temp1 = temp1.next;
            temp2 = temp2.next;

        }

while(temp1!=null )
        {

        
            int sum = temp1.val +carry;
            if(sum>9)
            {
                carry = 1;
            }
            else
            {
                carry = 0;
            }

            fin.next =new ListNode(sum%10);
            fin = fin.next;
            temp1 = temp1.next;
           

        }
 while(temp2!=null )
        {

        
            int sum =  temp2.val+carry;
            if(sum>9)
            {
                carry = 1;
            }
            else
            {
                carry = 0;
            }

            fin.next =new ListNode(sum%10);
            fin= fin.next;
            
            temp2 = temp2.next;

        }

        if(carry == 1)
        {
            fin.next  = new ListNode(1);
              fin= fin.next;
         
        }

fin.next = null;
return head;
        
    }
}