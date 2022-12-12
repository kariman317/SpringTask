package com.hr.First.API.Repositary;

import com.hr.First.API.Model.Department;
import com.hr.First.API.Model.Employee;

import java.util.List;

public interface IDepartment {
    public List<Department> getAll();
    public  Department getById(int id);
    public String insert (Department department);

    public  String update(int id ,Department department);

    public  String deleteById(int id);


}
