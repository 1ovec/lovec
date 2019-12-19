package com.example.mapper;

import com.example.entity.CompanyVos;
import com.example.entity.DeptVos;

import java.util.List;
import java.util.Map;

/**
 * @author admin
 * @ClassName BorrowSubOrderMapper
 * @Description
 * @Date 2019/12/18
 */
public interface BorrowSubOrderMapper {

  List<CompanyVos> findCompanys(Map<String, Object> param);


  List<DeptVos> findAllDepts(Map<String, Object> param);

}
