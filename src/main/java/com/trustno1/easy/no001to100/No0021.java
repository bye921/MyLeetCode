package com.trustno1.easy.no001to100;

import com.trustno1.appStart.base.topic;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class No0021 extends topic {

  @Override
  public void start() {
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(4);
    n1.next = n2;
    n2.next = n3;
    n3.next = null;

    ListNode n4 = new ListNode(1);
    ListNode n5 = new ListNode(3);
    ListNode n6 = new ListNode(4);
    n4.next = n5;
    n5.next = n6;
    n6.next = null;

    ListNode l = mergeTwoLists(n1, n4);
    while (l.next != null) {
      System.out.print(l.val + " -> ");
      l = l.next;
    }
    System.out.print(l.val);
    System.out.println();
    System.out.println("======================="  + getClass().getName() + "===================================");
  }

  private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null && l2 == null)
      return null;
    if (l1 == null)
      return l2;
    if (l2 == null)
      return l1;
    ListNode temp = new ListNode(0);
    ListNode newHead = temp;

    while (l1 != null && l2 != null) {
      if (l1.val <= l2.val) {
        newHead.next = l1;
        l1 = l1.next;
      } else {
        newHead.next = l2;
        l2 = l2.next;
      }
      newHead = newHead.next;
    }
    newHead.next = l1 == null ? l2 : l1;
    return temp.next;
  }

  private ListNode mergeTwoListsRecursion(ListNode l1, ListNode l2) {
    if (l1 == null && l2 == null)
      return null;
    if (l1 == null)
      return l2;
    if (l2 == null)
      return l1;
    if (l1.val < l2.val) {
      l1.next = mergeTwoListsRecursion(l1.next, l2);
      return l1;
    } else {
      l2.next = mergeTwoListsRecursion(l1, l2.next);
      return l2;
    }
  }

  private static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }
}
