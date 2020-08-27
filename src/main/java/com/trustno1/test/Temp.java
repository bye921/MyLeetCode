package com.trustno1.test;

import com.trustno1.appStart.base.topic;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;

public class Temp extends topic {

  @Override
  public void start() {
    // String t1 = "20:00";
    // String t2 = "15:00";
    // String t3 = "14:30";
    // min30(t1);
    // min30(t2);
    // min30(t3);

    // String s1 = "CABDEFG";
    // String s2 = "ADEC";
    // String s3 = "DC";
    // String s4 = "CAF";
    // String s5 = "ABCD";
    // String s6 = "";
    // String s7 = "A";
    String s8 = "F";
    String mix = "DACE";
    // strFind(s1, mix);
    // strFind(s2, mix);
    // strFind(s3, mix);
    // strFind(s4, mix);
    // strFind(s5, mix);
    // strFind(s6, mix);
    // strFind(s7, mix);
    strFind(s8, mix);
    System.out.println("======================="  + getClass().getName() + "===================================");
  }

  private static void min30(String in) throws Exception {
    long time = 30 * 60 * 1000;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
    Time limit = new Time(simpleDateFormat.parse("15:00").getTime());
    Time endTime = new Time(simpleDateFormat.parse(in).getTime());

    if (!endTime.before(limit)) {
      Time newTime = new Time(endTime.getTime() - time);
      String xxx = String.valueOf(newTime).substring(0, 5);
      System.out.println(xxx);
    } else {
      System.out.println("no!!!");
    }
  }

  private static void strFind(String s1, String mix) {
    if (s1.isEmpty()) {
      System.out.println("Mix is allowed.");
    } else if (s1.length() > mix.length()) {
      System.out.println("String length is over. " + s1 + " ," + mix);
    } else if (s1.length() == mix.length()) {
      char[] ar1 = s1.toCharArray();
      Arrays.sort(ar1);
      String sortedAr1 = String.valueOf(ar1);
      char[] mixC = mix.toCharArray();
      Arrays.sort(mixC);
      String sortedMix = String.valueOf(mixC);
      if (sortedAr1.equals(sortedMix)) {
        System.out.println("String is all the same, mix is allowed.");
      } else {
        System.out.println("Mix is NOT allowed.");
      }
    } else {
      HashMap<Character, Integer> mixMap = new HashMap<>();
      for (char m : mix.toCharArray()) {
        if (!mixMap.containsKey(m))
          mixMap.put(m, null);
      }
      boolean found = true;
      for (char s : s1.toCharArray()) {
        if (!mixMap.containsKey(s)) {
          found = false;
          break;
        }
      }
      if (found) {
        System.out.println("Mix is allowed.");
      } else {
        System.out.println("Mix is NOT allowed.");
      }
    }
  }
}
