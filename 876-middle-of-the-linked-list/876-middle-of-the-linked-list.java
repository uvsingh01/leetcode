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
    public int size(ListNode head){
        ListNode temp= head;
        int size = 0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
        
    }
    public ListNode get(int index, ListNode head){
         ListNode temp= head;
        for(int i=1; i<=index; i++){
            temp=temp.next;
        }
        return temp;
    }
    public ListNode middleNode(ListNode head) {
        int size = size(head)/2;
        return get(size, head);
        
    }
}