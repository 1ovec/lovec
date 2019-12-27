package com.example.递归;

import sun.misc.Request;

import javax.jws.Oneway;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author admin
 * @ClassName A1
 * @Description
 * @Date 2019/10/28
 */
public class A1 {


  public static void te1(int i) {
    i++;
    if(i < 10) {
      System.out.println(i);
      te1(i);
    }
  }

  public static void main(String[] args) throws IOException {
    //System.out.println(method());
    URL url  =new URL("http://t.weather.sojson.com/api/weather/city/101010100");  // 把字符串转换为URL请求地址
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();// 打开连接
    connection.connect();// 连接会话

    // 获取输入流
    BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
    String line;
    StringBuilder sb = new StringBuilder();
    while ((line = br.readLine()) != null) {
      // 循环读取流
      sb.append(line);
    }
    br.close();// 关闭流
    connection.disconnect();// 断开连接
    System.out.println(sb.toString());
    /*Map mapResult = (Map)JSON.parse(sb.toString() );
    ApiResult apiResult = new ApiResult(true,mapResult);*/


  }

  public static int method() {
    int i=1;
    try {
      i++;
      System.out.println("try block, i = " + i);
      return i;
    } catch(Exception e) {
      i++;
      System.out.println("catch block i = " + i);
      return i;
    } finally {
      i=10;
      System.out.println("finally block i = " + i);
      return i;
    }
  }
}
