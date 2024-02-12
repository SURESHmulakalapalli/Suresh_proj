package com.task.service;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;

public interface IEmployeeService {
    public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException;
    
    public void updateEmployee(EmployeeBean bean1) throws ClassNotFoundException, SQLException;

	public void selectEmployee(EmployeeBean bean2) throws ClassNotFoundException, SQLException;

	public void deleteEmployee(EmployeeBean bean3) throws ClassNotFoundException, SQLException;
}