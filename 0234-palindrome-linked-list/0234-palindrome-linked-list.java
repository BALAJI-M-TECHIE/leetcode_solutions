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
    public boolean isPalindrome(ListNode head) {

        // EXTRA SPACE , STORE ALL THE VALUES IN THE ARRAY LIST AND 2 POINTER TO CHECK FOR PALINDROME :

        // brute : 
        ListNode temp = head;
        ArrayList<Integer> al = new ArrayList<>();
        while(temp!=null)
        {
            al.add(temp.val);
            temp=temp.next;
        }

        for(int i =0;i<al.size();i++)
        {
            if(al.get(i)!=al.get(al.size()-1-i))
            {
                return false;
            }
        }
        return true;

        
    }
}