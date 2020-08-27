package com.trustno1.easy.no001to100;

import com.trustno1.appStart.base.topic;

import java.util.Arrays;

/**
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * 
 * 示例 1:
 * 给定 nums = [3,2,2,3], val = 3,
 * 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 * 示例 2:
 * 给定 nums = [0,1,2,2,3,0,4,2], val = 2,
 * 函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
 * 注意这五个元素可为任意顺序。
 * 你不需要考虑数组中超出新长度后面的元素。
 */
public class No0027 extends topic {

  @Override
  public void start() {
    int[] numbers1 = new int[] {3, 2, 2, 3};
    int val1 = 3;
    int[] numbers2 = new int[] {0, 1, 2, 2, 3, 0, 4, 2};
    int val2 = 2;

    System.out.println("input: " + Arrays.toString(numbers1) + ", output length is " + removeElement(numbers1, val1));
    System.out.println("input: " + Arrays.toString(numbers2) + ", output length is " + removeElement(numbers2, val2));
  }

  private int removeElement(int[] numbers, int val) {
    if (numbers == null || numbers.length == 0)
      return 0;
    if (numbers.length == 1)
      return numbers[0] != val ? 1 : 0;

    int p = 0;
    int count = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] != val) {
        if (i != p) {
          numbers[p] = numbers[i];
        }
        p++;
        count++;
      }
    }
    return count;
  }
}
