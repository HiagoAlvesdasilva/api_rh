package br.com.hiago.user_api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name = "TB_USER")
public class User {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private double hourlyPrice;

    public User(Long id, String name, String email, String password, double hourlyPrice) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.hourlyPrice = hourlyPrice;
    }
    public User() {
    }
}
