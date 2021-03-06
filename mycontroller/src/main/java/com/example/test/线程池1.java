package com.example.test;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author admin
 * @ClassName 线程池1
 * @Description
 * @Date 2019/10/15
 */
public class 线程池1 {

  public static void main(String[] args) {
    //创建一个可缓存线程池
    ExecutorService cachedThreadPool=Executors.newCachedThreadPool();
    for(int i=0; i < 10; i++) {
      try {
        //sleep可明显看到使用的是线程池里面以前的线程，没有创建新的线程
        Thread.sleep(1000);
      } catch(InterruptedException e) {
        e.printStackTrace();
      }
      cachedThreadPool.execute(() -> {
        //打印正在执行的缓存线程信息
        System.out.println(Thread.currentThread().getName() + "正在被执行");
      });
    }
  }

  /**
   * 创建一个可重用固定个数的线程池
   */
  @Test
  public void test1(){
    //创建一个可重用固定个数的线程池
    ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
    for (int i = 0; i < 10; i++) {
      fixedThreadPool.execute(() -> {
        try {
          //打印正在执行的缓存线程信息
          System.out.println(Thread.currentThread().getName()+"正在被执行");
          Thread.sleep(2000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      });
    }
  }

}
