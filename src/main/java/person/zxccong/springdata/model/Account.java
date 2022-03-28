package person.zxccong.springdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zxccong
 * @date 2022/3/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String userName;
    private String firstName;
    private String lastName;
}
