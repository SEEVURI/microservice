package com.smt.web.service.app.repository;

import com.smt.web.service.app.model.Emp;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends CassandraRepository<Emp, Integer> {

    @Query("INSERT INTO EMP_DETAILS (EMP_ID , FIRST_NAME , LAST_NAME ,SALARY ) VALUES (?0, ?1, ?2, ?3);")
    void insertEmp(int empId, String firstName, String lastName, int salary);

    //void updateEmp(int empId);

    //void deleteEmp(int empId);
    @Query("SELECT EMP_ID , FIRST_NAME , LAST_NAME ,SALARY FROM EMP_DETAILS WHERE EMP_ID = ?0;")
    Emp getEmpDetails(int empId);
}
