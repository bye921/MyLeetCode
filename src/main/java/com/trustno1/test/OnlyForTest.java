package com.trustno1.test;

import com.trustno1.appStart.base.topic;

public class OnlyForTest extends topic  {

  @Override
  public void start() {
    //Integer.toBinaryString()是将数字用二进制格式显示
    int i = -10;
    System.out.println(i);
    System.out.println(Integer.toBinaryString(i));
    //左移两位
    int j = -10<<2;
    System.out.println(j);
    System.out.println(Integer.toBinaryString(j));
    //右移两位
    int m = -10>>2;
    System.out.println(m);
    System.out.println(Integer.toBinaryString(m));
    //无符号右移
    int n = -10>>>2;
    System.out.println(n);
    System.out.println(Integer.toBinaryString(n));

    int[] aaa = new int[]{1, 2, 3};
    System.out.println(aaa.length);
  }
}
