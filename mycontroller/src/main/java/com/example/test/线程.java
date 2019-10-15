package com.example.test;

import java.util.concurrent.*;

/**
 * @author admin
 * @ClassName 线程
 * @Description
 * @Date 2019/10/14
 */
public class 线程 {

  private static BlockingQueue<Runnable>  sPoolWorkQueue;
  private static RejectedExecutionHandler handler;

  public 线程(BlockingQueue<Runnable> sPoolWorkQueue,RejectedExecutionHandler handler) {
    this.sPoolWorkQueue=sPoolWorkQueue;
    this.handler=handler;
  }

  //线程池的使用流程如下：
  // 创建线程池
  static Executor threadPool = new ThreadPoolExecutor(10, 20, 10, TimeUnit.SECONDS, sPoolWorkQueue, handler);
  // 向线程池提交任务

  public static void main(String[] args) {

    // 关闭线程池 threadPool.shutdown(); // 设置线程池的状态为SHUTDOWN，然后中断所有没有正在执行任务的线程 threadPool.shutdownNow(); // 设置线程池的状态为 STOP，然后尝试停止所有的正在执行或暂停任务的线程，并返回等待执行任务的列表
    threadPool.execute(() -> {
      // 线程执行的任务
      System.out.println(Thread.currentThread().getName());
    });
  }
}
