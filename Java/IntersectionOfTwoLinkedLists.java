/* Leetcode Problem 160.

Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
begin to intersect at node c1.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
*/

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		
        int lengthA = 0;
        int lengthB = 0;
		
        ListNode current = headA;
		
        while(current != null){
            lengthA++;
            current = current.next;
        }
		
        current = headB;
		
        while(current != null){
            lengthB++;
            current = current.next;
        }
		
        int diff = Math.abs(lengthA - lengthB);
		
        while(diff != 0){
            if(lengthA > lengthB)
                headA = headA.next;
            else
                headB = headB.next;
            diff--;
        }
		
        while(headA != null && headB != null){
            if(headA == headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
