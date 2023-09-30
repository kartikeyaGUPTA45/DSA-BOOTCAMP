class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode fowd = curr.next;

            curr.next = prev;

            prev = curr;
            curr = fowd;
        }

        return prev;
    }
}
