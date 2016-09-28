package com.lovo.bo.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.bo.DeptBo;
import com.lovo.dao.DeptDao;
import com.lovo.po.Dept;
@Service
public class DeptBoImpl implements DeptBo {

	@Autowired
	private DeptDao deptDao;

	public DeptDao getDeptDao() {
		return deptDao;
	}

	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}

	@Override
	public List<Dept> getAllDepts() {
		// TODO 自动生成的方法存根
		return deptDao.getAllDepts();
	}

	@Override
	public Serializable addNewDept(Dept dept) {
		// TODO 自动生成的方法存根
		return deptDao.addNewDept(dept);
	}
	
	
}
