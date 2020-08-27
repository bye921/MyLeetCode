package com.trustno1.test;

import com.trustno1.appStart.base.topic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test extends topic {

  @Override
  public void start() {
    // // 四舍五入
    // long round = Math.round(1.499);
    // long round2 = Math.round(1.5);
    // System.out.println(round);
    // System.out.println(round2);
    //
    // // 向上取整
    // int s = (int)Math.ceil(1.1);
    // System.out.println(s);
    //
    // // 向下取整
    // System.out.println((int)Math.floor(1.6));

    // String time1 = "08:00";
    // String time2 = "08:20";
    // String time3 = "08:20";
    // System.out.println("Compare beteen " + time1 + " & " + time2 + " : " + checkTime(time1, time2));
    // System.out.println("Compare beteen " + time2 + " & " + time3 + " : " + checkTime(time2, time3));
    // System.out.println("Compare beteen " + time2 + " & " + time1 + " : " + checkTime(time2, time1));
    String str = "@";
    System.out.println("str to upper case :" + str.toUpperCase());
    System.out.println("str origin :" + str);
    System.out.println("======================="  + getClass().getName() + "===================================");
  }

  private static int checkTime(String time1, String time2) {
    SimpleDateFormat sdf_JI = new SimpleDateFormat("HH:mm");
    try {
      Date d1 = new Date(sdf_JI.parse(time1).getTime());
      Date d2 = new Date(sdf_JI.parse(time2).getTime());
      return d1.compareTo(d2);
    } catch (ParseException e) {
      e.printStackTrace();
      return 0;
    }
  }
}
