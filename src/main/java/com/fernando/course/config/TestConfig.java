package com.fernando.course.config;

import com.fernando.course.entities.UserEntity;
import com.fernando.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;
import java.util.List;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {

        // instâncias alguns registro para ajudar nos testes
        UserEntity user1 = new UserEntity(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        UserEntity user2 = new UserEntity(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        // adicionando os usuários a lista
        List<UserEntity> users = Arrays.asList(user1, user2);

        // salvar os dados no bando em memória
        repository.saveAll(users);
    }
}
