package com.example.多态;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author admin
 * @ClassName duotai
 * @Description
 * @Date 2019/10/17
 */
public class duotai extends HelloA{

  public duotai() {
    System.out.println("i'am HelloB");
  }

  {
    System.out.println("i'am B class");
  }

  static {
    System.out.println(" static B");
  }

  public static void main(String[] args) {
    LocalDateTime dateTime = LocalDateTime.now();
    LocalDateTime dateTime1=dateTime.plusMonths(-3L);
    DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    System.out.println(formatter3.format(dateTime));  System.out.println(dateTime1.toString());
  }

}
