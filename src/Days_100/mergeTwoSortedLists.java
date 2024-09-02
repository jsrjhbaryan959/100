package Days_100;

import java.util.Scanner;

public class mergeTwoSortedLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        ListNode list1 = null;
        ListNode list2 = null;
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;

        while (ptr1 != null && ptr2 != null){
            if(ptr1.val < ptr2.val){
                dummy.next = ptr1;
                ptr1 = ptr1.next;
            }
            else{
                dummy.next = ptr2;
                ptr2 = ptr2.next;
            }
            dummy = dummy.next;
        }

        if(ptr1 == null){
            dummy.next = ptr2;
        }
        else{
            dummy.next = ptr1;
        }
        System.out.println(ans.next);
    }
}
