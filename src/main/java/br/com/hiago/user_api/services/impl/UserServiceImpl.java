package br.com.hiago.user_api.services.impl;

import br.com.hiago.user_api.domain.User;
import br.com.hiago.user_api.repositories.UserRepository;
import br.com.hiago.user_api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> findAll() {
        List<User> users = userRepository.findAll();
        System.out.println("Usuarios no banco: "+ users);
        return users;
//        return userRepository.findAll();
    }
}
