package com.atguigu.mybatis.bean;


import lombok.Data;

import java.io.Serializable;

@Data
public class Emp implements Serializable {

    //开启驼峰命名自动映射封装

    private Integer id;
    private String empName; // emp_name；  驼峰命名规则
    private Integer age;
    private Double empSalary; // emp_salary
}
