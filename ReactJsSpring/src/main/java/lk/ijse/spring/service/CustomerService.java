package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

     void saveCustomer(CustomerDto dto);

     void  deleteCustomer(String id);

     void updateCustomer(CustomerDto dto);

     CustomerDto searchCustomer(String id);

     List<CustomerDto> getAllCustomer();
}
