package person.zxccong.springdata.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import person.zxccong.springdata.model.Customer;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zxccong
 * @date 2022/3/26
 */
@Repository
public class CustomerRedisRepository {

    @Autowired
    RedisTemplate<Object, Object> redisTemplate;

    @Resource(name = "redisTemplate")
    ValueOperations<Object, Object> valueOperation;

    public void saveCustomer(Customer customer) {
        valueOperation.set(customer.getId(), customer);
    }

    public Customer getCustomer(){
        return (Customer) valueOperation.get("Customer001");
    }

}
