package com.trustno1.easy.no001to100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target,请你在该数组中找出和为目标值的那两个整数,并返回他们的数组下标.
 * 你可以假设每种输入只会对应一个答案.但是,你不能重复利用这个数组中同样的元素.
 * <p>
 * 示例：
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class No0001 {

  public static void main(String[] args) {

    int[] numbers1 = new int[] {11, 7, 15, 2};
    int[] numbers2 = new int[] {11, 0, 15, 0};
    int[] numbers3 = new int[] {-1, -3, -5, -9};
    int[] numbers4 = new int[] {3, -2, -8, 1};
    int[] numbers5 = new int[] {3, 3};

    int target1 = 9;
    int target2 = 0;
    int target3 = -8;
    int target4 = -5;
    int target5 = 6;

    callAndPrint(numbers1, target1);
    callAndPrint(numbers2, target2);
    callAndPrint(numbers3, target3);
    callAndPrint(numbers4, target4);
    callAndPrint(numbers5, target5);
  }

  private static int[] twoSum(int[] numbers, int target) {
    for (int i = 0; i < numbers.length - 1; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] + numbers[j] == target) {
          return new int[] {i, j};
        }
      }
    }
    return new int[2];
  }

  private static int[] twoSum_Hash(int[] numbers, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < numbers.length; i++) {
      int x = target - numbers[i];
      if (map.containsKey(x)) {
        return new int[] {map.get(x), i};
      }
      map.put(numbers[i], i);
    }
    return new int[2];
  }

  private static void callAndPrint(int[] numbers, int target) {
    System.out.println("numbers: " + Arrays.toString(numbers) + " target: " + target);
    int[] output = twoSum(numbers, target);
    System.out.println("solution1: " + Arrays.toString(output));
    int[] output2 = twoSum_Hash(numbers, target);
    System.out.println("solution2: " + Arrays.toString(output2));
  }
}
