package person.zxccong.springdata.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import person.zxccong.springdata.model.Account;

import java.util.List;
import java.util.function.Function;

/**
 * @author zxccong
 * @date 2022/3/25
 */
public interface AccountRepository /*extends JpaRepository<Account, Long>*/ {

    @Query("select  a  from Account a where a.userName =?1")
    Account findByUserName(String userName);

    List<Account> findByFirstNameAndLastName(String firstName, String lastName);

    Page<Account> findByFirstName(String firstName, Pageable pageable);

    <S extends Account, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}
