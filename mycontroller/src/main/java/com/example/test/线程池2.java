package com.example.test;

import java.util.*;
import java.util.concurrent.*;

/**
 * @author admin
 * @ClassName 线程池2
 * @Description
 * @Date 2019/10/17
 */
public class 线程池2 {

  public static void main(String[] args) {

    //Map<String,Integer>map =new HashMap<>();
    //map.put("thread-111" + i,i);
    //List<String>list= new ArrayList<>();
    Vector list = new Vector<>();
    LinkedBlockingQueue<Runnable> queue=new LinkedBlockingQueue<>();
    ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(5,10,10,TimeUnit.SECONDS,queue);
    threadPoolExecutor.execute(new Thread(() -> {
      Thread.currentThread().setName("thread-111");
      for(int i=0;i<5;i++) {
        list.add("thread-111 -->" + i);
        System.out.println("threadName = = >" + Thread.currentThread().getName() + " ----->" + i);
      }
    }));
    threadPoolExecutor.execute(new Thread(() -> {
      Thread.currentThread().setName("thread-222");
      for(int i=0;i<5;i++){
        list.add("thread-222 -->" + i);
        System.out.println("threadName = = >"+Thread.currentThread().getName()+" ----->"+i);
      }
    }));
    threadPoolExecutor.execute(new Thread(() -> {
      Thread.currentThread().setName("thread-333");
      for(int i=0;i<5;i++){
        list.add("thread-333 -->" + i);
        System.out.println("threadName = = >"+Thread.currentThread().getName()+" ----->"+i);
      }
    }));
    threadPoolExecutor.execute(new Thread(() -> {
      Thread.currentThread().setName("thread-444");
      for(int i=0;i<5;i++){
        list.add("thread-444 -->" + i);
        System.out.println("threadName = = >"+Thread.currentThread().getName()+" ----->"+i);
      }
    }));
    threadPoolExecutor.execute(new Thread(() -> {
      Thread.currentThread().setName("thread-555");
      for(int i=0;i<5;i++){
        list.add("thread-555 -->" + i);
        System.out.println("threadName = = >"+Thread.currentThread().getName()+" ----->"+i);
      }
    }));
    threadPoolExecutor.execute(new Thread(() -> {
      Thread.currentThread().setName("thread-666");
      for(int i=0;i<5;i++){
        list.add("thread-666 -->" + i);
        System.out.println("threadName = = >"+Thread.currentThread().getName()+" ----->"+i);
      }
    }));


    System.out.println();
    list.forEach(System.out::println);
  }

}
