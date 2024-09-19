class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

}

public class ll {
    public static boolean hasCycle(ListNode head) {

        if (head == null)
            return false;

        ListNode hear = head;
        ListNode turtle = head;

        while (hear != null && hear.next != null) {
            hear = hear.next.next;
            turtle = turtle.next;

            if (hear == turtle) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode sec = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        head.next = sec;
        sec.next = third;
        third.next = fourth;
        fourth.next = sec;

        ll ans = new ll();
        boolean result = ans.hasCycle(head);

        if (result) {
            System.out.println("Cycle detected");
        } else {
            System.out.println("not detected");
        }
    }
}
