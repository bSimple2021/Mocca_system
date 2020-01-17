package com.mocca.controller;

import com.mocca.pojo.Department;
import com.mocca.service.DepartmentService;
import com.sun.xml.internal.ws.model.AbstractSEIModelImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DepartmentController {


    @Qualifier("DepartmentServiceImpl")
    @Autowired
    DepartmentService departmentService;

    @GetMapping({"/","/index","/index.html"})
    public String toIndex(){
        return "index.jsp";
    }

    @GetMapping("/Department")
    public String queryAllDepartment(Model model){
        List<Department> departments = departmentService.queryAllDepartment();
        model.addAttribute("msg",departments);
        for (Department department : departments) {
            System.out.println("【查询】部门内容"+departments);
        }
        return "depart";
    }


}
