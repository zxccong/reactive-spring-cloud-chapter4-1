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
import person.zxccong.springdata.model.CustomerMongo;
import person.zxccong.springdata.repository.CustomerMongoRepository;
import person.zxccong.springdata.repository.CustomerRepository;

import java.util.List;

/**
 * @author zxccong
 * @date 2022/3/26
 */
@RestController
public class CustomerMongoController {

    @Autowired
    CustomerMongoRepository customerMongoRepository;

    @PostMapping("/save")
    public CustomerMongo save(@RequestBody CustomerMongo customerMongo) {

        return customerMongoRepository.save(customerMongo);
    }

    @GetMapping("/findByFirstName")
    public List<CustomerMongo> findByFirstName(String firstName) {
        List<CustomerMongo> customers = customerMongoRepository.findByFirstName(firstName);
        return customers;
    }

    @GetMapping("/withQueryFindByAge")
    public List<CustomerMongo> withQueryFindByAge(Integer age) {
        List<CustomerMongo> customers = customerMongoRepository.withQueryFindByAge(age);
        return customers;
    }

}
