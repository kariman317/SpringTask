package com.hr.First.API.Controller;


import com.hr.First.API.Model.Employee;
import com.hr.First.API.Repositary.IEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Employee")
public class EmployeesController
{

    @Autowired
    private IEmployee employeeInterface;

    @GetMapping("/employees")
    public List<Employee> getAll ()
    {
        return employeeInterface.getAll();
    }

    @GetMapping("/getOne/{id}")

    public Employee getOne(@PathVariable long id)
    {
        return employeeInterface.getById(id);
    }

    @PostMapping("/add")
    public String  insert(@RequestBody Employee employee)
    {
       return employeeInterface.insert(employee);

    }

    @PutMapping("/update/{id}")
    public String update( @PathVariable long id , @RequestBody Employee employee)
    {
        return employeeInterface.update(id , employee);

    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable long id)
    {
        return employeeInterface.deleteById(id);

    }









}

