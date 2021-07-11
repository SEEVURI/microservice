package com.smt.web.service.app.model;



import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "EMP_DETAILS")
public class Emp {

	@PrimaryKeyColumn(name = "EMP_ID", type = PrimaryKeyType.PARTITIONED)
	private int empId;

	@Column(value = "FIRST_NAME")
	private String firstName;

	@Column(value = "LAST_NAME")
	private String lastName;

	@Column(value = "SALARY")
	private int salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
