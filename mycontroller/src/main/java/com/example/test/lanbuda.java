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


    List<Order>list= new ArrayList<>();
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
    System.out.println(System.currentTimeMillis()-start);

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

    /*List<Integer>list =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5));
    Stream<Integer> distinct=list.stream().distinct();
    List<Integer> collect=distinct.collect(Collectors.toList());
    distinct.forEach(System.out::println);*/

    /*Map<String,Object> name =new ConcurrentHashMap<>();
    Map<String,Object> map1 =new LinkedHashMap<>();*/

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
