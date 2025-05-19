package br.com.hiago.user_api.services.impl;

import br.com.hiago.user_api.domain.User;
import br.com.hiago.user_api.repositories.UserRepository;
import br.com.hiago.user_api.services.UserService;
import br.com.hiago.user_api.services.exceptions.ObjectNotFoundException;
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
        return userRepository.findById(id).orElseThrow(()-> new ObjectNotFoundException("Objetc not found"));
    }

    @Override
    public List<User> findAll() {
       return userRepository.findAll();
    }
}
