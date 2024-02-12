 package com.task.Dao;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.util.DBUtil;

public class EmployeeDaoImpl implements IEmployeeDao{
	public static PreparedStatement pst=null;
	

	@Override
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {		
		int empId=bean.getEmpid();
		String empName=bean.getEmpname();
		String empAddress=bean.getEmpaddress();
		 Connection connection=DBUtil.getDBConnection();
		 pst=connection.prepareStatement("insert into employee values(?,?,?)");
		 pst.setInt(1, empId);
		 pst.setString(2, empName);
		 pst.setString(3, empAddress);
		  pst.executeUpdate();
		  System.out.println("insert one record successfully");
		  
	}
	
	public void updateEmployee(EmployeeBean b1) throws ClassNotFoundException, SQLException {		
		String empName=b1.getEmpname();
		int empId=b1.getEmpid();
		
		 Connection connection=DBUtil.getDBConnection();
		 pst=connection.prepareStatement("update employee set empname=? where empid=?");
		 pst.setString(1, empName);
		 pst.setInt(2, empId);
		 
		
		  pst.executeUpdate();
		  System.out.println("updated one record successfully");
		   
	}
	@Override
	public void deleteEmployee(EmployeeBean b3) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int empId=b3.getEmpid();
		
		Connection c=DBUtil.getDBConnection();
		pst=c.prepareStatement("delete from employee where empid=?");
		pst.setInt(1, empId);
		pst.executeUpdate();
		System.out.println("deleted successfully");
		
	}

	
	public void selectEmployee(EmployeeBean b2) throws ClassNotFoundException, SQLException {		
		String empName=b2.getEmpname();
		int empId=b2.getEmpid();
		ResultSet rs=null;
		try {
			
		Connection connection=DBUtil.getDBConnection();
		Statement s=connection.createStatement();
		 pst=connection.prepareStatement("select * from employee where empid=?");
		 pst.setInt(1, empId);
		 rs=pst.executeQuery();
		 
		 while(rs.next()) {
			 int id=rs.getInt("Empid");
			 String name=rs.getString("EmpName");
			 String Add=rs.getString("EmpAddress");
			 System.out.println(id+ " "+name+" "+ Add);
			 break;
		 }
		}
		
		catch(Exception e){
			System.out.println(e);
			
		}
		 
		  System.out.println("selected one record successfully");
		   
	}

	
}
