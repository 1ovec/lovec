package com.example.service;

import com.example.entity.Digui;
import com.example.mapper.DiguiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author admin
 * @ClassName DiguiService
 * @Description
 * @Date 2019/12/18
 */

@Service
public class DiguiService {

  @Autowired
  DiguiMapper diguiMapper;

  public Digui selectAll(int id){
    return diguiMapper.selectAll(id);
  }

}
