package com.lovo.bo;

import java.io.Serializable;
import java.util.List;

import com.lovo.po.Dept;

public interface DeptBo {
	
	public List<Dept> getAllDepts();
	public Serializable addNewDept(Dept dept);
}
