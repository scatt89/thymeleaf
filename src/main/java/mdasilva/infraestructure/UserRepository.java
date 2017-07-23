package mdasilva.infraestructure;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import mdasilva.domain.User;

@Repository
public class UserRepository {

    private List<User> users = new ArrayList<>();

    public UserRepository(){
        users.add(new User.Builder()
                .withAge(25)
                .withName("Antonio")
                .withShurName("Del pito")
                .withLastName("Rosado")
                .withNumberId(users.size())
                .build());
        users.add(new User.Builder()
                .withAge(52)
                .withName("Manuela")
                .withShurName("Carmena")
                .withLastName("Roja")
                .withNumberId(users.size())
                .build());
        users.add(new User.Builder()
                .withAge(75)
                .withName("Espeonza")
                .withShurName("Black")
                .withLastName("Aguirre")
                .withNumberId(users.size())
                .build());
        users.add(new User.Builder()
                .withAge(75)
                .withName("Susan")
                .withShurName("Hellen")
                .withLastName("OkeySi")
                .withNumberId(users.size())
                .build());
        users.add(new User.Builder()
                .withAge(25)
                .withName("Antonia")
                .withShurName("Leoncia")
                .withLastName("Poncia")
                .withNumberId(users.size())
                .build());
        users.add(new User.Builder()
                .withAge(52)
                .withName("Hunday")
                .withShurName("Orugo")
                .withLastName("Del mar")
                .withNumberId(users.size())
                .build());
        users.add(new User.Builder()
                .withAge(75)
                .withName("Paquito")
                .withShurName("Franco")
                .withLastName("Generalisimo")
                .withNumberId(users.size())
                .build());
        users.add(new User.Builder()
                .withAge(75)
                .withName("Susan")
                .withShurName("Lohisisteaposta")
                .withLastName("hahaha")
                .withNumberId(users.size())
                .build());
    }

    public List<User> findAll(){
        return users;
    }

    public User findById(int id){
        return users.stream()
                .filter(user -> user.getNumberId() == id)
                .findFirst()
                .get();
    }

    public User add(User user){
        User user2Add = new User.Builder()
                .withUserCopy(user)
                .withNumberId(users.size())
                .build();
        boolean adOk = users.add(user2Add);
        return adOk ? user2Add : null;
    }
}
