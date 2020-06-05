package com.xueliang.springcloud.enties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@AllArgsConstructor
public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    private String db_source;
}
