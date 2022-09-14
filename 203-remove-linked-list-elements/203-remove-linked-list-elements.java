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
    
    // public ListNode get(int index , ListNode head){
    //     ListNode temp = head;
    //     for(int i=1; i<index; i++){
    //         temp=temp.next;
    //     }
    //     return temp;
    // }
    
    public ListNode removeElements(ListNode head, int val) {
        ListNode Node = new ListNode(0, head);
        ListNode node =Node;
        while(node !=null && node.next!=null){
            if(node.next.val==val){
                node.next=node.next.next;
            }
            else{
                node=node.next;
            }
        }
        return Node.next;
        // ListNode f = new ListNode(-1, head);
        // ListNode node = f;
        // while( node != null && node.next != null){
        //     if(node.next.val == val)
        //         node.next = node.next.next;
        //     else
        //         node = node.next;
        // }
        // return f.next;
    }
}