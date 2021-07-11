package com.smt.web.service.app.service.impl;

import com.smt.web.service.app.dao.EmpDAO;
import com.smt.web.service.app.model.Emp;
import com.smt.web.service.app.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    EmpDAO empDAO;

    @Override
    public void insertEmp(Emp emp) {

        empDAO.insertEmp(emp);
    }

    @Override
    public void updateEmp(int empId) {

    }

    @Override
    public void deleteEmp(int empId) {

    }

    @Override
    public Emp getEmpDetails(int empId) {
        return empDAO.getEmpDetails(empId);
    }
}
