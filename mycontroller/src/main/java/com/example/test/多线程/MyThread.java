package com.example.test.多线程;

import java.util.concurrent.CountDownLatch;

/**
 * @author admin
 * @ClassName MyThread
 * @Description
 * @Date 2019/10/21
 */
public class MyThread implements Runnable {

  private Counter counter;

  private CountDownLatch countDownLatch;

  public MyThread(Counter counter,CountDownLatch countDownLatch) {
    this.counter=counter;
    this.countDownLatch=countDownLatch;
  }

  public void run() {
    // 每个线程向Counter中进行10000次累加
    for(int i=0; i < 10000; i++) {
      counter.addCount();
    }

    // 完成一个子线程
    countDownLatch.countDown();
  }
}

class Counter {
  private int count=0;

  public int getCount() {
    return count;
  }

  public synchronized  void  addCount() {//synchronized
    count++;
  }
}
