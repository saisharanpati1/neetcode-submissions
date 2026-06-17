// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */

// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         if(head==null||head.next==null){
//             head=null;
//             return head;
//         }
//         int length=0;
//         ListNode cur=head;
//         while(cur!=null){
//             length++;
//             cur=cur.next;
//         }
//         length++;
//         if(length!=0 && length-n==0){
//             head=head.next;
//         }
//         ListNode temp=head;
//         for(int i =1;i<length-n;i++){
//             temp=temp.next;
//         }
        
//         temp.next=temp.next.next;

//         return head;
//     }
// }



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
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        ListNode curr=head;
        if(length!=0 && length-n==0){
            head=head.next;
            return head;
        }
        for(int i=1;i<length-n;i++){
            curr=curr.next;
        }
        if(head.next==null){
            head=null;
            return head;
        }
        curr.next=curr.next.next;
        return head;
        
    }
}
