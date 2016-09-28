package com.lovo.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.lovo.dao.DeptDao;
import com.lovo.po.Dept;
@Repository
public class DeptDaoImpl implements DeptDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public List<Dept> getAllDepts() {
		// TODO 自动生成的方法存根
		return (List<Dept>)hibernateTemplate.find("from Dept", null);
	}

	@Override
	public Serializable addNewDept(Dept dept) {
		// TODO 自动生成的方法存根
		return hibernateTemplate.save(dept);
	}
	
}
