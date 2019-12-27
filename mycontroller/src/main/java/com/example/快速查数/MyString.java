package com.example.快速查数;

/**
 * @author admin
 * @ClassName MyString
 * @Description
 * @Date 2019/11/22
 */
public class MyString {

  public static void main(String[] args) {
    String a = "A";
    String b = null;
    String c = a+null;
    System.out.println(c);
    System.out.println(a+b);

    System.out.println(Son2.strSon);
  }

}
class Father2{
  public static String strFather="HelloJVM_Father";

  static{
    System.out.println("Father静态代码块");
  }
}

class Son2 extends Father2{
  public static String strSon="HelloJVM_Son";

  static{
    System.out.println("Son静态代码块");
  }
}
