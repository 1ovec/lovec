package com.example.controller;


import com.example.service.BorrowSubOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author admin
 * @ClassName BorrowController
 * @Description
 * @Date 2019/12/18
 */


@Controller
@RequestMapping("/borrow")
public class BorrowController {

  @Autowired
  private BorrowSubOrderService borrowSubOrderService;

  @RequestMapping(value="/findCompanyAndDepts")
  public void findCompanyAndDepts(HttpServletRequest req,HttpServletResponse resp) {
    ModelResults results=new ModelResults();
    /*try {

      //查询所有公司
      Map<String, Object> paramMap =new HashMap<>();
      paramMap.put("")
      List<CompanyVos> list=borrowSubOrderService.findCompanyAndDepts(paramMap);
      results.setData(list);
      results.setCode(MsgInfo.a_suc_code);
      results.setMessage(MsgInfo.a_suc_msg);
    } catch(Exception e) {
      e.printStackTrace();
      results.setCode(MsgInfo.a_error_code);
      results.setMessage(MsgInfo.a_error_msg);
      results.printJson(results,resp,"");
    }
    results.printJson(results,resp,"");
  }*/
  }
}

class ModelResults {



}

