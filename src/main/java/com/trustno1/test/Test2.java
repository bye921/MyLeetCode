package com.trustno1.test;

import com.trustno1.appStart.base.topic;
import org.apache.commons.lang3.math.NumberUtils;

public class Test2 extends topic {

  @Override
  public void start() {
    // final String regExp = "-?[0-9]+.?[0-9]*";
    // System.out.println("".matches(regExp));
    // System.out.println(" ".matches(regExp));
    // System.out.println("0".matches(regExp));
    // System.out.println("+0".matches(regExp));
    // System.out.println("-0".matches(regExp));
    // System.out.println("-10.6".matches(regExp));
    // System.out.println("-10.00".matches(regExp));
    // System.out.println("-555".matches(regExp));
    // System.out.println("20.6".matches(regExp));
    // System.out.println("20.00".matches(regExp));
    // System.out.println("+30.6".matches(regExp));
    // System.out.println("666".matches(regExp));
    // System.out.println("+777".matches(regExp));
    // System.out.println("12 3".matches(regExp));
    // System.out.println("ab2c".matches(regExp));
    // System.out.println("12-3".matches(regExp));
    // System.out.println("cost".matches(regExp));
    // System.out.println("@^&*%".matches(regExp));

    System.out.println(NumberUtils.isCreatable(""));
    System.out.println(NumberUtils.isCreatable(" "));
    System.out.println(NumberUtils.isCreatable("0"));
    System.out.println(NumberUtils.isCreatable("+0"));
    System.out.println(NumberUtils.isCreatable("-0"));
    System.out.println(NumberUtils.isCreatable("-10.6"));
    System.out.println(NumberUtils.isCreatable("-10.00"));
    System.out.println(NumberUtils.isCreatable("-555"));
    System.out.println(NumberUtils.isCreatable("20.6"));
    System.out.println(NumberUtils.isCreatable("20.00"));
    System.out.println(NumberUtils.isCreatable("+30.6"));
    System.out.println(NumberUtils.isCreatable("666"));
    System.out.println(NumberUtils.isCreatable("+777"));
    System.out.println(NumberUtils.isCreatable("12 3"));
    System.out.println(NumberUtils.isCreatable("ab2c"));
    System.out.println(NumberUtils.isCreatable("12-3"));
    System.out.println(NumberUtils.isCreatable("cost"));
    System.out.println(NumberUtils.isCreatable("@^&*%"));
    System.out.println("======================="  + getClass().getName() + "===================================");
  }
}
