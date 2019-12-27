package com.example.test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author admin
 * @ClassName VolatileTest
 * @Description
 * @Date 2019/11/7
 */
public class VolatileTest {

  public static volatile int race=0;

  private static final int THREADS_COUNT=20;

  private static CountDownLatch countDownLatch=new CountDownLatch(THREADS_COUNT);
  private AtomicInteger atomicInteger = new AtomicInteger(0);
  public static  void increase() {
    race++;
    // atomicInteger.
  }

  public static void main(String[] args) throws InterruptedException {
    long l=System.currentTimeMillis();
    Thread[] threads=new Thread[THREADS_COUNT];
    for(int i=0; i < THREADS_COUNT; i++) {
      threads[i]=new Thread(() -> {
        for(int i1=0; i1 < 10000; i1++) {
          increase();
        }
        countDownLatch.countDown();
      });
      threads[i].start();
    }
    countDownLatch.await();
    System.out.println(race);
    System.out.println((System.currentTimeMillis()-l)+"ms");
  }
}
