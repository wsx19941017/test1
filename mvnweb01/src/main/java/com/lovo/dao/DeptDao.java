package com.lovo.dao;

import java.io.Serializable;
import java.util.List;

import com.lovo.po.Dept;

public interface DeptDao {

	public List<Dept> getAllDepts();

	public Serializable addNewDept(Dept dept);

}
