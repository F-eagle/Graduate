package com.starry.dao;

import java.util.List;

import net.sf.jsqlparser.statement.delete.Delete;

import com.starry.entity.Department;

public interface IDepartmentDao {
	public abstract List<Department> getAll();
	
	public abstract int DeleteById(String id); 
	
	public abstract List<Department> findName(String info);
	public abstract List<Department> findId(String info);
	
	public abstract void updateDepart(Department department);
}
