package com.mocca.service;


import com.mocca.dao.DepartmentMapper;
import com.mocca.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class DepartmentServiceImpl implements DepartmentService{


    private DepartmentMapper departmentMapper;

    public void setDepartmentMapper(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }

    /*查询全部部门*/
    public List<Department> queryAllDepartment() {
        return departmentMapper.queryAllDepartment();
    }
}
