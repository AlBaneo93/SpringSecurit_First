package edu.security.first.repository;

import edu.security.first.vo.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

  Optional<Account> findByUsernameAndPassword(String username, String password);

  Optional<Account> findByUsername(String username);
}
