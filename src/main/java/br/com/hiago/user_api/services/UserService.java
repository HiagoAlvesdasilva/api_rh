package br.com.hiago.user_api.services;

import br.com.hiago.user_api.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {

    User findById(Long id);
    List<User>findAll();

}
