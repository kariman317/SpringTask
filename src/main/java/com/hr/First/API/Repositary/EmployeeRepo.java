package com.hr.First.API.Repositary;

import com.hr.First.API.Model.Employee;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeRepo implements IEmployee
{

     static  ArrayList<Employee> employees =new ArrayList<Employee>(Arrays.asList(
             new Employee(1,"name 1" , "name2" , 3650,"assuit" ,1),
             new Employee(2,"name 2" , "name3" , 3650,"assuit",1),
             new Employee(3,"name 3" , "name3" , 3650,"assuit",2),
             new Employee(4,"name 4" , "name4" , 3650,"assuit",2),
             new Employee(5,"name 5" , "name5" , 3650,"assuit",3)
     ));


    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public Employee getById( long id) {
        return employees.stream().filter(e -> e.getId() ==id)
                .findFirst().get();
    }

    @Override
    public String insert(Employee employee) {

        employees.add(employee);
        return "Successfully Added";
    }

    @Override
    public String update( long id , Employee employee) {
        employees.stream().filter(e-> e.getId() == id).
                forEach(e ->{
                    e.setFirstName(employee.getFirstName());
                    e.setLastName(employee.getLastName());
                    e.setSalary(employee.getSalary());
                    e.setSalary(employee.getSalary());
                });
        employees.add(employee);
        return "Updated Successfully";
    }

    @Override
    public String deleteById(Long id) {
        Employee employee = getById(id);
        employees.remove(employee);
        return "Removed Successfully";
    }
}
