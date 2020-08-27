package com.trustno1.easy.no001to100;

import com.trustno1.appStart.base.topic;

import java.util.Arrays;

/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * 示例 1:
 * 给定数组 nums = [1,1,2],
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 * 示例 2:
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * 你不需要考虑数组中超出新长度后面的元素。
 */
public class No0026 extends topic {

  @Override
  public void start() {
    int[] numbers1 = new int[] {1, 1, 2};
    int[] numbers2 = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

    System.out.println("input: " + Arrays.toString(numbers1) + ", Output length is " + removeDuplicates(numbers1));
    System.out.println("input: " + Arrays.toString(numbers2) + ", Output length is " + removeDuplicates(numbers2));
    System.out.println("======================="  + getClass().getName() + "===================================");
  }

  private int removeDuplicates(int[] numbers) {
    if (numbers == null || numbers.length == 0)
      return 0;
    if (numbers.length == 1)
      return 1;
    int count = 0;
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[count] != numbers[i]) {
        count++;
        numbers[count] = numbers[i];
      }
    }
    return count + 1;
  }
}
