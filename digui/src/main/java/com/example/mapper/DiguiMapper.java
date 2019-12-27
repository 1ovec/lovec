package com.example.mapper;

import com.example.entity.Digui;
import com.example.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Repository
public interface DiguiMapper {

  Digui selectAll(int id);

  Digui selectDown(int id);
}