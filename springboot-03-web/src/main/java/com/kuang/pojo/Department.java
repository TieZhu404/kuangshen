package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author JSQ
 * @ClassName Department.java
 * @Description TODO
 * @createTime 2020年12月29日 21:33:00
 */
//部门表
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Integer id;
    private String department;
}
