package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author admin
 * @ClassName lanbuda
 * @Description
 * @Date 2019/10/12
 */
public class lanbuda {

  public static void main(String[] args) {
    List<Integer>list =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
    list.forEach(e-> System.out.println(e));
    list.forEach(System.out::print);
    List<String> collect=list.stream().map(Object::toString).collect(Collectors.toList());
    List<Map<String,Object>> name =new ArrayList<>();

  }

}
