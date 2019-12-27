package com.example.快速查数;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author admin
 * @ClassName W10select1K
 * @Description
 * @Date 2019/11/15
 */
public class W10select1K {

  public static void main(String[] args) {
    //制造100w数据
    List<Integer>list =new ArrayList<>();
    int[]arr =new int [1000000];
    for(int i=0; i < 1000000; i++) {
      list.add((int) (Math.random() * 10000));
    }
    System.out.println(arr.length);
    for(int i=0; i < 1000000; i++) {
      arr[i]=(int) (Math.random() * 10000);
    }
    System.out.println("数据制造完毕  --- >   list.size()="+list.size()+"  arr.length="+arr.length);
    long l=System.currentTimeMillis();//开始时间
    //测试list类型:
    List<Integer> collect=list.stream().sorted(Comparator.reverseOrder()).limit(100).collect(Collectors.toList());//1.转流,2.排倒序,3.分页,4.规流

    //System.out.println(collect);
    //测试array类型:
    Arrays.sort(arr);
    int[] ints=Arrays.copyOf(arr,100);
    int p = 0;
    for(int anInt : ints) {
      if(p%10==0) System.out.println();
      System.out.print(anInt+" ,");
      p++;
    }

    System.out.println("总耗时:"+(System.currentTimeMillis()-l)+"ms");
  }



  @Test
  public void test(){
    for(int i=0; i <100 ; i++) {
      if(i%10==0) System.out.println();
      System.out.print((int) (Math.random() * 10000) +" , ");
    }
  }

}
