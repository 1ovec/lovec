package com.example.多态;

/**
 * @author admin
 * @ClassName HelloA
 * @Description
 * @Date 2019/10/17
 */
public class HelloA {

  public HelloA() {
    System.out.println("HelloA");
  }

  {
    System.out.println(" class A");
  }

  static {
    System.out.println("static A");
  }
}
