package com.hr.First.API.Repositary;

import com.hr.First.API.Model.Department;
import com.hr.First.API.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DepartmentRepo implements IDepartment{
    static ArrayList<Department> departments =new ArrayList<Department>(Arrays.asList(
           new Department(1,"SD"),
            new Department(2,"PWD"),
            new Department(3,"BI")
    ));


    @Override
    public List<Department> getAll() {
        return departments;
    }

    @Override
    public Department getById(int id) {
        return departments.stream().filter(d -> d.getId() == id)
                .findFirst().get();
    }

    @Override
    public String insert(Department department) {
        departments.add(department);
        return "Successfully Added";
    }

    @Override
    public String update(int id, Department department) {
        departments.stream().filter(d -> d.getId() == id).
                forEach(d ->{ d.setName(department.getName());

                });
        departments.add(department);
        return "Updated Successfully";
    }

    @Override
    public String deleteById(int id) {
        Department department = getById(id);
        departments.remove(department);
        return "Removed Successfully";
    }

}
