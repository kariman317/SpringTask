package com.hr.First.API.Controller;


import com.hr.First.API.Model.Department;
import com.hr.First.API.Model.Employee;
import com.hr.First.API.Repositary.IDepartment;
import com.hr.First.API.Repositary.IEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Department")
public class DepartmentController {

    @Autowired
    private IDepartment department;

    @GetMapping("/departments")
    public List<Department> getAll ()
    {
        return department.getAll();
    }

    @GetMapping("/getOne/{id}")

    public Department getOne(@PathVariable int id)
    {
        return department.getById(id);
    }

    @PostMapping("/add")
    public String  insert(@RequestBody Department dept)
    {
        return department.insert(dept);

    }

    @PutMapping("/update/{id}")
    public String update( @PathVariable int id , @RequestBody Department dept)
    {
        return department.update(id , dept);

    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id)
    {
        return department.deleteById(id);

    }

}
