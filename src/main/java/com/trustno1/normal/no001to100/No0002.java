package com.trustno1.normal.no001to100;

import java.util.Arrays;
import java.util.List;
import com.trustno1.appStart.base.topic;

/**
 * 给出两个非空的链表用来表示两个非负的整数.其中,它们各自的位数是按照逆序的方式存储的,并且它们的每个节点只能存储一位数字.
 * 如果,我们将这两个数相加起来,则会返回一个新的链表来表示它们的和.
 * 您可以假设除了数字0之外,这两个数都不会以0开头.
 *
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class No0002 extends topic {

  @Override
  public void start() {
    List<Integer> l1 = Arrays.asList(2, 4, 3);
    List<Integer> l2 = Arrays.asList(5, 6, 4);

    // System.out.println(addTwoNumbers(l1, l2).toString());
    System.out.println("=======================" + getClass().getName() + "===================================");
  }

  private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    return new ListNode(1);
  }

  // Definition for singly-linked list.
  private static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) { val = x; }
  }
}
