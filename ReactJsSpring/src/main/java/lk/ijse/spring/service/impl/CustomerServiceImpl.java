package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDto;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveCustomer(CustomerDto dto) {
        if (!repo.existsById(dto.getCusid())) {
            repo.save(mapper.map(dto, Customer.class));
        } else {
            throw new RuntimeException("Customer Exist...!");
        }
    }

    @Override
    public void deleteCustomer(String id) {
       if(repo.existsById(id)) {
           repo.deleteById(id);
       } else {
           throw new RuntimeException("Please check the Customer ID... No Such Customer");
       }
    }

    @Override
    public void updateCustomer(CustomerDto dto) {
     if (repo.existsById(dto.getCusid())) {
         repo.save(mapper.map(dto, Customer.class));
     } else {
         throw new RuntimeException("No Such GustCustomer To Update..! Please Check the ID..!");
     }
    }

    @Override
    public CustomerDto searchCustomer(String id) {
        if (repo.existsById(id)) {
            return mapper.map(repo.findById(id).get(),CustomerDto.class);
        } else {
            throw new RuntimeException("No GuestCustomer For" + id + "..!");
        }

    }

    @Override
    public List<CustomerDto> getAllCustomer() {
        return mapper.map(repo.findAll(),new TypeToken<List<CustomerDto>>(){

        }.getType());
    }
}
