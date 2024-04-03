package linkedlist;

//public class MergeSort {

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
//        public ListNode sortList(ListNode head) {
//            if(head == null || head.next == null)
//                return head;
//
//            ListNode mid = findMid(head);
//            ListNode right = sortList(head);
//            ListNode left = sortList(mid);
//
//            return merge(right,left);
//
//        }
//
//        public ListNode merge(ListNode one, ListNode two){
//            ListNode send = new ListNode(-1);
//            ListNode head = send;
//
//            while(one != null && two != null){
//                if(one.val>two.val){
//                    send.next = two;
//                    send = send.next;
//                    two = two.next;
//                }
//                else{
//                    send.next = one;
//                    send = send.next;
//                    one = one.next;
//                }
//            }
//
//            if(one != null){
//                send.next = one;
//            }
//            else
//                send.next = two;
//
//            return head.next;
//        }
//
//
//        public ListNode findMid(ListNode head){
//            ListNode fast = head;
//            ListNode slow = null;
//
//            while(fast != null && fast.next != null){
//                slow = slow == null ? head : slow.next;
//                fast = fast.next.next;
//            }
//
//            ListNode mid = slow.next;
//            slow.next = null;
//            return mid;
//        }
//
//}
