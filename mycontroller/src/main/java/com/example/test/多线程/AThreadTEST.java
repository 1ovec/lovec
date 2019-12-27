package com.example.test.多线程;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.concurrent.CountDownLatch;

/**
 * @author admin
 * @ClassName AThreadTEST
 * @Description 测试线程安全的问题
 * @Date 2019/10/21
 */
public class AThreadTEST {

  public static void main(String[] args) {
    List<Integer>list =new ArrayList<>();
    for(int i=0; i < 10; i++){
      long l=System.currentTimeMillis();
      // 进行10次测试
      for(int j=0; j < 10; j++) {
        test();
      }
      long l1=System.currentTimeMillis() - l;
      list.add((int) l1);
    }
    System.out.println("-------------------------------------------------------------------------------");
    System.out.println(list);

    long count=list.stream().mapToInt(Integer::byteValue).sum();
    System.out.println(count);
  }

  public static void test() {
    // 计数器
    Counter counter=new Counter();

    // 线程数量(1000)
    int threadCount=1000;

    // 用来让主线程等待threadCount个子线程执行完毕
    CountDownLatch countDownLatch=new CountDownLatch(threadCount);

    // 启动threadCount个子线程
    for(int i=0; i < threadCount; i++) {
      Thread thread=new Thread(new MyThread(counter,countDownLatch));
      thread.start();
    }

    try {
      // 主线程等待所有子线程执行完成，再向下执行
      countDownLatch.await();
    } catch(InterruptedException e) {
      e.printStackTrace();
    }

    // 计数器的值
    System.out.println(counter.getCount());
  }

}
