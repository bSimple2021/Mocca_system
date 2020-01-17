package com.mocca;


import com.mocca.pojo.Department;
import com.mocca.service.DepartmentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MyTest {

    @Autowired
    DepartmentService departmentService;

    @Test
    public void test() {
        List<Department> departments = departmentService.queryAllDepartment();
        System.out.println(departments);
    }
}
