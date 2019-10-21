package com.example.test;

import java.util.concurrent.*;

/**
 * @author admin
 * @ClassName 线程池2
 * @Description
 * @Date 2019/10/17
 */
public class 线程池2 {

  public static void main(String[] args) {
    Executor executor =command -> {

    };

    ExecutorService service =Executors.newFixedThreadPool(3);

    LinkedBlockingQueue<Runnable> queue=new LinkedBlockingQueue<>();
    new ThreadPoolExecutor(5,10,10,TimeUnit.SECONDS,queue);
  }

}
