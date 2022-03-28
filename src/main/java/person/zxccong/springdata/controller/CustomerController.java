package person.zxccong.springdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import person.zxccong.springdata.model.Customer;
import person.zxccong.springdata.repository.CustomerRepository;

import java.util.List;

/**
 * @author zxccong
 * @date 2022/3/26
 */
@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @PostMapping("/save")
    public Customer save(@RequestBody Customer customer) {

        Customer saveCustomer = customerRepository.save(customer);
        return saveCustomer;
    }

    @GetMapping("/address")
    public List<Customer> address(String address) {
        List<Customer> customers = customerRepository.findByAddress(address);
        return customers;
    }

    @GetMapping("/firstNameAndAddress")
    public Customer firstNameAndAddressQuery(String firstName, String address) {

        final Customer customer = customerRepository.findByFirstNameAndAddress(firstName, address);
        return customer;

    }

    @GetMapping("/addressNameQuery")
    public List<Customer> addressNameQuery(String address) {

        final List<Customer> customers = customerRepository.withAddressNamedQuery(address);
        return customers;

    }

    @GetMapping("/sort")
    public List<Customer> sort() {

        final List<Customer> customers = customerRepository.findAll(Sort.by(Sort.Direction.ASC, "age"));
        return customers;

    }

    @GetMapping("/page")
    public Page<Customer> page() {

        final Page<Customer> customers = customerRepository.findAll(PageRequest.of(1,1));
        return customers;

    }



}
