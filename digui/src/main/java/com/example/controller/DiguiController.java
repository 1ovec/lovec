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

  private static List<Digui> diguiList = new ArrayList<>();

  @Autowired
  private DiguiService diguiService;

  @RequestMapping("getUser/{id}")
  public String GetUser(@PathVariable int id){
    Digui digui=diguiService.selectAll(id);
    getOne(digui);
    return diguiList.toString();
  }


  private List<Digui> getOne(Digui digui){
    /*if(digui.getPid()!=0){
      //根据pid来判定是否到达了根节点
      diguiList.add(digui);
      return diguiList;
    }
    return diguiList;*/

    Digui digui1=null;
    if(digui.getPid()!=0){
      digui1=diguiService.selectAll(digui.getPid());
      diguiList.add(digui1);
    }else {
      diguiList.add(digui);
    }
    return getOne(digui1);
  }
}
