package com.example.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

/**
 * @author admin
 * @ClassName MyThreadTest
 * @Description 线程安全问题
 * @Date 2019/10/21
 */
public class MyThreadTest {

  /**
   * 测试十万次添加下的线程安全问题
   * @param args
   */
  public static void main(String[] args) {
    // 进行10次测试
    for(int i=0; i < 10; i++) {
      test();
    }
  }

  /**
   * 此方法中的容器换成线程安全的Vector就不会出现下标越界和插入数据不对的问题了
   */
  public static void test() {
    // 用来测试的List
    List<Object> list=new ArrayList<Object>();
    //List<Object> list=new Vector<>();

    // 线程数量(1000)
    int threadCount=1000;

    // 用来让主线程等待threadCount个子线程执行完毕
    CountDownLatch countDownLatch=new CountDownLatch(threadCount);

    // 启动threadCount个子线程
    for(int i=0; i < threadCount; i++) {
      Thread thread=new Thread(new MyThread(list,countDownLatch));
      thread.start();
    }

    try {
      // 主线程等待所有子线程执行完成，再向下执行
      countDownLatch.await();
    } catch(InterruptedException e) {
      e.printStackTrace();
    }

    // List的size
    System.out.println(list.size());
  }
}
