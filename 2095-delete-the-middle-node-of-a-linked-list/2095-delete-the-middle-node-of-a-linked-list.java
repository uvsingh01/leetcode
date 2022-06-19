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
        if(head==null || head.next==null){
            return null;
        }
        ListNode node= head;
        int len=0;
        while(node.next!=null){
            len++;
            node=node.next;
        }
        if(len%2!=0){
            len=(len/2)+1;
        }
        else{
            len=len/2;
        }
        ListNode temp= head;
        for(int i=0; i<len-1; i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}