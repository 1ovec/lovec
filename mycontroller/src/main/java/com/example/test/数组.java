package com.example.test;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Math.ceil;

/**
 * @author admin
 * @ClassName 数组
 * @Description
 * @Date 2019/10/17
 */
public class 数组 {

  public static void main(String[] args) {
    //创建数据
    Integer [] arr= new Integer [1000];
    for(int i=0; i < arr.length; i++) {
      arr[i]=(int) ceil(Math.random()*99);
    }
    Arrays.sort(arr);
    //将数据转变为集合
    List<Integer>list=new ArrayList<>(Arrays.asList(arr));
    Map<Integer, List<Integer>> collect=list.stream().collect(Collectors.groupingBy(Integer::intValue));

    Map<Integer, Long> collect2=list.stream().collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()));
    System.out.println(collect2);
    List<Map<String,Integer>> name =new ArrayList<>();
    collect.keySet().forEach(e->{
      Map s = new HashMap();
      s.put("num",e);
      s.put("count",collect.get(e).size());
      name.add(s);
    });
    //将数据排序
    name.forEach(System.out::print);//原始数据打印
    //排序
    List<Map<String, Integer>> collect1=name.stream().sorted((t,t2) -> t2.get("count") - t.get("count")).collect(Collectors.toList());
    collect1.forEach(e-> System.out.println(e.get("num")));//排序后输出num就是想要的结果

  }

}
