package com.xueliang.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    private String db_source;
}
