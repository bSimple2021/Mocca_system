package com.mocca.dao;


import com.mocca.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface DepartmentMapper {

    List<Department> queryAllDepartment();

}
