package com.smt.web.service.app.service;

import com.smt.web.service.app.model.Emp;

public interface EmpService {

     void insertEmp(Emp emp);
     void updateEmp(int empId);
     void deleteEmp(int empId);
     Emp getEmpDetails(int empId);
}
