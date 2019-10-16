package com.example.test;

import java.util.concurrent.*;

/**
 * @author admin
 * @ClassName 线程
 * @Description
 * @Date 2019/10/14
 */
public class 线程 {

  public static void main(String[] args) {

    //创建一个可重用固定个数的线程池
    ExecutorService fixedThreadPool=Executors.newFixedThreadPool(3);
    for(int i=0; i < 10; i++) {
      fixedThreadPool.execute(() -> {
        try {
          //打印正在执行的缓存线程信息
          System.out.println(Thread.currentThread().getName() + "正在被执行");
          Thread.sleep(2000);
        } catch(InterruptedException e) {
          e.printStackTrace();
        }
      });
    }
  }
}
