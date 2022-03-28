package person.zxccong.springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import person.zxccong.springdata.model.Customer;
import person.zxccong.springdata.model.CustomerMongo;

import java.util.List;

/**
 * @author zxccong
 * @date 2022/3/26
 */
@Service
public interface CustomerMongoRepository extends MongoRepository<CustomerMongo, String> {

    List<CustomerMongo> findByFirstName(String firstName);

    @Query("{'age':?0}")
    List<CustomerMongo> withQueryFindByAge(Integer age);

}
