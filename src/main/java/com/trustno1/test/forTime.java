package com.trustno1.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forTime {

  public static void main(String[] args) {
    List<String> timeList = new ArrayList<>();
    // =CONCAT(TEXT(H94,"yyyy/MM/dd HH:mm:ss"),",",TEXT(I94,"yyyy/MM/dd HH:mm:ss"))
    timeList.add("2020/08/30 08:35:00,2020/08/30 17:37:55");
    timeList.add("2020/08/30 08:35:00,2020/08/30 16:39:09");
    timeList.add("2020/08/30 08:45:00,2020/08/30 20:39:08");
    timeList.add("2020/08/30 08:45:00,2020/08/30 19:19:23");
    timeList.add("2020/08/30 08:45:00,2020/08/30 19:12:28");
    timeList.add("2020/08/30 09:20:00,2020/08/30 19:20:08");
    timeList.add("2020/08/30 09:20:00,2020/08/30 19:15:33");
    timeList.add("2020/08/30 09:20:00,2020/08/30 18:54:15");
    timeList.add("2020/08/30 09:25:00,2020/08/30 22:18:41");
    timeList.add("2020/08/30 09:25:00,2020/08/30 18:51:51");
    timeList.add("2020/08/30 09:25:00,2020/08/30 18:16:09");
    timeList.add("2020/08/30 09:25:00,2020/08/30 17:47:30");
    timeList.add("2020/08/30 09:25:00,2020/08/30 18:52:53");
    timeList.add("2020/08/30 09:40:00,2020/08/30 19:38:06");
    timeList.add("2020/08/30 09:40:00,2020/08/30 19:28:47");
    timeList.add("2020/08/30 09:55:00,2020/08/30 19:20:45");
    timeList.add("2020/08/30 09:55:00,2020/08/30 19:13:52");
    timeList.add("2020/08/30 09:55:00,2020/08/30 17:11:42");
    timeList.add("2020/08/30 09:55:00,2020/08/30 14:12:36");
    timeList.add("2020/08/30 10:00:00,2020/08/30 21:56:03");
    timeList.add("2020/08/30 10:00:00,2020/08/30 19:38:00");
    timeList.add("2020/08/30 10:00:00,2020/08/30 19:18:58");
    timeList.add("2020/08/30 10:05:00,2020/08/30 20:50:11");
    timeList.add("2020/08/30 10:05:00,2020/08/30 18:40:38");
    timeList.add("2020/08/30 10:05:00,2020/08/30 18:38:02");
    timeList.add("2020/08/30 10:05:00,2020/08/30 16:39:05");
    timeList.add("2020/08/30 10:10:00,2020/08/31 02:03:29");
    timeList.add("2020/08/30 10:10:00,2020/08/31 01:07:22");
    timeList.add("2020/08/30 10:20:00,2020/08/30 18:38:59");
    timeList.add("2020/08/30 10:20:00,2020/08/30 19:20:44");
    timeList.add("2020/08/30 10:20:00,2020/08/30 12:15:20");
    timeList.add("2020/08/30 10:35:00,2020/08/30 18:26:25");
    timeList.add("2020/08/30 11:10:00,2020/08/30 18:53:05");
    timeList.add("2020/08/30 11:10:00,2020/08/30 18:38:45");
    timeList.add("2020/08/30 11:10:00,2020/08/30 18:35:56");
    timeList.add("2020/08/30 11:10:00,2020/08/30 17:04:36");
    timeList.add("2020/08/30 11:30:00,2020/08/30 19:16:16");
    timeList.add("2020/08/30 11:30:00,2020/08/30 19:14:07");
    timeList.add("2020/08/30 11:35:00,2020/08/30 20:53:00");
    timeList.add("2020/08/30 11:35:00,2020/08/30 20:11:16");
    timeList.add("2020/08/30 11:45:00,2020/08/30 16:08:51");
    timeList.add("2020/08/30 12:15:00,2020/08/30 17:32:38");
    timeList.add("2020/08/30 12:40:00,2020/08/30 20:05:06");
    timeList.add("2020/08/30 12:50:00,2020/08/30 20:25:47");
    timeList.add("2020/08/30 12:50:00,2020/08/30 18:47:49");
    timeList.add("2020/08/30 12:50:00,2020/08/30 18:40:42");
    timeList.add("2020/08/30 12:50:00,2020/08/30 18:07:02");
    timeList.add("2020/08/30 12:50:00,2020/08/30 11:00:52");
    timeList.add("2020/08/30 10:35:00,2020/08/30 22:01:39");
    timeList.add("2020/08/30 10:35:00,2020/08/30 21:49:12");
    timeList.add("2020/08/30 10:35:00,2020/08/30 21:17:39");
    timeList.add("2020/08/30 10:35:00,2020/08/30 19:22:14");
    timeList.add("2020/08/30 10:35:00,2020/08/30 16:06:12");
    timeList.add("2020/08/30 13:20:00,2020/08/30 19:19:23");
    timeList.add("2020/08/30 13:20:00,2020/08/30 18:41:18");
    timeList.add("2020/08/30 13:45:00,2020/08/30 20:06:49");
    timeList.add("2020/08/30 14:05:00,2020/08/30 14:31:39");
    timeList.add("2020/08/30 15:00:00,2020/08/30 18:27:49");
    timeList.add("2020/08/30 15:00:00,2020/08/30 17:57:49");
    timeList.add("2020/08/30 15:00:00,2020/08/30 16:55:02");
    timeList.add("2020/08/30 15:55:00,2020/08/30 18:50:03");
    timeList.add("2020/08/30 15:55:00,2020/08/30 18:49:26");
    timeList.add("2020/08/30 15:55:00,2020/08/30 17:30:39");
    timeList.add("2020/08/30 16:05:00,2020/08/30 16:51:05");
    timeList.add("2020/08/30 17:40:00,2020/08/30 20:19:18");
    timeList.add("2020/08/30 17:40:00,2020/08/30 19:12:35");
    timeList.add("2020/08/30 17:40:00,2020/08/30 18:30:32");
    timeList.add("2020/08/30 17:40:00,2020/08/30 17:03:36");

    List<String> output = new ArrayList<>();
    DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("HH:mm");
    DateTimeFormatter dateTimeFormatter5 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    timeList.forEach(k -> {
      List<String> temp;
      temp = Arrays.asList(k.split(","));
      LocalDateTime firstPickUp = LocalDateTime.now().plusDays(1).withHour(5).withMinute(30).withSecond(0);
      LocalDateTime flightArrivalTime = LocalDateTime.parse(temp.get(0), dateTimeFormatter5);
      LocalDateTime customerDeliveryTime = LocalDateTime.parse(temp.get(1), dateTimeFormatter5);

      LocalDateTime flightArrivalTimeP2 = flightArrivalTime.plusHours(2);
      LocalDateTime pickupStart = flightArrivalTimeP2;
//      LocalDateTime pickupStart = (flightArrivalTimeP2.compareTo(firstPickUp) <= 0) ? firstPickUp : flightArrivalTimeP2;
      LocalDateTime pickupStartP6 = pickupStart.plusHours(6);
      LocalDateTime deliveryEnd = (pickupStartP6.compareTo(customerDeliveryTime) <= 0) ? pickupStartP6 : customerDeliveryTime;

      output.add(pickupStart.format(dateTimeFormatter2) + "," + deliveryEnd.format(dateTimeFormatter2));
//      output.add(pickupStart.format(dateTimeFormatter2) + "," + customerDeliveryTime.format(dateTimeFormatter2));
    });
    output.forEach(System.out::println);
  }
}
