package com.example.EmployeeService.Controller;

import com.example.EmployeeService.entity.Employee;
import com.example.EmployeeService.repo.EmployeeRepo;
import com.example.EmployeeService.response.EmployeeResponse;
import com.example.EmployeeService.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmpController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/employees/{id}")
    public ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable("id") int id){
        EmployeeResponse employeeResponse = employeeService.getEmployeeById(id);
        return ResponseEntity.status(HttpStatus.OK).body(employeeResponse);

    }
}
// it is not good practice to return directly Employee object(entity)
// to avoid that we are creating EmployeeResponse
// it is better to use ResponseEntity so we can manage status code as well along with response
