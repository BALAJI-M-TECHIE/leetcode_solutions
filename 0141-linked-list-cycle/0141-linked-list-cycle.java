/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        // storing the memory address and check , if already present means loop detected : , if ll has the null means that is false : 
/*
        if(head==null || head.next == null)
        {
            return false;
        }
        
       ArrayList<ListNode> al = new ArrayList<>();

       ListNode temp = head;
       while(temp!=null)
        {
            if(!al.contains(temp))
            {
                 al.add(temp);
            }
            else
            {
                return true;
            }
           
            temp = temp.next;
        }

        return false;   */

    // The number of the nodes in the list is in the range [0, 10 pow 4].  

    int len = 0;

    ListNode temp = head;

    while(temp!=null)
    {
        len++;
        if(len>10000)
        {
            return true;
        }
        temp= temp.next;
    }
return false;

    }
}