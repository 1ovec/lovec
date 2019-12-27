package com.example.test;

import com.example.entity.Order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author admin
 * @ClassName lanbuda
 * @Description
 * @Date 2019/10/12
 */
public class lanbuda extends HttpServlet {

  public static void main(String[] args) {
    /**
     * 测试Steam中的Map的高级用法
     */
    List<String> collected = Stream.of("a", "b","e").collect(Collectors.toList());
    List<Integer> figure = collected.stream().map(s -> {
      Integer i;
      switch (s) {
        case "a":
          i = 1;
          break;
        case "b":
          i = 2;
          break;
        default:
          i = -1;
          break;
      }
      return i;
    }).collect(Collectors.toList());
    figure.forEach(System.out::println);

    /**
     * 1000000 数据下的分组统计同id的count数值
     */
    /*List<Order>list= new ArrayList<>();
    Order order;
    for(int i=0; i < 1000000; i++) {
      if(i<500000){
        order=new Order(i,Integer.parseInt(i+"999"));
      }else {
        order=new Order(i-500000,Integer.parseInt(i+"999"));
      }
      list.add(order);
    }
    System.out.println(list.size());
    long start=System.currentTimeMillis();
    Map<Integer, List<Order>> collect=list.stream().collect(Collectors.groupingBy(Order::getUserId));
    System.out.println(System.currentTimeMillis()-start);*/


    /**
     * 10数据下的 数据下的分组统计同id的count数值
     */
    /*List<Order>list= new ArrayList<>();
    Order order;
    for(int i=0; i < 10; i++) {
      if(i<5){
        order=new Order(i,Integer.parseInt(i+"999"));
      }else {
        order=new Order(i-5,Integer.parseInt(i+"999"));
      }
      list.add(order);
    }
    System.out.println(list.size());
    Map<Integer, List<Order>> collect=list.stream().collect(Collectors.groupingBy(Order::getUserId));
    Set<Integer> integers=collect.keySet();
    System.out.println(integers.size());
    for(Integer s:collect.keySet()){
      System.out.println("key : "+s+" value : "+collect.get(s));
    }*/

    /**
     * 流去重 测试
     */
    /*List<Integer>list =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5));
    Stream<Integer> distinct=list.stream().distinct();
    List<Integer> collect=distinct.collect(Collectors.toList());
    distinct.forEach(System.out::println);*/

    /*Map<String,Object> name =new ConcurrentHashMap<>();
    Map<String,Object> map1 =new LinkedHashMap<>();*/

    /**
     * TreeMap 测试
     */
   /* Map<String,Object> map =new TreeMap<>();
    map.put("999","1asd");
    map.put("888","1asd");
    map.put("111","1asd");
    map.put("333","1asd");
    map.put("444","1asd");

    Set<String> strings=map.keySet();
    strings.forEach(System.out::println);*/


  }

}
