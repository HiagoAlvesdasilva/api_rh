package br.com.hiago.user_api.repositories;

import br.com.hiago.user_api.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositiry extends JpaRepository <User, Long> {

}
