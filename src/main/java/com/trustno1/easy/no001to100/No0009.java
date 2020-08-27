package com.trustno1.easy.no001to100;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 * 输入: 121
 * 输出: true
 *
 * 示例 2:
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 *
 * 示例 3:
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
public class No0009 {

  public static void main(String[] args) {
    int int1 = 1;
    int int2 = 121;
    int int3 = -121;
    int int4 = 10;
    int int5 = 1561;
    int int6 = 5335;

    System.out.println("input : " + int1 + " , output : " + isPalindrome2(int1));
    System.out.println("input : " + int2 + " , output : " + isPalindrome2(int2));
    System.out.println("input : " + int3 + " , output : " + isPalindrome2(int3));
    System.out.println("input : " + int4 + " , output : " + isPalindrome2(int4));
    System.out.println("input : " + int5 + " , output : " + isPalindrome2(int5));
    System.out.println("input : " + int6 + " , output : " + isPalindrome2(int6));
  }

  private static boolean isPalindrome(int x) {
    if (x < 0)
      return false;
    if (x < 10)
      return true;
    char[] chars = String.valueOf(x).toCharArray();
    for (int start = 0, end = chars.length - 1; start < end; start++, end--) {
      if (chars[start] != chars[end]) {
        return false;
      }
    }
    return true;
  }

  private static boolean isPalindrome2(int x) {
    if (x < 0)
      return false;
    if (x < 10)
      return true;
    if (x % 10 == 0)
      return false;
    int a = x;
    int t = 0;
    while (x > 0) {
      t = t * 10 + x % 10;
      x /= 10;
    }
    return t == a;
  }
}
