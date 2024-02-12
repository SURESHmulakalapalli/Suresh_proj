package com.task.ui;
import com.task.bean.EmployeeBean;
import com.task.service.*;

import java.sql.SQLException;
import java.util.Scanner;


public class Demo_CRUD {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("select your option");
		System.out.println("1. insert employee data");//create
		System.out.println("2. update employee data");//update
		System.out.println("3  select employee data");//read
		System.out.println("4  delete employee data");//delete
		int option=sc.nextInt();
		switch(option) {
		case 1:
		{
			insertEmployee();
			break;
		}
		case 2:
		{
			updateEmployee();
			break;
		}
		case 3:
		{
			selectEmployee();
			break;
		}
		case 4:
		{
			deleteEmployee();
			break;
		}
		default:
		{
		System.out.println("your entered option is not match");	
		}
		}
		
	}

	private static void deleteEmployee() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeServiceImpl ser3=new EmployeeServiceImpl();
		EmployeeBean bean3=new EmployeeBean();
		bean3.setEmpid(0);
		ser3.deleteEmployee(bean3);
		
		
	}

	private static void selectEmployee() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeServiceImpl service2=new EmployeeServiceImpl();
		EmployeeBean bean2=new EmployeeBean();
		bean2.setEmpid(1001);
		service2.selectEmployee(bean2); 
		
	}

	private static void updateEmployee() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeServiceImpl service1=new EmployeeServiceImpl();
		EmployeeBean bean1=new EmployeeBean();
		bean1.setEmpid(1001);
		bean1.setEmpname("anil");
		service1.updateEmployee(bean1);
		
		
	}

	private static void insertEmployee() throws ClassNotFoundException, SQLException {	
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		EmployeeBean bean=new EmployeeBean();
		bean.setEmpid(100);
		bean.setEmpname("nani");
		bean.setEmpaddress("KDD");
		service.insertEmployee(bean);
		
	}

}
