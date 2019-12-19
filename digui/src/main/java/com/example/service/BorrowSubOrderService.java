package com.example.service;

import com.example.entity.CompanyVos;
import com.example.entity.DeptVos;
import com.example.mapper.BorrowSubOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author admin
 * @ClassName BorrowSubOrderService
 * @Description
 * @Date 2019/12/18
 */
@Service
public class BorrowSubOrderService {

  @Autowired
  private BorrowSubOrderMapper borrowSubOrderDao;


  public List<CompanyVos> findCompanyAndDepts(Map<String, Object> param){
    List<CompanyVos> list=new ArrayList<>();
    List<CompanyVos> companyVosList=borrowSubOrderDao.findCompanys(param);
    if(companyVosList!=null&&companyVosList.size()>0){
      for(CompanyVos companyVo:companyVosList){
        CompanyVos companyVo2=new CompanyVos();
        companyVo2.setCompanyId(companyVo.getCompanyId());
        companyVo2.setCompanyName(companyVo.getCompanyName());
        Map<String, Object> paramMap=new HashMap<>();
        paramMap.put("companyId", companyVo.getCompanyId());
        paramMap.put("fDeptId", 0);
        companyVo2.setDeptVos(getDepts(paramMap));
        list.add(companyVo2);
      }
    }
    return list;
  }

  /**
   * @descript:递归部门
   * @param param
   * @return
   */
  public List<DeptVos> getDepts(Map<String, Object> param){
    List<DeptVos> deptVosList=new ArrayList<DeptVos>();
    List<DeptVos> deptVos=borrowSubOrderDao.findAllDepts(param);
    if(deptVos!=null&&deptVos.size()>0){
      for(DeptVos deptVo:deptVos){
        DeptVos deptVo2=new DeptVos();
        deptVo2.setDeptId(deptVo.getDeptId());
        deptVo2.setDeptName(deptVo.getDeptName());
        Map<String, Object> paramMap=new HashMap<>();
        paramMap.put("fDeptId", deptVo.getDeptId());
        paramMap.put("companyId",deptVo.getCompanyId());
        deptVo2.setSubDeptVos(getDepts(paramMap));
        deptVosList.add(deptVo2);
      }
    }
    return deptVosList;
  }

}
