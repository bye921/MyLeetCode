package com.trustno1.easy.no001to100;

import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * 字符 数值
 * I 1
 * V 5
 * X 10
 * L 50
 * C 100
 * D 500
 * M 1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，
 * 所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 *
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 *
 * 示例 1:
 * 输入: "III"
 * 输出: 3
 *
 * 示例 2:
 * 输入: "IV"
 * 输出: 4
 *
 * 示例 3:
 * 输入: "IX"
 * 输出: 9
 *
 * 示例 4:
 * 输入: "LVIII"
 * 输出: 58
 * 解释: L = 50, V= 5, III = 3.
 *
 * 示例 5:
 * 输入: "MCMXCIV"
 * 输出: 1994
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 */
public class No0013 {

  public static void main(String[] args) {
    String str1 = "III";
    String str2 = "IV";
    String str3 = "IX";
    String str4 = "LVIII";
    String str5 = "MCMXCIV";

    System.out.println("input : " + str1 + " expect : 3, output : " + romanToInt(str1));
    System.out.println("input : " + str2 + " expect : 4, output : " + romanToInt(str2));
    System.out.println("input : " + str3 + " expect : 9, output : " + romanToInt(str3));
    System.out.println("input : " + str4 + " expect : 58, output : " + romanToInt(str4));
    System.out.println("input : " + str5 + " expect : 1994, output : " + romanToInt(str5));
  }

  private static int romanToInt(String s) {
    int number = 0;
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      Boolean b = false;
      if (i < chars.length - 1) {
        switch (chars[i] + "" + chars[i + 1]) {
          case "IV":
            number += 4;
            i++;
            b = true;
            break;
          case "IX":
            number += 9;
            i++;
            b = true;
            break;
          case "XL":
            number += 40;
            i++;
            b = true;
            break;
          case "XC":
            number += 90;
            i++;
            b = true;
            break;
          case "CD":
            number += 400;
            i++;
            b = true;
            break;
          case "CM":
            number += 900;
            i++;
            b = true;
            break;
        }
      }
      if (b)
        continue;
      switch (chars[i]) {
        case 'M':
          number += 1000;
          break;
        case 'D':
          number += 500;
          break;
        case 'C':
          number += 100;
          break;
        case 'L':
          number += 50;
          break;
        case 'X':
          number += 10;
          break;
        case 'V':
          number += 5;
          break;
        case 'I':
          number += 1;
          break;
      }
    }
    return number;
  }

  private static int romanToInt_Map(String s) {
    int number = 0;
    Map<String, Integer> map = new HashMap<>();
    map.put("I", 1);
    map.put("V", 5);
    map.put("X", 10);
    map.put("L", 50);
    map.put("C", 100);
    map.put("D", 500);
    map.put("M", 1000);
    map.put("IV", 4);
    map.put("IX", 9);
    map.put("XL", 40);
    map.put("XC", 90);
    map.put("CD", 400);
    map.put("CM", 900);
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      Boolean b = false;
      if (i < chars.length - 1) {
        if (map.containsKey(chars[i] + "" + chars[i + 1])) {
          number += map.get(chars[i] + "" + chars[i + 1]);
          i++;
          b = true;
        }
      }
      if (b)
        continue;
      if (map.containsKey(String.valueOf(chars[i]))) {
        number += map.get(String.valueOf(chars[i]));
      }
    }
    return number;
  }
}
