package org.FelipeBert.diospring.repository;

import org.FelipeBert.diospring.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public void save(User user){
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(user);
    }
    public void update(User user){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(user);
    }
    public void remove(Integer id){
        System.out.printf("DELETE/id - Recebendo o id: %d para excluir um usuário%n", id);
        System.out.println(id);
    }
    public List<User> listAll(){
        List<User> user = new ArrayList<>();
        user.add(new User("gleyson","password"));
        user.add(new User("frank","masterpass"));
        return user;
    }
    public User finById(Integer id){
        System.out.printf("GET/id - Recebendo o id: %d para localizar um usuário%n", id);
        return new User("gleyson","password");
    }
}
