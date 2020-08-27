package com.trustno1.easy.no001to100;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例：
 * 输入: 123
 * 输出: 321
 */
public class No0007 {

  public static void main(String[] args) {
    int int1 = 123;
    int int2 = -123;
    int int3 = 120;
    int int4 = -123456789;
    int int5 = 103;
    int int6 = 0;
    int int7 = 8;
    int int8 = -28;
    int int9 = 1534236469;

    System.out.println("input : " + int1 + " , output : " + reverseInteger2(int1));
    System.out.println("input : " + int2 + " , output : " + reverseInteger2(int2));
    System.out.println("input : " + int3 + " , output : " + reverseInteger2(int3));
    System.out.println("input : " + int4 + " , output : " + reverseInteger2(int4));
    System.out.println("input : " + int5 + " , output : " + reverseInteger2(int5));
    System.out.println("input : " + int6 + " , output : " + reverseInteger2(int6));
    System.out.println("input : " + int7 + " , output : " + reverseInteger2(int7));
    System.out.println("input : " + int8 + " , output : " + reverseInteger2(int8));
    System.out.println("input : " + int9 + " , output : " + reverseInteger2(int9));
  }

  private static int reverseInteger(int number) {
    if (number >= 0 && number < 10) {
      return number;
    } else {
      char[] chars = String.valueOf(number).toCharArray();
      for (int start = 0, end = chars.length - 1; start < end; start++, end--) {
        if (start == 0 && "-".equals(String.valueOf(chars[0])))
          start++;
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
      }
      try {
        return Integer.parseInt(String.valueOf(chars));
      } catch (Exception e) {
        return 0;
      }
    }
  }

  private static int reverseInteger2(int x) {
    int rev = 0;
    while (x != 0) {
      int pop = x % 10;
      x /= 10;
      if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
        return 0;
      if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
        return 0;
      rev = rev * 10 + pop;
    }
    return rev;
  }
}
