class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }

        if (list1 == null) {
            return list2;
        } 

        if (list2 == null) {
            return list1;
        }

        ListNode a = list1, b = list2;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(a != null && b != null) {
            if (a.val > b.val) {
                temp.next = b;
                b = b.next;
            } else {
                temp.next = a;
                a = a.next;
            }
            temp = temp.next;
        }

        temp.next = (a != null) ? a:b;

        return dummy.next;
    }
}
