package com.example.EmployeeService.feighn;

import com.example.EmployeeService.response.AddressResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//without LB
//@FeignClient(name="abc",url="http://localhost:8080/"path="/address-service/api")//baseUrl and name for feignclient

//with LB
@FeignClient(name="address-service",path="/address-service/api/")
@RibbonClient(name="address-service")
public interface AddressClient {//proxy
    // we dont have to create class for this interface spring will automatically do that thats why it called proxy
    @GetMapping("/address/{id}")
    ResponseEntity<AddressResponse> getAddressInfoByEmployeeId(@PathVariable("id") int id);
}
