package com.task.service;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.Dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements IEmployeeService{

	@Override
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		EmployeeDaoImpl dao=new EmployeeDaoImpl();

		dao.insertEmployee(bean);
		
	}
	
	

	@Override
	public void updateEmployee(EmployeeBean bean1) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDaoImpl d1=new EmployeeDaoImpl();
		d1.updateEmployee(bean1);
		
	}
	
	@Override
	public void selectEmployee(EmployeeBean bean2) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDaoImpl d2=new EmployeeDaoImpl();
		d2 .selectEmployee(bean2);
		
	}
	
	@Override
	public void deleteEmployee(EmployeeBean bean3) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDaoImpl d3=new EmployeeDaoImpl();
		d3.deleteEmployee(bean3);
		
	}
}

