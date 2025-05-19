package br.com.hiago.user_api;

import br.com.hiago.user_api.domain.User;
import br.com.hiago.user_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepositiry;

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        userRepositiry.saveAll(List.of(
                new User(null,"Teste", "email@teste", "senha123",20),
                new User(null,"Teste01", "email@teste", "senha123",29)
        ));

    }
}
