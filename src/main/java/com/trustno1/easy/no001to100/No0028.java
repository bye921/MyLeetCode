package com.trustno1.easy.no001to100;

/**
 * 实现 strStr() 函数。
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

 * 示例 1:
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 *
 * 示例 2:
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 *
 * 说明:
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 */
public class No0028 {

    public static void main( String[] args ) {
        String haystack1 = "hello";
        String needle1 = "ll";
        String haystack2 = "aaaaa";
        String needle2 = "bba";
        String haystack3 = "abcdefg";
        String needle3 = "";
        String haystack4 = "";
        String needle4 = "aa";
        String haystack5 = "";
        String needle5 = "";
        String haystack6 = "hello,hellollll";
        String needle6 = "ll";
        String haystack7 = "mississippi";
        String needle7 = "issip";
        String haystack8 = "apollooopolyo";
        String needle8 = "poly";

        System.out.println("haystack: " + haystack1 + ", needle: " + needle1 + ", output: " + strStr(haystack1, needle1));
        System.out.println("haystack: " + haystack2 + ", needle: " + needle2 + ", output: " + strStr(haystack2, needle2));
        System.out.println("haystack: " + haystack3 + ", needle: " + needle3 + ", output: " + strStr(haystack3, needle3));
        System.out.println("haystack: " + haystack4 + ", needle: " + needle4 + ", output: " + strStr(haystack4, needle4));
        System.out.println("haystack: " + haystack5 + ", needle: " + needle5 + ", output: " + strStr(haystack5, needle5));
        System.out.println("haystack: " + haystack6 + ", needle: " + needle6 + ", output: " + strStr(haystack6, needle6));
        System.out.println("haystack: " + haystack7 + ", needle: " + needle7 + ", output: " + strStr(haystack7, needle7));
        System.out.println("haystack: " + haystack8 + ", needle: " + needle8 + ", output: " + strStr(haystack8, needle8));
    }

    /**
     * 直接调用库函数，其实一开始写的时候是直接调用indexOf......
     *
     * @param haystack input
     * @param needle target
     * @return position
     */
    private static int strStr(String haystack, String needle) {
        if (needle == null || "".equals(needle)) return 0;
        if (haystack == null || "".equals(haystack)) return -1;

        int i = 0;
        while (i + needle.length() <= haystack.length()) {
            String s = haystack.substring(i, i + needle.length());
            if (needle.equals(s)) {
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

    /**
     * 暴力匹配，居然花了我136ms
     *
     * @param haystack input
     * @param needle target
     * @return position
     */
    private static int strStr2(String haystack, String needle) {
        if (needle == null || "".equals(needle)) return 0;
        if (haystack == null || "".equals(haystack)) return -1;

        int p = 0;
        String temp = "";
        for (int i = 0; i < needle.length(); i++) {
            for (int j = p; j < haystack.length(); j++) {
                String h = haystack.substring(j, j + 1);
                String n = needle.substring(i, i + 1);
                if (h.equals(n)) {
                    p = j;
                    p++;
                    temp = temp.concat(h);
                    break;
                } else {
                    if (!temp.isEmpty()) {
                        i = 0;
                        j = j - temp.length();
                        temp = "";
                    }
                }
            }
            if (temp.equals(needle)) break;
        }
        return temp.equals(needle) ? p - needle.length() : -1;
    }
}
