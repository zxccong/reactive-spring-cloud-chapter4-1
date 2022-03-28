package person.zxccong.springdata.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * @author zxccong
 * @date 2022/3/27
 */
@Data
@Document
public class CustomerMongo {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String address;

    @Field("orders")
    private Collection<Order> orders = new LinkedHashSet<>();

}
