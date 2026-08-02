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
        int c=0,s;
        ListNode d=new ListNode();
        ListNode tem=d;
        while(l1!=null && l2!=null)
        {
            s=l1.val+l2.val+c;
            ListNode n=new ListNode(s%10);
            c=s/10;
            d.next=n;
            d=d.next;
            l1=l1.next;
            l2=l2.next;
        }
            while(l1!=null )
            {
            s=l1.val+c;
            ListNode n=new ListNode(s%10);
            c=s/10;
            d.next=n;
            d=d.next;
            l1=l1.next;   
            }
            while(l2!=null )
            {
            s=l2.val+c;
            ListNode n=new ListNode(s%10);
            c=s/10;
            d.next=n;
            d=d.next;
            l2=l2.next;   
            }
            if(c!=0)
            {
                ListNode n=new ListNode(c);
                d.next=n;
            }
            
        
        return tem.next;
        
    }
}