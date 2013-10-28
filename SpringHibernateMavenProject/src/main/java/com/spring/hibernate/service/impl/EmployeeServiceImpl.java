package com.spring.hibernate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.hibernate.dao.IEmployeeDao;
import com.spring.hibernate.model.Department;
import com.spring.hibernate.model.Employee;
import com.spring.hibernate.service.IEmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeDao employeeDao;

	@Override
	@Transactional
	public void saveEmployee(Employee employee) {
		employeeDao.saveEmployee(employee);
	}

	@Override
	@Transactional
	public void saveEmployeeDept(int empId, Department dept) {
		employeeDao.saveEmployeeDept(empId, dept);
	}

	@Override
	@Transactional
	public Employee getEmployee(int empId) {
		Employee emp = employeeDao.getEmployee(empId);
		return emp;
	}

	@Override
	@Transactional
	public Department getEmployeeDept(int empId, int deptId) {
		Department dept = employeeDao.getEmployeeDept(empId, deptId);
		return dept;
	}

	@Override
	@Transactional
	public void updateEmployee(Employee employee, int empId) {
		employeeDao.updateEmployee(employee, empId);
	}

	@Override
	@Transactional
	public void updateEmployeeDept(int empId, Department dept, int deptId) {
		employeeDao.updateEmployeeDept(empId, dept, deptId);
	}

	@Override
	@Transactional
	public void deleteEmployee(int empId) {
		employeeDao.deleteEmployee(empId);
	}

	@Override
	@Transactional
	public void deleteEmployeeDept(int empId, int deptId) {
		employeeDao.deleteEmployeeDept(empId, deptId);

	}

}
