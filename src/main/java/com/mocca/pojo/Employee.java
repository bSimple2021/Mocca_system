package com.mocca.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int userId;
    private String username;
    private String userPassword;
    private int userDepartmentId;
    private String userPosition;
    private String userPhone;
    private Timestamp userCreateTime;
    private Timestamp userLastModifyTime;
}
