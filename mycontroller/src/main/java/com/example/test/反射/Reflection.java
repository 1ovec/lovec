package com.example.test.反射;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 * @ClassName Reflection
 * @Description
 * @Date 2019/10/23
 */
public class Reflection {

  static List<Integer> list=new ArrayList<>();
  public static void main(String[] args) {

    list.add(1);
    list.add(2);
    //直接添加字符串进去，会在编译阶段报错
    //list.add("sss");
    Class class1=list.getClass();
    try {
      Method method= class1.getMethod("add",Object.class);
      //通过反射机制操作list对象
      method.invoke(list,"sss");
      System.out.println(list);
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(list);
  }
}
