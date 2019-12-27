package com.example.多态;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author admin
 * @ClassName duotai
 * @Description
 * @Date 2019/10/17
 */
public class duotai extends HelloA {

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
    Object o ="zzz";
    Object p ="zzz";


    System.out.println(o.equals(p));
  }

}
