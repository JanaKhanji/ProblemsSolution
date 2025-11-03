// https://leetcode.com/problems/merge-two-sorted-lists/

class MergeTwoSortedLists {
  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummy = new ListNode(0);
    ListNode current = dummy;
  
    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
          current.next = list1;
          list1 = list1.next;
      } else {
          current.next = list2;
          list2 = list2.next;
      }
      current = current.next;
    }

    if (list1 != null) {
        current.next = list1;
    } else {
        current.next = list2;
    }
   return dummy.next;
  }

  public static void main(String[] args) {
    ListNode list1 = ListNode.getListNode(new int[]{1, 2, 4});
    ListNode list2 = ListNode.getListNode(new int[]{1, 3, 4});

    ListNode.logListNode(mergeTwoLists(list1, list2));   
	}


  // ListNode CLass:
  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    public static ListNode getListNode(int[] list) {
      if (list == null || list.length == 0) {
        return null;
    }
      ListNode listNode = new ListNode(list[0]);
      ListNode current = listNode;
      for (int i = 1; i < list.length; i++) {
        current.next = new ListNode(list[i]);
        current = current.next;
      }
      return listNode;
    }

    public static void logListNode(ListNode list) {
      ListNode element = list;
      StringBuilder str = new StringBuilder();
      
      while (element != null) {
        str.append(element.val);
        if (element.next != null) {
            str.append(", ");
        }
        element = element.next;
      }
      System.out.println(str);
    }
}


  
}