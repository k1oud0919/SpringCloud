package com.k1oud.clouddept.service;

import com.k1oud.dept.entity.Dept;
import java.util.List;


public interface DeptService {
    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
