package com.hr.First.API.Repositary;

import com.hr.First.API.Model.Employee;

import java.util.List;

public interface IEmployee
{
    public List<Employee> getAll();
    public  Employee getById(long id);
    public String insert (Employee employee);

    public  String update(long id ,Employee employee);

    public  String deleteById(Long id);

}
