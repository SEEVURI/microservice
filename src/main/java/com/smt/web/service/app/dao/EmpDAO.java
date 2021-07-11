package com.smt.web.service.app.dao;

import com.smt.web.service.app.model.Emp;

public interface EmpDAO {

    void insertEmp(Emp emp);
    void updateEmp(int empId);
    void deleteEmp(int empId);
    Emp getEmpDetails(int empId);
}
