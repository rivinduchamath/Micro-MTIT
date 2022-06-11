package lk.sliit.mtit.micro.department.controller;


import lk.sliit.mtit.micro.department.entity.Department;
import lk.sliit.mtit.micro.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){

        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartment(@PathVariable ("id") Long id){
        return departmentService.findDepartmentId(id);
    }
}
