package com.trustno1.easy.no001to100;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * 1.左括号必须用相同类型的右括号闭合。
 * 2.左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 * 输入: "()"
 * 输出: true
 *
 * 示例 2:
 * 输入: "()[]{}"
 * 输出: true
 *
 * 示例 3:
 * 输入: "(]"
 * 输出: false
 *
 * 示例 4:
 * 输入: "([)]"
 * 输出: false
 *
 * 示例 5:
 * 输入: "{[]}"
 * 输出: true
 *
 */
public class No0020 {

  public static void main(String[] args) {
    String strings1 = "[({(())}[()])]";
    String strings2 = "()[]{}";
    String strings3 = "(]";
    String strings4 = "([)]";
    String strings5 = "{[]})";
    String strings6 = "{";
    String strings7 = "((";
    String strings8 = "}(){";
    String strings9 = "([()])";
    String strings10 =
        "[([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([()])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])]";

    System.out.println("input : " + strings1 + " , output : " + isValidStack(strings1));
    System.out.println("input : " + strings2 + " , output : " + isValidStack(strings2));
    System.out.println("input : " + strings3 + " , output : " + isValidStack(strings3));
    System.out.println("input : " + strings4 + " , output : " + isValidStack(strings4));
    System.out.println("input : " + strings5 + " , output : " + isValidStack(strings5));
    System.out.println("input : " + strings6 + " , output : " + isValidStack(strings6));
    System.out.println("input : " + strings7 + " , output : " + isValidStack(strings7));
    System.out.println("input : " + strings8 + " , output : " + isValidStack(strings8));
    System.out.println("input : " + strings9 + " , output : " + isValidStack(strings9));
    System.out.println("input : " + strings10 + " , output : " + isValidStack(strings10));
  }

  private static boolean isValid(String s) {
    if (s == null || s.isEmpty())
      return true;
    if (s.length() % 2 != 0)
      return false;

    LinkedList<String> list = new LinkedList<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      list.add(String.valueOf(c));
    }

    while (!list.isEmpty()) {
      int indexLeft;
      int indexRight;
      boolean noMore1 = false;
      boolean noMore2 = false;
      boolean noMore3 = false;

      if ((list.contains("(") && !list.contains(")")) || (!list.contains("(") && list.contains(")")) ||
          (list.contains("[") && !list.contains("]")) || (!list.contains("[") && list.contains("]")) ||
          (list.contains("{") && !list.contains("}")) || (!list.contains("{") && list.contains("}"))) {
        return false;
      }

      indexLeft = list.lastIndexOf("(");
      indexRight = list.indexOf(")");
      if (!list.contains("(") && !list.contains(")")) {
        noMore1 = true;
      } else {
        if (indexLeft == list.size() - 1 || indexRight == 0) {
          return false;
        } else if (indexLeft + 1 == indexRight) {
          list.remove(indexRight);
          list.remove(indexLeft);
          if (list.isEmpty())
            return true;
        } else if (")".equals(list.get(indexLeft + 1))) {
          list.remove(indexLeft + 1);
          list.remove(indexLeft);
          if (list.isEmpty())
            return true;
        } else if ("(".equals(list.get(indexRight - 1))) {
          list.remove(indexRight);
          list.remove(indexRight - 1);
          if (list.isEmpty())
            return true;
        } else {
          noMore1 = true;
        }
      }

      indexLeft = list.lastIndexOf("[");
      indexRight = list.indexOf("]");
      if (!list.contains("[") && !list.contains("]")) {
        noMore1 = true;
      } else {
        if (indexLeft == list.size() - 1 || indexRight == 0) {
          return false;
        } else if (indexLeft + 1 == indexRight) {
          list.remove(indexRight);
          list.remove(indexLeft);
          if (list.isEmpty())
            return true;
        } else if ("]".equals(list.get(indexLeft + 1))) {
          list.remove(indexLeft + 1);
          list.remove(indexLeft);
          if (list.isEmpty())
            return true;
        } else if ("[".equals(list.get(indexRight - 1))) {
          list.remove(indexRight);
          list.remove(indexRight - 1);
          if (list.isEmpty())
            return true;
        } else {
          noMore2 = true;
        }
      }

      indexLeft = list.lastIndexOf("{");
      indexRight = list.indexOf("}");
      if (!list.contains("{") && !list.contains("}")) {
        noMore3 = true;
      } else {
        if (indexLeft == list.size() - 1 || indexRight == 0) {
          return false;
        } else if (indexLeft + 1 == indexRight) {
          list.remove(indexRight);
          list.remove(indexLeft);
          if (list.isEmpty())
            return true;
        } else if ("}".equals(list.get(indexLeft + 1))) {
          list.remove(indexLeft + 1);
          list.remove(indexLeft);
          if (list.isEmpty())
            return true;
        } else if ("{".equals(list.get(indexRight - 1))) {
          list.remove(indexRight);
          list.remove(indexRight - 1);
          if (list.isEmpty())
            return true;
        } else {
          noMore3 = true;
        }
      }

      if (noMore1 && noMore2 && noMore3)
        return false;
    }
    return list.isEmpty();
  }

  private static boolean isValidStack(String s) {
    if (s == null || s.isEmpty())
      return true;
    if (s.length() % 2 != 0)
      return false;

    Map<Character, Character> map = new HashMap<>();
    map.put('(', ')');
    map.put('[', ']');
    map.put('{', '}');

    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      if (stack.empty()) {
        stack.push(s.charAt(i));
      } else {
        if (map.containsKey(stack.peek()) && map.get(stack.peek()) == s.charAt(i)) {
          stack.pop();
        } else {
          stack.push(s.charAt(i));
        }
      }
    }
    return stack.empty();
  }
}
