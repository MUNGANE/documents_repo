package com.example.EmployeeService.service;

import com.example.EmployeeService.entity.Employee;
import com.example.EmployeeService.feighn.AddressClient;
import com.example.EmployeeService.repo.EmployeeRepo;
import com.example.EmployeeService.response.AddressResponse;
import com.example.EmployeeService.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    RestTemplate restTemplate;
    @Value("${AddressService.base.url}")
    String BaseUrl ;
    @Autowired//spring will automatically create implementation of AddressClient class and inject bean here
    AddressClient addressClient;

    public EmployeeResponse getEmployeeById(int id){
        Employee employee = employeeRepo.findById(id).get();
        EmployeeResponse employeeResponse=modelMapper.map(employee, EmployeeResponse.class);
        ResponseEntity<AddressResponse> addressResponseEntity= addressClient.getAddressInfoByEmployeeId(id);
        AddressResponse addressResponse = addressResponseEntity.getBody();
        employeeResponse.setAddressResponse(addressResponse);
        return employeeResponse;
    }
}
//ModelMapper - we use modelmapper to convert our employee data to EmployeeResponse data
//if we do it manually it will take lot of time.