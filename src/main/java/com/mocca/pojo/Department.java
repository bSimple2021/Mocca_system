package com.mocca.pojo;

import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private int departmentId;
    private String departmentName;
    private int departmentNumber;
    private String departmentTelePhone;
    private Timestamp departmentCreateTime;
    private Timestamp departmentLastModifyTime;




}
