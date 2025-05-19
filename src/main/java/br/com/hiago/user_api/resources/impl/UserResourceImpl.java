package br.com.hiago.user_api.resources.impl;

import br.com.hiago.user_api.domain.User;
import br.com.hiago.user_api.resources.UserResource;
import br.com.hiago.user_api.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/users")
public class UserResourceImpl implements UserResource {

    @Autowired
    private final UserService userService;

    public UserResourceImpl(UserService userService) {
        this.userService = userService;
    }


    @Override
    public ResponseEntity<User> findById(Long id) {
        return ResponseEntity.ok(userService.findById(id));
    }

    @Override
    public ResponseEntity<List<User>> findAll() {
        List<User> users = userService.findAll();
        return ResponseEntity.ok(users);
    }
}
