/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        if(node == null || node.next == null){
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
        // if(head.val == val){
        //     head.next = head;
        // }
        // ListNode temp = head ;
        // // if(head.next == null){
        // //     head = null;
        // //     return head;
        // // }
        // while(temp.next!=null){
        //     if(temp.next.val == val){
        //         temp.next = temp.next.next;
        //         break;
        //     }
        //     temp = temp.next;
        // }
        //return head;
    }
}