package com.lovo.test;

import java.io.Serializable;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lovo.bo.DeptBo;
import com.lovo.po.Dept;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
		"classpath:conf/applicationContext-beans.xml"})
public class DeptBoImplTest extends 
    AbstractTransactionalJUnit4SpringContextTests{

	@Autowired
	private DeptBo deptBoImpl;
	
	public DeptBo getDeptBoImpl() {
		return deptBoImpl;
	}

	public void setDeptBoImpl(DeptBo deptBoImpl) {
		this.deptBoImpl = deptBoImpl;
	}

	@Test
	public void testGetAllDepts(){
		List<Dept> list = deptBoImpl.getAllDepts();
		System.out.println(list);
	}
	
	@Test
	public void testAddNewDept(){
		Dept dept = new Dept(35,"ddd","DDD");
		Serializable id = deptBoImpl.addNewDept(dept);
		System.out.println(id);
	}

}
