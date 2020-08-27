package com.trustno1.easy.no001to100;

import com.trustno1.appStart.base.topic;

import java.util.Arrays;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 *
 * 说明:
 * 所有输入只包含小写字母 a-z 。
 */
public class No0014 extends topic {

  @Override
  public void start() {
    String[] strings1 = new String[] {"flower", "flow", "flight", "flowers"};
    String[] strings2 = new String[] {"baab", "bacb", "b", "cbc"};
    String[] strings3 = new String[] {"dog", "racecar", "car"};
    String[] strings4 = new String[] {"bird"};
    String[] strings5 = new String[] {};

    System.out.println("input : " + Arrays.toString(strings1) + " , output : " + longestCommonPrefix(strings1));
    System.out.println("input : " + Arrays.toString(strings2) + " , output : " + longestCommonPrefix(strings2));
    System.out.println("input : " + Arrays.toString(strings3) + " , output : " + longestCommonPrefix(strings3));
    System.out.println("input : " + Arrays.toString(strings4) + " , output : " + longestCommonPrefix(strings4));
    System.out.println("input : " + Arrays.toString(strings5) + " , output : " + longestCommonPrefix(strings5));
  }

  private String longestCommonPrefix(String[] strs) {
    if (strs.length == 0)
      return "";
    if (strs.length == 1)
      return strs[0];
    String preFix = "";
    char[] chars0 = strs[0].toCharArray();
    char[] chars1 = strs[1].toCharArray();
    for (int i = 0; i < chars0.length; i++) {
      if (i < chars1.length) {
        if (chars0[i] == chars1[i]) {
          preFix = preFix.concat(String.valueOf(chars0[i]));
        } else {
          break;
        }
      } else {
        break;
      }
    }
    if (strs.length == 2 || preFix.length() == 0) {
      return preFix;
    } else {
      String newPreFix = "";
      for (int k = 2; k < strs.length; k++) {
        String sub;
        if (strs[k].length() < preFix.length()) {
          sub = strs[k];
        } else {
          sub = strs[k].substring(0, preFix.length());
        }
        if (!preFix.equals(sub)) {
          char[] preFixChars = preFix.toCharArray();
          for (int m = 0; m < sub.toCharArray().length; m++) {
            if (preFixChars[m] == sub.toCharArray()[m]) {
              newPreFix = newPreFix.concat(String.valueOf(preFixChars[m]));
            } else {
              if (m == 0)
                return "";
            }
          }
          if (newPreFix.length() == 0)
            return "";
          preFix = newPreFix;
        }
      }
    }
    return preFix;
  }
}
