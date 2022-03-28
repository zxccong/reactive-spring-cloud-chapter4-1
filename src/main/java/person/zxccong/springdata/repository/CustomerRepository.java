package person.zxccong.springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import person.zxccong.springdata.model.Customer;

import java.util.List;

/**
 * @author zxccong
 * @date 2022/3/26
 */
@Service
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByAddress(String address);

    Customer findByFirstNameAndAddress(String firstName, String address);

    @Query("select c from Customer c where c.firstName= :firstName and c.address = :address")
    Customer withFirstNameAndAddressQuery(@Param("firstName") String firstName, @Param("address") String address);

    List<Customer> withAddressNamedQuery(String address);
}
