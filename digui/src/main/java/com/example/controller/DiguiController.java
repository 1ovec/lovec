package com.example.controller;

import com.example.entity.Digui;
import com.example.service.DiguiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 * @ClassName DiguiController
 * @Description
 * @Date 2019/12/18
 */


@RestController
@RequestMapping("/digui")
public class DiguiController {

  private static List<Digui> diguiList;

  @Autowired
  private DiguiService diguiService;

  @RequestMapping("getUp/{id}")
  public String getUp(@PathVariable int id) {
    diguiList=new ArrayList<>();
    getOne(id);
    return diguiList.toString();
  }

  /**
   * 向上递归,求全路径上的所有节点
   * @param id 最下级节点
   * @return diguiList 所有的节点集合
   */
  private List<Digui> getOne(int id) {
    Digui digui=diguiService.selectAll(id);
    if(digui==null){
      return diguiList;
    }
    if(digui.getPid() != 0) {
      diguiList.add(digui);
    } else {
      diguiList.add(digui);
      return diguiList;
    }
    return getOne(digui.getPid());
  }


  @RequestMapping("getDown/{id}")
  public String getDown(@PathVariable int id) {
    diguiList=new ArrayList<>();
    Digui digui=diguiService.selectAll(id);
    diguiList.add(digui);
    getAll(id);
    return diguiList.toString();
  }

  /**
   * 向上递归,求全路径上的所有节点
   * @param id 最下级节点
   * @return diguiList 所有的节点集合
   */
  private List<Digui> getOne2(int id) {
    Digui digui=diguiService.selectAll(id);
    if(digui==null){
      return diguiList;
    }else{
      diguiList.add(digui);
    }
    return getOne2(digui.getPid());
   /* if(digui.getPid() != 0) {
      diguiList.add(digui);
    } else {
      diguiList.add(digui);
      return diguiList;
    }*/
    //return getOne(digui.getPid());
  }


  /**
   * 向下递归,求全路径上的所有节点
   * @param id 最下级节点
   * @return diguiList 所有的节点集合
   */
  private List<Digui> getAll(int id) {
    Digui digui=diguiService.selectDown(id);
    if(digui==null){
      return diguiList;
    }else{
      diguiList.add(digui);
    }
    return getAll(digui.getId());
  }
}
