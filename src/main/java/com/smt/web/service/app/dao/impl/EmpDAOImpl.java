package com.smt.web.service.app.dao.impl;

import com.smt.web.service.app.dao.EmpDAO;
import com.smt.web.service.app.model.Emp;
import com.smt.web.service.app.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpDAOImpl implements EmpDAO {

    @Autowired
    EmpRepository empRepository;

    @Override
    public void insertEmp(Emp emp) {
        empRepository.insertEmp(emp.getEmpId(), emp.getFirstName(),emp.getLastName(),emp.getSalary());

    }

    @Override
    public void updateEmp(int empId) {

    }

    @Override
    public void deleteEmp(int empId) {

    }

    @Override
    public Emp getEmpDetails(int empId) {
        return empRepository.getEmpDetails(empId);

    }
}
