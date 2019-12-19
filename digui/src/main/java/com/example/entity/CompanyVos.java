package com.example.entity;

import java.util.List;

/**
 * @author admin
 * @ClassName CompanyVos
 * @Description
 * @Date 2019/12/18
 */
public class CompanyVos {
  /**
   *
   */
  private static final long serialVersionUID = 5617344073236043292L;
  private Long companyId;
  private String companyName;
  private List<DeptVos> deptVos;
  public Long getCompanyId() {
    return companyId;
  }
  public void setCompanyId(Long companyId) {
    this.companyId = companyId;
  }
  public String getCompanyName() {
    return companyName;
  }
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public List<DeptVos> getDeptVos() {
    return deptVos;
  }
  public void setDeptVos(List<DeptVos> deptVos) {
    this.deptVos = deptVos;
  }

  public String toString() {
    return "CompanyVos [companyId=" + companyId + ", companyName=" + companyName +", deptVos="+"]";
  }

}
