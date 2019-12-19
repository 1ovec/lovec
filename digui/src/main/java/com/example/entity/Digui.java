package com.example.entity;

import java.util.Objects;

/**
 * @author admin
 * @ClassName Digui
 * @Description
 * @Date 2019/12/18
 */
public class Digui {

  private int id;
  private int pid;
  private String name;

  @Override
  public String toString() {
    return "Digui{" +
            "id=" + id +
            ", pid=" + pid +
            ", name='" + name + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if(this == o) return true;
    if(o == null || getClass() != o.getClass()) return false;
    Digui digui=(Digui) o;
    return id == digui.id &&
            pid == digui.pid &&
            Objects.equals(name,digui.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id,pid,name);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id=id;
  }

  public int getPid() {
    return pid;
  }

  public void setPid(int pid) {
    this.pid=pid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name=name;
  }

  public Digui(int id,int pid,String name) {
    this.id=id;
    this.pid=pid;
    this.name=name;
  }

  public Digui() {
  }
}
