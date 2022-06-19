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
    public boolean isPalindrome(ListNode heead) {
        ListNode temp=heead;
        while(temp!=null){
            insertLast(temp.val);
            temp=temp.next;
        }
        ListNode node= heead;
        Node heaad= reverseList(head);
        while(node!=null){
            if(node.val!=heaad.value){
                return false;
            }
            node=node.next;
            heaad=heaad.next;
        }
        return true;
    }
    
    private Node head;
    private Node tail;
    private int size=0;

    class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next = next;
        }
    }
    
    public void insertLast(int val){
        if(tail==null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail =  node;
        size++;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public Node reverseList(Node head) {
        if(head==null){
            return head;
        }
        // ListNode node = head;
        Node prev= null;
        while(head!=null){
            Node temp = head.next;
            head.next=prev;
            prev=head;
            head=temp;  
        }
        return prev;
    }

}
